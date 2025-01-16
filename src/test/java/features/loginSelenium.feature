#This is authenticaltion feature of the application

@loginSelenium
Feature: Login

Scenario: Valid Login
Given I navigate to login page
When I enter "admin" as the username
And I enter "pointofsales" as the password
And I click on login button
Then I should see the home page

Scenario: Invalid Login
Given I navigate to login page
When I enter "admin" as the username
And I enter "admin" as the password   
And I click on login button
Then Error message should be displayed

