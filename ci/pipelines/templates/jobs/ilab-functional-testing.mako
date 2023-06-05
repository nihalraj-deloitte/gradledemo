<%namespace file="/templates/ilab-functions.mako" import="*"/>
<%page args="functional_test_name='functional-testing', functional_path='ci/tasks/test/qa-functional-tests.yml', ephemeral_environment=False, passed_jobs=['integration-testing'],input_artifact_build_step='integration-testing', docker_image_name=''"/>
<%text>
#########################################################
# Automated Functional tests
#########################################################
</%text>
- name: ${functional_test_name}
  build_log_retention: *build-log-retention-config
  plan:
  - in_parallel:
    - get: input-artifacts
      resource: pipeline-output-scratch
      params:
        build_step: ${input_artifact_build_step}

    - get: source-code
      passed:
         % for value in passed_jobs:
        - ${value}
      % endfor
      trigger: true
    - get: common-ci
	%if get_boolean(params, "docker/tests/functional/use_image") and has_value(docker_image_name):
    - get: ${docker_image_name}
      params:
        build_step: ${input_artifact_build_step}
    %endif
  # For static functional tests
  %if not ephemeral_environment:
<%block filter="indent">
  <%include file="tasks/ilab-perform-test-automation-task.mako" args="test_type='functional', ephemeral_environment=False, docker_image_name=''"/>
</%block>
  ensure:  
    try:
      put: pipeline-output-scratch
      inputs:
        - test-output
        - input-artifacts
      params:
        upload_dirs:
          - test-output/functional-testing-logs
          - test-output/functional-reports
        version_file: input-artifacts/version/full-version.txt
        build_step: ${functional_test_name}
  # For automated functional tests with ephemeral instance

  %else:
<%block filter="indent">
  <%include file="tasks/ilab-create-openshift-kubeconfig-task.mako" args="log_folder='create-kubeconfig-functional-logs', output_artifacts='functional-kubectl'"/>
  <%include file="tasks/ilab-generate-functional-parameters-task.mako"/>
  <%include file="tasks/ilab-deploy-ephemeral-instance-put.mako"/>
  <%include file="tasks/ilab-perform-helm-tests-put.mako"/>
  <%include file="tasks/ilab-perform-test-automation-task.mako" args="test_type='functional', ephemeral_environment=True"/>
</%block>
  ensure:
    in_parallel:
    - put: destroy-ephemeral-instance
      resource: k8s-functional
      inputs:
        - generate-functional-parameters
        - functional-kubectl
      params:
        kubeconfig_path: functional-kubectl/config
        namespace: ((functional-test.target-namespace))
        release: generate-functional-parameters/functional-testing/release_name.txt
        delete: true
    - put: pipeline-output-scratch
      params:
        upload_dirs:
          - functional-kubectl/create-kubeconfig-functional-logs
          - generate-functional-parameters/functional-testing
          - test-output/qa-functional-tests-logs
          - test-output/functional-reports
        version_file: input-artifacts/version/full-version.txt
        build_step: ${functional_test_name}
  %endif
  on_failure: *bitbucket-build-status-failed
