# CucumberFrameworkXero Example

This project demonstrates adding ANZ bank account inside Xero organisation using Cucumber and/or Selenium tests.

## Pre-requisites

- <a href="https://java.com/en/download/manual.jsp" target="_blank">Java</a>
- <a href="https://maven.apache.org/download.cgi" target="_blank">Maven</a>
- <a href="https://eclipse.org/downloads/" target="_blank">Eclipse</a>
- Eclipse Plugins
  - <a href="http://download.eclipse.org/technology/m2e/releases/1.4" target="_blank">Maven</a> 
  - <a href="http://cucumber.github.io/cucumber-eclipse/update-site/" target="_blank">Cucumber</a>
  
  
 ### Setting up CucumberFrameworkXero
- Install Java(Recommended: Java 8 ) and set path.
- Install Maven and set path.
- Clone respective repository or download zip.
	- maven : https://github.com/tapanagkumar/CucumberFrameworkXero.git

- To initialize browser navigate to `\src\main\java\utils\SeleniumDriver.java` and change to firefox and chrome
---------------------------------------

	```
	WebDriverManager.chromedriver().setup();
         WebDriverManager.firefoxdriver().setup();
	 final ChromeOptions	chromeOptions  = new ChromeOptions();
	 final FirefoxOptions	firefoxOptions = new FirefoxOptions();
	 chromeOptions.setHeadless(true);
	 firefoxOptions.setHeadless(true);
	 // driver = new ChromeDriver(chromeOptions);
        driver = new FirefoxDriver(firefoxOptions);
	```

 ### Directory layout
```
├───.settings
├───src
│   ├───main
│   │   └───java
│   │       ├───pages
│   │       │   ├───actions        	#Action Files which perform the main action based on Locators
│   │       │   └───locators		#Object Repository
│   │       └───utils			#Utility Files
│   └───test
│       ├───java
│       │   ├───runners			#Cucumber TestNg Runner class
│       │   └───steps			#Step Definations
│       └───resources
│           ├───FeatureFiles		#Cucumber Feature Files 
│           └───runner			#Testng.xml
└───target
    ├───classes
    │   ├───pages
    │   │   ├───actions
    │   │   └───locators
    │   └───utils
    ├───Extent_Reports			# Location of the Reports
```
    
 ### Writing a test

- The cucumber features goes in the `features` library and should have the ".feature" extension.
- You can start out by looking at `\src\test\resources\FeatureFiles`.


From Command line goto project directory.
- Use `mvn test` command to run features.



### Results

```
-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running TestSuite
#Author: tapanagkumar@gmail.com
@Add-Account
Feature: Test to add ANZ(AU) account
  In order to add ANZ(AU) account
  As a User
  I should have a valid userid and password
Before
Starting ChromeDriver 2.41.578737 (49da6702b16031c40d63e5618de03a32ff6c197e) on port 11436
Only local connections are allowed.
Sep 16, 2018 9:36:35 AM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: OSS
Window ->CDwindow-1BFDE2A32ABE4EB9264FE32F35DFF430
https://www.xero.com/au/
ChromeDriver: chrome on XP (a467ae383919c4c305e7b67c6205bab7)
false

  @Add-Account-ANZ
  Scenario: In order to add a ANZ(AU) account                         # AddAccount.feature:9
    Given I am on the Home Page "https://www.xero.com/au/" of Website # AddAccount.i_navigate_to_xero_page(String)
    When I click on the Login Button                                  # AddAccount.i_validate_the_page_title()
    And I successfully login                                          # AddAccount.i_successfully_login()
    And Navigate to Bank Accounts page                                # AddAccount.navigate_to_Bank_Accounts_page()
    And Add an ANZ(AU) Account                                        # AddAccount.add_an_ANZ_AU_Account()
    Then I check if the account is really added or not.               # AddAccount.i_check_if_the_account_is_really_added_or_not()

1 Scenarios (1 passed)
6 Steps (6 passed)
0m34.928s

Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 36.715 sec - in TestSuite

Results :

Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------

```

### HTML Reports

- HTML reports can be viewed from `\target\Extent_Reports` location
