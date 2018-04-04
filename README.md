# Build
mvn clean package && docker build -t da.ertl/dobl-test .

# RUN

docker rm -f dobl-test || true && docker run -d -p 8080:8080 -p 4848:4848 --name dobl-test da.ertl/dobl-test 