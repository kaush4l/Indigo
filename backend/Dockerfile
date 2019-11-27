# To get the base image for the java project from the docker hub
FROM openjdk:8-jdk-alpine

# Create a mount point with a specific name
# VOLUME /tmp

# The arguments given to the docker build command
# ARG JAR_FILE

# ADD ${JAR_FILE} app.jar


COPY ./target app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]