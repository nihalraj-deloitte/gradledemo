<%namespace file="../../ilab-functions.mako" import="*"/>
<%page args="app_name='hbx-eligibility-service', war_name='HbxEligibilityServices'"/>
<%text>
# Generate a kubeconfig file.
</%text>
- put: deploy${app_name}
  resource: k8s-staging
  inputs:
      - staging-kubectl
      - input-artifacts
      - source-code
  params:
      kubeconfig_path: staging-kubectl/config
      namespace: ((staging.target-namespace))
      release: ${app_name}
      chart: ((helm-repo-release))/((helm-chart.name))
      version: ((helm-chart.version))
      wait_until_ready: ((helm-chart.staging.timeout)) # number of seconds to use with helm --timeout
      check_is_ready: true # use helm --wait
      force: false # disable --force for Helm 3.x to avoid issue with deploying from a new version of the chart
      values:
        # A list of files from which to pull additional values
      % for value in get_list(params,'helm-chart/common/value-files'):
        - ${value}
      % endfor
        # A list of files from which to pull additional values
      % for value in get_list(params,'helm-chart/staging/value-files'):
        - ${value}
      % endfor
      override_values:
        # The version of the docker container to deploy
      % for value in get_list(params,'helm-chart/key-names/service-container-image-tag'):
      - key: ${value}
        path: input-artifacts/version/full-version.txt
      %endfor
        # Common Helm Chart Parameters, which will appear in the logs
      % for key, value in get_dict(params,'helm-chart/common/parameters').items():
      - key: ${key}
        value: ${value}
      % endfor
        # Functional Test Helm Chart Parameters, which will appear in the logs
      % for key, value in get_dict(params,'helm-chart/staging/parameters').items():
      - key: ${key}
        value: ${value}
      % endfor
        # Common Helm Chart Secret Values, which need to be hidden from logs
      % for key, value in get_dict(params,'helm-chart/common/secrets').items():
      - key: ${key}
        value: ${value}
        hide: true
      % endfor
        # Functional Test Helm Chart Secret Values, which need to be hidden from logs
      % for key, value in get_dict(params,'helm-chart/staging/secrets').items():
      - key: ${key}
        value: ${value}
        hide: true
      % endfor
      - key: war.name
        value: ${war_name}
      - key: fullnameOverride
        value: ${app_name}
% if get_boolean(params,'helm-chart/staging/perform-helm-test'):
# Execute Tests that are baked into the Helm Chart
- put: perform-helm-tests
  resource: k8s-staging
  inputs:
      - staging-kubectl
  params:
      kubeconfig_path: staging-kubectl/config
      chart: ((helm-repo-release))/((helm-chart.name))
      version: ((helm-chart.version))
      namespace: ((staging.target-namespace))
      release: ${app_name}
      test: true
% endif