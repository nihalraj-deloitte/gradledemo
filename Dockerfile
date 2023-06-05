# syntax = docker/dockerfile:1.0-experimental
FROM sbe-docker-release.art.tools.deloitteinnovation.us/jboss-eap-7/eap73-openjdk11-openshift-rhel8
USER root
# Environment Setup
ENV DISABLE_EMBEDDED_JMS_BROKER true
ENV DB_JNDI java:/PostgresDS
ENV DB_POOLNAME PostgresDS
ENV DB_URL jdbc:postgresql://localhost:5432/postgres
ENV DB_DRIVER_CLASS org.postgresql.Driver
ENV DB_DRIVER postgresql
ENV DB_USERNAME username
ENV DB_PASSWORD password
ENV ENCRYPTION_KEY encryption_key
ENV ARTIFACTORY_USERNAME art_username
ENV ARTIFACTORY_PASSWORD art_password
ENV WAR_NAME test
ENV LOG_LEVEL_STDOUT_CONSOLE WARN
ENV LOG_LEVEL_ROOT WARN

ARG JFROG_MAJOR_VERSION=v1
ARG JFROG_VERSION=1.34.1
ARG JFROG_BASE_URL=https://releases.jfrog.io/artifactory/jfrog-cli
ARG JFROG_DOWNLOAD_URL=${JFROG_BASE_URL}/${JFROG_MAJOR_VERSION}/${JFROG_VERSION}/jfrog-cli-linux-amd64/jfrog

ARG FULL_VERSION

#create temp directory
RUN mkdir -p $JBOSS_HOME/tempwar

#Creating directory for datadog java agent jar
RUN mkdir -p /opt/ddjavaagent

RUN chgrp -R 0 $JBOSS_HOME/tempwar && \
    chmod -R g=u $JBOSS_HOME/tempwar

# Copy the modules
#RUN mkdir -p $JBOSS_HOME/modules/org/postgresql/main
#COPY Deployment/module.xml $JBOSS_HOME/modules/org/postgresql/main/module.xml
#COPY --chown=185:0 Deployment/configuration/standalone-openshift.xml $JBOSS_HOME/standalone/configuration

# Jboss Configuration Repo
RUN mkdir -p $JBOSS_HOME/HBX-Config-Files/HbxEligibilityServiceConfig-1.0

# Custom module for JNDI password encryption
#RUN mkdir -p $JBOSS_HOME/modules/com/jndi/encryption/main
#COPY Deployment/encryptionModule/module.xml $JBOSS_HOME/modules/com/jndi/encryption/main/module.xml

# Jboss Local Repo
RUN mkdir -p $JBOSS_HOME/localRepo/com/deloitteinnovation/us/hbx

#Jfrog cli
RUN curl -L -k "${JFROG_DOWNLOAD_URL}" -o /usr/local/bin/jfrog && \
    chmod -R a+rwx /usr/local/bin/jfrog &&\
    chmod -R a+rwx $JBOSS_HOME/localRepo/ &&\
    chmod -R a+rwx $JBOSS_HOME/standalone/ && \
    chgrp -R 0 $JBOSS_HOME/HBX-Config-Files/HbxEligibilityServiceConfig-1.0 && \
    chmod -R g=u $JBOSS_HOME/HBX-Config-Files/HbxEligibilityServiceConfig-1.0
    
