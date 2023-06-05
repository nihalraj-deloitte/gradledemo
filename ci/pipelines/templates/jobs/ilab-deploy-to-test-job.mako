<%namespace file="../ilab-functions.mako" import="*"/>
<%page args="input_artifact_build_step='pipeline-output-staging', passed_jobs=['promote-to-staging']"/>
<%text>
#########################################################
# Deploy to staging environment in k8s
#########################################################
</%text>
- name: deploy-to-test
  build_log_retention: *build-log-retention-config
  serial: true
  plan:
  - in_parallel:
    - get: common-ci
    - get: input-artifacts
      resource: ${input_artifact_build_step}
      passed:
      % for value in passed_jobs:
        - ${value}
      % endfor
      trigger: true

<%block filter="indent">
<%include file="tasks/ilab-create-openshift-kubeconfig-task.mako" args="log_folder='create-kubeconfig-staging-logs', output_artifacts='staging-kubectl'"/>
<%include file="tasks/ilab-download-deploy-folder-task.mako"/>
<%include file="tasks/ilab-deploy-task.mako" args="app_name='hbx-eligibility-service', war_name='HbxEligibilityServices'"/>
<%include file="tasks/ilab-deploy-task.mako" args="app_name='hbx-prescreening-services', war_name='HbxPreScreeningServices'"/>
<%include file="tasks/ilab-deploy-task.mako" args="app_name='hbx-maxaptcamount-services', war_name='HbxMaxAptcAmountServices'"/>
<%include file="tasks/ilab-deploy-task.mako" args="app_name='hbx-documentrequest-services', war_name='HbxDocumentRequestServices'"/>
<%include file="tasks/ilab-deploy-task.mako" args="app_name='hbx-shoppingflowrestriction-services', war_name='HbxShoppingFlowRestrictionServices'"/>
<%include file="tasks/ilab-deploy-task.mako" args="app_name='hbx-specialenrollment-services', war_name='HbxSpecialEnrollmentServices'"/>
</%block>
  on_success:
    do:
      - put: devops-alerts-broadcast
        inputs:
          - input-artifacts
        params:
          title: ((pipeline_name))
          subtitle: Success Notification
          message_type: INFO
          message: Test/Staging deployment successful
          message_file: input-artifacts/version/full-version.txt
  on_failure:
    do:
      - put: devops-alerts-broadcast
        inputs:
          - input-artifacts
        params:
          title: ((pipeline_name))
          subtitle: Failure Notification
          message_type: ERROR
          message: Test/Staging deployment failed
          message_file: input-artifacts/version/full-version.txt
  ensure:
    # Capture & Store Pipeline output
    put: pipeline-output-staging
    params:
      upload_dirs:
        - staging-kubectl/create-kubeconfig-staging-logs
      version_file: input-artifacts/version/full-version.txt
      build_step: deploy-to-test
      