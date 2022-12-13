Feature: Directions
  As a user logged in the app as a driver	
  I want to be able to know which directions to take
  So that I deliver the order to the client

Scenario: view directions
	Given I have the device ready
	When I start the application
	And I insert "piet@mail.pt" in the email field
	And I insert "123" in the password field
	And I click on the "Remember me" checkbox
	And I click on the Login button
	Then I should see the orders interface	
	Then I should see the order list page 
	And I click on the first order
	Then I should see a button to accept the order
	And I click on the accept order button
	Then I should see the initiate delivery interface
	Then I should see a button to confirm order pickup
	And I click on the pickup button
	Then I sould see the active order details