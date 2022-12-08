Feature: Deliver order
	As a user logged in the app as a driver	
	I want to be able to change the status of the order to delivered
	So that I can receive my reward

Scenario: Order Delivered
	Given I have the device ready
	When I start the application
	And I insert "nuno_mota@mail.pt" in the email field
	And I insert "1234" in the password field
	And I click on the "Remember me" checkbox
	And I click on the Login button
	Then I should see the orders interface
	And I open the side menu
	And I click on the active orders button
	Then I should see the active orders interface
	And I click on one of the active orders
	Then I sould see the active order details
	And I click on the confirm order delivered button
	Then I should see a message stating that the order has been delivered