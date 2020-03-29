#!/bin/bash

# Enforcing pre commit hooks to run tests before pushing
cp hooks/pre-commit .git/hooks/pre-commit

# Checking for Java installation
echo "----------------------------------------JAVA----------------------------------------"
JAVA=$(java -version)
if [ $? -eq 0 ]
then
    echo "Java is present. make sure version is 1.8."
else
    echo "Java has not been installed yet."
fi
echo "----------------------------------------JAVA----------------------------------------"

# Check if maven is installed
echo "----------------------------------------MAVEN----------------------------------------"
MAVEN=$(mvn -v)
if [ $? -eq 0 ]
then
    echo "Maven is installed."
    MAVENBUILD=$(gradle clean build)
    if [ $? -eq 0 ]
    then
        echo "Maven build is done and code is ready to use."
    else
        echo "Run mvn clean install for the project."
    fi
else
    echo "Maven is not installed. Either maven or gradle is good for learning of the project."
fi
echo "----------------------------------------MAVEN----------------------------------------"

# Check if gradle is installed
echo "----------------------------------------GRADLE----------------------------------------"
GRADLE=$(gradle -v)
if [ $? -eq 0 ]
then
    GRADLEBUILD=$(gradle clean build)
    echo "Gradle is installed."
    if [ $? -eq 0 ]
    then
        echo "Gradle build is done and subsequent builds will be faster."
    else
        echo "Run gradle clean build for the project."
    fi
else
    echo "Maven is not installed. Either maven or gradle is good for learning of the project."
fi
echo "----------------------------------------GRADLE----------------------------------------"

# Check if docker is installed
echo "----------------------------------------DOCKER----------------------------------------"
DOCKER=$(docker -v)
if [ $? -eq 0 ]
then
    echo "Docker is installed."
else
    echo "Project is Dockerized. Good to have not necessary."
fi
echo "----------------------------------------DOCKER----------------------------------------"
