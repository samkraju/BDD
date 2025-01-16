#@login2
#Feature:Login
#
#
#Background:precondition
#Given Drive path is set
#When Open the browser	
#Then Browser is displayed
#
#
#Scenario:Invalid Login3
#Given Login Page is Displayed 
#When We enter invalid user name and password
#And Click on Login button
#Then Error message is displayed
#
#
#Scenario:Valid Login4
#Given Login Page is Displayed
#When We enter valid user name and password
#And Click on Login button
#Then Home Page should be displayed