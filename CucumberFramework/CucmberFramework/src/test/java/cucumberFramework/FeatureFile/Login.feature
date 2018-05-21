Feature: Webdriverunivesity login workflow
	The user should be able to login with valid credentials
	The user should not be able to login with invalid credentials
Background:
	Given the user access the login page from the webdriveruniversity home page 
	
Scenario: The user logs in using valid credentials
	And the user enters valid username
	And the user enters valid pasword
	When the user clicks on the login button
	Then the user sees the alert for successful login
	
Scenario: The user fails to login using invalid credentials
	And the user enters invalid username
	And the user enters invalid pasword
	When the user clicks on the login button
	Then the user sees the alert for unsuccessful login