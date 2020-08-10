#!/bin/bash

# $(git clone https://github.com/kaush4l/Indigo/)
# $(git clone https://github.com/kaush4l/Indigo_client/)

# Enforcing pre commit hooks to run tests before pushing
echo "Copying files to enforce git hooks."
cp hooks/pre-commit .git/hooks/pre-commit

# Checking for Java installation
echo "----------------------------------------JAVA----------------------------------------"
JAVA=$(java -version)
if [ $? -eq 0 ] then
    echo "Java is present. make sure version is 1.8."
else
    echo "Java has not been installed yet."
fi
echo "----------------------------------------JAVA----------------------------------------"

# BUILD = $(.mvnw clean install) # Maven build
BUILD=$(./gradlew clean build) # Gradle build
if [ $? -eq 0 ] then
    echo "build is done and subsequent builds will be faster with gradlew."
else
    echo "Can use either ./gradlew or ./mvnw files for the builds."
fi

# Check if docker is installed
echo "----------------------------------------DOCKER----------------------------------------"
DOCKER=$(docker -v)
if [ $? -eq 0 ]
then
    echo "Docker is installed."
else
    echo "Project is Dockerized. So, good to have but not necessary."
fi
echo "----------------------------------------DOCKER----------------------------------------"
