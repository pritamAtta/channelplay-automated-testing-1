
Feature: Launching Login Page

	Background:
		Given the user is on the log in page
		
	Scenario: Do successful login
		When user enter user_name
		And enter password
		And select login button
		Then user will be on project list screen
				
	Scenario: Check validation message
		When user select wrong userName and password
		And select login button 
		Then validation message will show
		
		