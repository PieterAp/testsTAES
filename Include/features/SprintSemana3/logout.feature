Feature: Logout
	As a user logged in the app
  I want to logout of the application
  So that no one can access my account 

Scenario: Logout of application
	Given I have the device ready
	When I start the application	
	And I'm logged in
	And I click on the logout button
	Then I should see the login page
	And I close the application
	And I start the application
	Then I should see the login page