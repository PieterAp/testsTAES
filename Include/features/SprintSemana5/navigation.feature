Feature: Directions
  As a user logged in the app as a driver	
  I want to be able to know which directions to take
  So that I deliver the order to the client

Scenario: view navigation
	Given I have the device ready
	When I start the application
	And I insert "bruno@gmail.com" in the email field
	And I insert "123" in the password field
	And I click on the "Remember me" checkbox
	And I click on the Login button
	And I open the side menu
	And I click on the active orders button
	Then I should see the active orders interface
	And I click on one of the active orders
	And I click on the navigation button
	Then i should see the active order navigation