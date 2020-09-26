# docker different base images for running using 
# java 105mb
FROM openjdk:8-jdk-alpine

# Below images not needed as both Maven/Gradle provide dynamic run scripts
# (2) gralde 230mb
# FROM gradle:jre8

# Removed maven support
# maven 220mb
# FROM maven:3.6.3-jdk-8-openj9
# using maven
# COPY pom.xml pom.xml
# COPY .mvn .mvn
# COPY mvnw mvnw
# RUN ./mvnw clean install
# CMD ["./mvnw", "spring-boot:run"] 

# Volume used to store the data generated in the image
VOLUME /data
# Make port 8080 available to the world outside this container
EXPOSE 8080

# # Running them using
# # (1) Java (build jar outside)
# Since already built, can use jar file to run directly
ARG JAR_FILE=target/Indigo-0.0.1.jar
ADD ${JAR_FILE} Indigo-0.0.1.jar
ENTRYPOINT ["java","-jar","Indigo-0.0.1.jar"]

# Build application using

# for building inside docker using gradle
# COPY /src/main /src/main

# using gradle
# COPY build.gradle build.gradle
# COPY settings.gradle settings.gradle
# COPY gradle gradle
# COPY gradlew gradlew
# RUN ./gradlew build
# CMD ["./gradlew", "bootRun"]
