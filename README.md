# Pre-requisites

- <a href="https://java.com/en/download/manual.jsp" target="_blank">Java</a>
- <a href="https://maven.apache.org/download.cgi" target="_blank">Maven</a>
- <a href="https://eclipse.org/downloads/" target="_blank">Eclipse</a>
- Eclipse Plugins
  - <a href="http://download.eclipse.org/technology/m2e/releases/1.4" target="_blank">Maven</a> 
  - <a href="http://cucumber.github.io/cucumber-eclipse/update-site/" target="_blank">Cucumber</a>
  
  
 # Setting up CucumberFrameworkXero
- Install Java( Jaa 8 recommended) and set path.
- Install Maven and set path.
- Clone respective repository or download zip.
	- maven : https://github.com/tapanagkumar/CucumberFrameworkXero.git
 - Copy chromedriver.exe to `\src\test\resources\Executables`

# Writing a test

- The cucumber features goes in the `features` library and should have the ".feature" extension.
- You can start out by looking at `\src\test\resources\FeatureFiles`.



# Running features
- Goto project directory.
- Use "mvn test" command to run features.
