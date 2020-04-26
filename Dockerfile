# docker different base images for running using 
FROM openjdk:8-jdk-alpine

# Docker gralde image 230mb
# FROM gradle:jre8

# Volume used to store the data generated in the image
VOLUME /data
# Make port 8080 available to the world outside this container
EXPOSE 8080

# # Running using jar for Dev
ARG JAR_FILE=build/libs/Indigo-0.0.1.jar
ADD ${JAR_FILE} Indigo-0.0.1.jar
ENTRYPOINT ["java","-jar","Indigo-0.0.1.jar"]

# (2) 4for building inside docker using gradle
# COPY /src/main /src/main

# Build and run the application for production
# COPY build.gradle build.gradle
# COPY settings.gradle settings.gradle
# RUN gradle build
# CMD ["gradle", "bootRun"]
