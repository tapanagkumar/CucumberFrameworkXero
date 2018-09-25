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

### Running the tests

- From Command line goto project directory.
- Run the below command to run the tests in firefox

`$ mvn test -Dbrowser=firefox`

- Run the below command to run the tests in Chrome

`$ mvn test -Dbrowser=chrome`


### Results

```
  @Add-Account @Add-Account-Bank
  Scenario Outline: In should be able to add a Bank account                            # AddAccount.feature:18
    Given I am on the Home Page "https://www.xero.com/au/" of Website                  # AddAccount.i_navigate_to_xero_page(String)
    When I enter "tapanagkumar@ymail.com" and "WGVyb18xMjM=" click on the Login Button # AddAccount.i_enter_and_click_on_the_Login_Button(String,String)
    And I successfully login                                                           # AddAccount.i_successfully_login()
    And Navigate to Bank Accounts page                                                 # AddAccount.navigate_to_Bank_Accounts_page()
    And Add an "ANZ (AU)" Account                                                      # AddAccount.add_an_Account(String)
    Then I check if the account is really added or not.                                # AddAccount.i_check_if_the_account_is_really_added_or_not()


  @Add-Account @Add-Account-Bank
  Scenario Outline: In should be able to add a Bank account                            # AddAccount.feature:19
    Given I am on the Home Page "https://www.xero.com/au/" of Website                  # AddAccount.i_navigate_to_xero_page(String)
    When I enter "tapanagkumar@gmail.com" and "WGVyb18xMjM=" click on the Login Button # AddAccount.i_enter_and_click_on_the_Login_Button(String,String)
    And I successfully login                                                           # AddAccount.i_successfully_login()
    And Navigate to Bank Accounts page                                                 # AddAccount.navigate_to_Bank_Accounts_page()
    And Add an "Westpac (AU)" Account                                                  # AddAccount.add_an_Account(String)
    Then I check if the account is really added or not.                                # AddAccount.i_check_if_the_account_is_really_added_or_not()

2 Scenarios (2 passed)
12 Steps (12 passed)
1m47.085s

Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 109.304 sec - in TestSuite

Results :

Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
```

### HTML Reports

- HTML reports can be viewed from `\target\Extent_Reports` location
