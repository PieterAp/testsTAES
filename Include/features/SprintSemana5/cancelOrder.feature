Feature: Cancel order
  As a user logged in the app as a driver	
  I want to be able to cancel an order that I claimed
  So that I am no longer responsible to deliver it to the client

Scenario: Cancel order before confirming pickup
	Given I have the device ready
	When I start the application
	And I insert "piet@mail.pt" in the email field
	And I insert "123" in the password field
	And I click on the "Remember me" checkbox
	And I click on the Login button
	Then I should see the orders interface	
	Then I should see the order list page 
	Then I should see the oder "Order #22"
	And I click on the first order
	Then I should see a button to accept the order
	And I click on the accept order button
	Then I should see the initiate delivery interface
	Then I should see a button to cancel the order
	And I click on the cancel button
	Then I should see the orders interface
	Then I should see the oder "Order #22"
	
Scenario: Cancel order after confirming pickup
	Given I have the device ready
	When I start the application
	And I insert "piet@mail.pt" in the email field
	And I insert "123" in the password field
	And I click on the "Remember me" checkbox
	And I click on the Login button
	Then I should see the orders interface	
	Then I should see the order list page 
	Then I should see the oder "Order #22"
	And I click on the first order
	Then I should see a button to accept the order
	And I click on the accept order button
	Then I should see the initiate delivery interface
	Then I should see a button to confirm order pickup
	And I click on the pickup button
	Then I sould see the active order details
	Then I should see a button to cancel the active order
	And I click on the cancel button of the active order
	Then I should see the orders interface