#Author: tapanagkumar@gmail.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Add-Account
Feature: Test to adding ANZ(AU) account
  In order to add ANZ(AU) account
  As a User
  I should have a valid userid and password

  @Add-Account-ANZ
  Scenario: In order to add a ANZ(AU) account
    Given I am on the Home Page "https://www.xero.com/au/" of Website
    When I click on the Login Button
    And I successfully login
    And Navigate to Bank Accounts page
    And Add an ANZ(AU) Account
    Then I check if the account is really added or not.