#Download artifact to deployment folder
#RUN --mount=type=secret,id=username --mount=type=secret,id=password jfrog rt config --interactive=false --url https://art.tools.deloitteinnovation.us/artifactory --user $(cat /run/secrets/username) --password $(cat /run/secrets/password) artifactory \
      #&& jfrog rt dl --recursive=false --flat=true sbe-gradle-libs-release/org/postgresql/postgresql/42.2.18/postgresql-42.2.18.jar $JBOSS_HOME/modules/org/postgresql/main/postgresql-42.2.18.jar \
      #&& jfrog rt dl --recursive=false --flat=true sbe-gradle-libs-release/org/jasypt/jasypt/1.9.3/jasypt-1.9.3.jar $JBOSS_HOME/modules/com/jndi/encryption/main/jasypt-1.9.3.jar \
      #&& jfrog rt dl --recursive=false --flat=true sbe-gradle-libs-release/com/datadoghq/dd-java-agent/0.102.0/dd-java-agent-0.102.0.jar /opt/ddjavaagent/dd-java-agent.jar \
      #&& jfrog rt dl --recursive=false --flat=true sbe-gradle-libs-release-local/com/deloitteinnovation/us/hbx/hbx-framework/0.15.4/hbx-framework-0.15.4.jar $JBOSS_HOME/modules/com/jndi/encryption/main/hbx-framework-0.15.4.jar \
      #&& jfrog rt dl --recursive=false --flat=true sbe-gradle-libs-scratch-local/com/deloitteinnovation/us/hbx/HbxBusinessObjects/maven-metadata.xml $JBOSS_HOME/localRepo/com/deloitteinnovation/us/hbx/HbxBusinessObjects/maven-metadata-local.xml  \
      #&& jfrog rt dl --recursive=false --flat=true sbe-gradle-libs-scratch-local/com/deloitteinnovation/us/hbx/HbxBusinessObjects/1.0/HbxBusinessObjects-1.0.jar $JBOSS_HOME/localRepo/com/deloitteinnovation/us/hbx/HbxBusinessObjects/1.0/HbxBusinessObjects-1.0.jar  \
      #&& jfrog rt dl --recursive=false --flat=true sbe-gradle-libs-scratch-local/com/deloitteinnovation/us/hbx/HbxBusinessObjects/1.0/HbxBusinessObjects-1.0.pom $JBOSS_HOME/localRepo/com/deloitteinnovation/us/hbx/HbxBusinessObjects/1.0/HbxBusinessObjects-1.0.pom  \
      #&& jfrog rt dl --recursive=false --flat=true sbe-gradle-libs-scratch-local/com/deloitteinnovation/us/hbx/HbxQhpQdpRules/maven-metadata.xml $JBOSS_HOME/localRepo/com/deloitteinnovation/us/hbx/HbxQhpQdpRules/maven-metadata-local.xml  \
      #&& jfrog rt dl --recursive=false --flat=true sbe-gradle-libs-scratch-local/com/deloitteinnovation/us/hbx/HbxQhpQdpRules/1.0/HbxQhpQdpRules-1.0.jar $JBOSS_HOME/localRepo/com/deloitteinnovation/us/hbx/HbxQhpQdpRules/1.0/HbxQhpQdpRules-1.0.jar  \
      #&& jfrog rt dl --recursive=false --flat=true sbe-gradle-libs-scratch-local/com/deloitteinnovation/us/hbx/HbxQhpQdpRules/1.0/HbxQhpQdpRules-1.0.pom $JBOSS_HOME/localRepo/com/deloitteinnovation/us/hbx/HbxQhpQdpRules/1.0/HbxQhpQdpRules-1.0.pom  \
      #&& jfrog rt dl --recursive=false --flat=true sbe-gradle-libs-scratch-local/com/deloitteinnovation/us/hbx/HbxAptcMagiRules/maven-metadata.xml $JBOSS_HOME/localRepo/com/deloitteinnovation/us/hbx/HbxAptcMagiRules/maven-metadata-local.xml  \
      #&& jfrog rt dl --recursive=false --flat=true sbe-gradle-libs-scratch-local/com/deloitteinnovation/us/hbx/HbxAptcMagiRules/1.0/HbxAptcMagiRules-1.0.jar $JBOSS_HOME/localRepo/com/deloitteinnovation/us/hbx/HbxAptcMagiRules/1.0/HbxAptcMagiRules-1.0.jar  \
      #&& jfrog rt dl --recursive=false --flat=true sbe-gradle-libs-scratch-local/com/deloitteinnovation/us/hbx/HbxAptcMagiRules/1.0/HbxAptcMagiRules-1.0.pom $JBOSS_HOME/localRepo/com/deloitteinnovation/us/hbx/HbxAptcMagiRules/1.0/HbxAptcMagiRules-1.0.pom  \
    #   && jfrog rt dl --recursive=false --flat=true sbe-gradle-libs-scratch-local/com/deloitteinnovation/us/hbx/HbxEligibilityServices/${FULL_VERSION}/HbxEligibilityServices-${FULL_VERSION}.war $JBOSS_HOME/tempwar/HbxEligibilityServices.war  \
    #   && rm -rf /root/.jfrog

# Modify owners war
RUN chown jboss:jboss $JBOSS_HOME/tempwar/

## permission for datadog agent jar
#RUN chgrp -R 0 /opt/ddjavaagent/ && \
    #chmod -R g=u /opt/ddjavaagent/

# copying java's cacert to other location to import RDS ssl certificate
# RUN mkdir -p /certs/java-ca/
# RUN JAVA_DIR=$(readlink -f $(which java)) && \
#     JAVA_SECURITY_HOME=$(echo ${JAVA_DIR%bin*})lib/security && \
#     cp $JAVA_SECURITY_HOME/cacerts /certs/java-ca/cacerts
# RUN chmod 777 /certs/java-ca/cacerts

# entrypoint.sh to add import the certificate in cacert
# COPY scripts/entrypoint.sh /opt/entrypoint.sh
# RUN chmod +x /opt/entrypoint.sh
# ENTRYPOINT /opt/entrypoint.sh

## Important, use jboss user to run image
USER jboss