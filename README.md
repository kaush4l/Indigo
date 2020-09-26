
# Project Setup:

## Check out project:
	Go to your desired work location and open command prompt from that folder
	Then use the following commands:	
		git clone http://github.com/kaush4l/Indigo.git
		git clone http://github.com/kaush4l/Indigo_client.git

# Setting up Workspace
Run the [buildEnv.sh](buildEnv.sh) file to setup the environment.

~~~
bash buildEnv.sh
~~~

## Running using eclipse IDE (Easy way)
~~### As Maven project~~ Use Gradle way
- Open Eclipse
- Select import -> Add new Maven project -> Load root folder of the project.
- select pom.xml and click finish.
- Once project is loaded, right click on project and run as → maven clean install.
- Then right click on project and run as → maven build.
- Under goals specify eclipse:eclipse.
- Apply and run build.

[Notes](https://medium.com/@jayanisumudini/convert-maven-project-to-gradle-project-d1a829d7637f)
Project has been setup and can be run as a Spring boot application. Run as maven project

### As Gradle project
- Open Eclipse
- Select import -> Add new Gradle project -> Load root folder of the project.
- select root folder or build.gralde and click finish.
- Select import -> Add new Gradle project -> Load root folder of the project.
- Gradle should automatically import and build the project.
- Click run main class.

Project has been setup and can be run as a Spring boot application. Run as gradle project


## Running on command line (Recommended way)
Navigate to the root folder of the project

Cannot maintain 2 build systems. So remving Maven use. Keeping files for reference.

~~### [Maven](https://docs.spring.io/spring-boot/docs/2.0.3.RELEASE/reference/html/getting-started-first-application.html)~~
~~~
$ mvn clean install // To build the project
$ mvn spring-boot:run //Spring boot application on maven
~~~
### [Gradle](https://javadeveloperzone.com/spring-boot/how-to-run-spring-boot-using-maven-gradle/)
[Material](https://jeoygin.gitbooks.io/learn-y-in-x-minutes/content/gradle.html)
~~~
$ gradle clean build // To build the project
$ gradle bootRun // This runs spring boot application on gradle
~~~

### Java way
After either of commands

~~- mvn clean install~~
- gradle clean build

~~~
$ java -jar target/Indigo-<version-number>.jar // Run the project from the jar file(Didn't mention main class as there is only 1)
~~~

## Runnning using Docker container

Docker should be installed and the should be running already
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
 - [Spring docs](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#boot-features-nosql) has the best documentation.
 - Update Docker to use maven and gradle version of java images.(move building of project and starting to docker steps)
 - Java testing?!!
 - adding of security aspects
 - MongoDB is configured change to Firebase
 - Git webhooks and CICD integration
 - Jenkins and precommit hooks to building and tesing

Resources:
- [Medium groovy explained](https://medium.com/@andrewMacmurray/a-beginners-guide-to-gradle-26212ddcafa8)
