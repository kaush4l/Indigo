# docker different base images for running using 
# java 105mb
FROM openjdk:8-jdk-alpine

# gralde 230mb
# FROM gradle:jre8

# Volume used to store the data generated in the image
VOLUME /data
# Make port 8080 available to the world outside this container
EXPOSE 8080

# # Running them using
# # Java (build jar outside)
ARG JAR_FILE=target/Indigo-0.0.1.jar
ADD ${JAR_FILE} Indigo-0.0.1.jar
ENTRYPOINT ["java","-jar","Indigo-0.0.1.jar"]

# for building inside docker using gradle
# COPY /src/main /src/main

# Build application using
# using gradle
# COPY build.gradle build.gradle
# COPY settings.gradle settings.gradle
# RUN gradle clean build
# CMD ["gradle", "bootRun"]
