Feature: Logout
	As a user logged in the app
  I want to logout of the application
  So that no one can access my account 
	
Scenario: Logout of application
	Given I have the device ready
	When I start the application for the first time	
	And I insert "manager_1@mail.pt" in the email field
	And I insert "123" in the password field 
	And I click on the "Remember me" checkbox
	And I click on the Login button
	Then I should see the dashboard interface
	And I open the side menu 
	And I click on the logout button
	Then I should see the login page
	And I close the application
	And I start the application
	Then I should see the login page