<%namespace file="../../ilab-functions.mako" import="*"/>
<%page args="log_folder='create-kubeconfig-functional-logs', output_artifacts='functional-kubectl' "/>
<%text>
# Generate a kubeconfig file.
</%text>
- task: create-os-kubeconfig
  file: common-ci/tasks/openshift/openshift-kubeconfig.yml
  vars:
    repository: ((pipeline.manifest.openshift_oc_tools.repository))
    tag: ((pipeline.manifest.openshift_oc_tools.tag))
  params:
    LOG_FOLDER: output-artifacts/${log_folder}
    OPENSHIFT_URL: ${get_string(params,'openshift/url')}
    OPENSHIFT_USERNAME: ((svc-concourse-user))
    OPENSHIFT_PASSWORD: ((svc-concourse-password))
    TARGET_PATH: config
    SKIP_TLS_VERIFY: ${get_boolean(params, 'openshift/skip_tls_verify', False)}
    LOG_FILE_NAME: openshift_kubeconfig.log
  output_mapping:
    output-artifacts: ${output_artifacts}