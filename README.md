
# Project Setup:

## Pre-requisition Softwares:
	GitHub(GUI or command prompt)
		https://git-scm.com/downloads (command prompt)
		https://desktop.github.com/ (GUI)
	Eclipse IDE for Java Developers
		https://www.eclipse.org/downloads/packages/release/2019-03/r/eclipse-ide-java-developers
	VisualStudio Code
		https://code.visualstudio.com/download
	And NodeJS for npm
		https://nodejs.org/en/download/
		Test if this is properly installed by typing the following command in command prompt:
			node -v
			npm -v
		
## Check out project:
	Go to your desired work location and open command prompt from that folder
	Then use the following commands:	
		git clone http://github.com/kaush4l/Indigo.git

# Setting up Workspace
## Frontend (ReactJS):
Open Visual studio code.
Select New → Open Folder and select frontend folder from backend\src\main\webapp\frontend

To run the program select the Integrated Termial from 

_*View → Integrated Termial or use shortcut (ctrl+`)*_ 

and it should open a terminal from the reactjs location

OR 

go to reactjs folder and open command window.
Then run
>	npm start 

This is build the project and open the react project in localhost:3000 


## Backend (Spring boot):

### Running using eclipse IDE.
- Open Eclipse
- Select import -> Add new Maven project -> Load backend folder of the project.
- select pom.xml and click finish.
- Once project is loaded, right click on project and run as → maven clean install.
- Then right click on project and run as → maven build.
- Under goals specify eclipse:eclipse.
- Apply and run build.

Project has been setup and can be run as a Spring boot application.

Run as maven project

### Running using command line

Navigate to the backend folder of the project
~~~
$ mvn clean install // To build the project
$ java -jar target/Indigo-<version-number>.jar // To run the project from the jar file(Didn't mention main class as there is only 1)
~~~

### Runnning using Docker container

Docker should be installed and the should be running already
Use 'sudo' if required

~~~
$ docker build -t indigo . // builds the docker image with the tag name indigo:latest
$ docker run -p 8080:8080 -t indigo //Deploys the image in a docker container
~~~
