#Author: tapanagkumar@gmail.com
@Add-Account
Feature: Test to adding a Bank account
  In order to add Bank account
  As a User I should have a valid userid and password along with account details. 

  @Add-Account-Bank
  Scenario Outline: In should be able to add a Bank account
    Given I am on the Home Page "https://www.xero.com/au/" of Website
    When I enter "<email>" and "<password>" click on the Login Button
    And I successfully login
    And Navigate to Bank Accounts page
    And Add an "<Bank>" Account
    Then I check if the account is really added or not.

    Examples: 
      | email                  | password     |Bank|
      | tapanagkumar@ymail.com | WGVyb18xMjM= |ANZ (AU)|
      | tapanagkumar@gmail.com | WGVyb18xMjM= |Westpac (AU)|
