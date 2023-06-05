<%namespace file="../../ilab-functions.mako" import="*"/>
<%text>
# Deploy a service instance to an ephemeral environment.
</%text>
- put: deploy-ephemeral-instance
  resource: k8s-functional
  inputs:
    - generate-functional-parameters
    - functional-kubectl
    - input-artifacts
    - source-code
  params:
    kubeconfig_path: functional-kubectl/config
    namespace: ((functional-test.target-namespace))
    release: generate-functional-parameters/functional-testing/release_name.txt
    chart: ((helm-repo-release))/((helm-chart.name))
    version: ((helm-chart.version))
    wait_until_ready: ((helm-chart.functional-test.timeout)) # number of seconds to use with helm --timeout
    check_is_ready: true # use helm --wait
    wait: 60 # wait for 60 seconds before moving to next task
    force: false # disable --force for Helm 3.x to avoid issue with deploying from a new version of the chart
    devel: true
    values:
      # A list of files from which to pull additional values
    % for value in get_list(params,'helm-chart/common/value-files'):
      - ${value}
    % endfor
    <%text>
      # A list of files from which to pull additional values
    </%text>
    % for value in get_list(params,'helm-chart/functional-test/value-files'):
      - ${value}
    % endfor
    override_values:
      # The version of the docker container to deploy
    % for value in get_list(params,'helm-chart/key-names/service-container-image-tag'):
    - key: ${value}
      path: input-artifacts/version/full-version.txt
    % endfor
      # Values for an ephemeral deployment
    % for value in get_list(params,'helm-chart/key-names/service-environment'):
    - key: ${value}
      path: generate-functional-parameters/functional-testing/environment_name.txt
    % endfor
      # Common Helm Chart Parameters, which will appear in the logs
    % for key, value in get_dict(params,'helm-chart/common/parameters').items():
    - key: ${key}
      value: ${value}
    % endfor
      # Functional Test Helm Chart Parameters, which will appear in the logs
    % for key, value in get_dict(params,'helm-chart/functional-test/parameters').items():
    - key: ${key}
      value: ${value}
    % endfor
      # Common Helm Chart Secret Values, which need to be hidden from logs
    % for key, value in get_dict(params,'helm-chart/common/secrets').items():
    - key: ${key}
      value: ${value}
      hide: true
    % endfor
    - key: war.name
      value: HbxEligibilityServices
      # Functional Test Helm Chart Secret Values, which need to be hidden from logs
   # % for key, value in get_dict(params,'helm-chart/functional-test/secrets').items():
    #-key: ${key}
    #  value: ${value}
     # hide: true
    #% endfor
