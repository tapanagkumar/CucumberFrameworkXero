#Author: tapanagkumar@gmail.com
@Add-Account
Feature: Test to add ANZ(AU) account
  In order to add ANZ(AU) account
  As a User
  I should have a valid userid and password

  @Add-Account-ANZ
  Scenario: In order to add a ANZ(AU) account
    Given I am on the Home Page "https://www.xero.com/au/" of Website
    When I enter "tapanagkumar@gmail.com" and "WGVyb18xMjM=" and click on the Login Button 
    And I successfully login
    And Navigate to Bank Accounts page
    And Add an ANZ(AU) Account
    Then I check if the account is really added or not.
