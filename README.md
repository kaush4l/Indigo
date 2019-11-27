
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
Open eclipse IDE.
Select import -> Add new Maven project -> Load backend folder of the project.

select pom.xml and click finish.

Once project is loaded, right click on project and run as → maven clean install.

Thne right click on project and run as → maven build.
Under goals specify eclipse:eclipse.
Apply and run build.

Project has been setup and can be run as a Spring boot application.

Run as maven project
