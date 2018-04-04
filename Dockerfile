FROM airhacks/glassfish
COPY ./target/dobl-test.war ${DEPLOYMENT_DIR}
