#!/bin/bash

$(git clone https://github.com/kaush4l/Indigo/)
$(git clone https://github.com/kaush4l/Indigo_client/)


# Enforcing pre commit hooks to run tests before pushing
echo "Copying files to enforce git hooks."
cp Indigo/hooks/pre-commit Indigo/.git/hooks/pre-commit

# Checking for Java installation
echo "----------------------------------------JAVA----------------------------------------"
JAVA=$(java -version)
if [ $? -eq 0 ]
then
    echo "Java is present. Make sure version is 1.8."
else
    echo "Looks like java is missing!!!"
fi
echo "----------------------------------------JAVA----------------------------------------"

# Check if gradle is installed
echo "----------------------------------------GRADLE----------------------------------------"

GRADLE=$(gradle -v)
if [ $? -eq 0 ]
then
    echo "Gradle is installed. Attempting to build the project."
    GRADLEBUILD=$(cd Indigo && gradle clean build)
    if [ $? -eq 0 ]
    then
        echo "Gradle build is done and subsequent builds should be faster."
    else
        echo "Maybe Gradle daemon is not running. Run gradle clean build for the project."
    fi
else
    echo "Gradle is not installed. Don't forget to set the PATH variables."
fi
echo "----------------------------------------GRADLE----------------------------------------"

# Check if docker is installed
echo "----------------------------------------DOCKER----------------------------------------"
DOCKER=$(docker -v)
if [ $? -eq 0 ]
then
    echo "Docker is installed."
    echo "Attempting to build the Docker image"
    DOCKERBUILD=$(cd Indigo && docker build -t Indigo .)
    if [ $? -eq 0 ]
    then
        echo "Docker image has been build and is availble to run."
    else
        echo "Image has not been build please check for errors."
    fi
else
    echo "Project is Dockerized. Good to have, not necessary."
fi
echo "----------------------------------------DOCKER----------------------------------------"
