Feature: Login

	Scenario Outline: Test Login with valid credential
		
		Given user navigate to login page
		When user enters <username> and <password>
		And click on login button
		Then user is navigate to homepage
		
	Examples: 
	| username 	| password      |
	| nisaevif  | ZNlXKkszaOc=  |
	 