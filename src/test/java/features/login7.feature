#Data driven
#To run the the entire scenario with different data
#
#@login7
#Feature:Login7
#
#Background:precondition
#Given Drive path is set
#When Open the browser	
#Then Browser is displayed
#
#Scenario Outline:Valid login
#Given Login Page is Displayed 
#When We enter user name <username> and password <password>
#And Click on Login button
#Then Home Page should be displayed
#
#Examples:
#|username|password|
#|admin|admin|
#|abcd|xyz|
