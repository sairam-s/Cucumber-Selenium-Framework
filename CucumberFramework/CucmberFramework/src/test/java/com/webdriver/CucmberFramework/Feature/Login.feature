Feature: StackOverflow login workflow
	The user should be able to login with valid credentials

Scenario: The user logins using valid credentials
Given the user is on the login page
And the user enters a valid username
And the user enters a valid password
When the user clicks on the login button
Then the user is redirected to the successful login page
