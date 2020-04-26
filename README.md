
# Project Setup:

## ~~Check out project:~~

# Setting up Workspace
Right-Click to download the <a id="raw-url" href="https://github.com/kaush4l/Indigo/blob/checkPoint/buildEnv.sh" download>Setup script</a>

Place in the desired work location and run the [setup sctipt](buildEnv.sh) file to download and setup the environment.


~~~
bash buildEnv.sh
~~~

## _*Workspace setup*_

### *As Gradle eclipse application (Easy way)*
The application can be run using a click.(GUI) And easy debugging.
- Open Eclipse
- Select import -> Add new Gradle project -> Load root folder of the project.
- select root folder or build.gralde and click finish.
- Select import -> Add new Gradle project -> Load root folder of the project.
- Gradle should automatically import and build the project.
- Click run main class.

Project has been setup and can be run as a Spring boot application. Run as gradle project

### VSCode
I prefer VSCode as it looks organized. Use the integrated terminal to run/start the application. Similar to running in command line without an IDE.

## Running on command line
Navigate to the root folder of the project

### [Gradle](https://javadeveloperzone.com/spring-boot/how-to-run-spring-boot-using-maven-gradle/)

~~~
$ gradle clean build // To build the project
$ gradle bootRun // This runs spring boot application on gradle
or
$ java -jar build/libs/Indigo-<version-number>.jar // Run the project from the jar file(Didn't mention main class as there is only 1)
~~~

## Runnning using Docker container

Docker should be installed and the daemon should be running already
Use 'sudo' if required
[Material](https://rominirani.com/docker-tutorial-series-a7e6ff90a023)
~~~
$ docker build -t indigo . // builds the docker image with the tag name indigo:latest
// $ docker run -p 8080:8080 -t indigo //Deploys the image in a docker container
$ docker run -it --name indigo --rm indigo bash // prefix with winpty if needed for windows
~~~
To map store any data created in doker locally we can map the input volume to local drive

$ docker run -v <LocalDirectory>:\data -p 8080:8080 --name indigo indigo # /data(shared volume in container)

The second command directly runs the container and connects it to bash and removes the container once the script is stopped.

## Learning to add
 - Re-structured to use Kotlin. Covert existing things first.
 - Dev and Docker hot reloading (Maybe not possible as need to run 2 terminals)
 ~~~
 gradle build -continuous or -t // watch
 gradle bootRun
 ~~~
 - Update Docker to use gradle version of java images.(move building of project and starting to docker steps)
 - Kotlin testing?!!
 - adding of security aspects
 - ~~MongoDB is configured change to Firebase~~
 - Git webhooks and CICD integration
 - Jenkins and precommit hooks to building and tesing

Resources:
- [Spring docs](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#boot-features-nosql) has the best documentation.
- [Gradle X in Y mins](https://jeoygin.gitbooks.io/learn-y-in-x-minutes/content/gradle.html)
- [Medium groovy explained](https://medium.com/@andrewMacmurray/a-beginners-guide-to-gradle-26212ddcafa8)
