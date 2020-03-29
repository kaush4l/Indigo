# docker different base images for running using 
# (1) java 105mb
# FROM openjdk:8-jdk-alpine

# (2) maven 220mb
FROM maven:3.6.3-jdk-8-openj9 

# (3) gralde 230mb
# FROM gradle:jre8

# Create a mount point with a specific name
VOLUME /tmp
# Make port 8080 available to the world outside this container
EXPOSE 8080

# # Running them using
# # (1) Java (build jar outside)
# ARG JAR_FILE=target/Indigo-0.0.1.jar
# ADD ${JAR_FILE} Indigo-0.0.1.jar
# ENTRYPOINT ["java","-jar","target/Indigo-0.0.1.jar"]

# (2) (3) for building inside docker using maven/gradle
COPY /src/main /src/main

# The arguments given to the docker build command
# (2) using maven
COPY pom.xml pom.xml
RUN mvn clean install
CMD ["mvn", "spring-boot:run"]

# (3) using gradle
# COPY build.gradle build.gradle
# COPY settings.gradle settings.gradle
# RUN gradle clean build
# CMD ["gradle", "bootRun"]
