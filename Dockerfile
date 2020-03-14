# To get the base image for the java project from the docker hub
FROM openjdk:8-jdk-alpine

# Create a mount point with a specific name
VOLUME /tmp

# Make port 8080 available to the world outside this container
EXPOSE 8080

# The arguments given to the docker build command
ARG JAR_FILE=target/Indigo-0.0.1.jar

ADD ${JAR_FILE} Indigo-0.0.1.jar

# The command line arg that is ran to start the process in the docker container
ENTRYPOINT ["java","-jar","/Indigo-0.0.1.jar"]
