Feature: View order details
  As a user logged in the app as a driver	
  I want to be able to view the details of an order
  So that I make the decision of accepting it or not

Scenario: View order details
	Given I have the device ready
	When I start the application
	And I insert "manager_1@mail.pt" in the email field
	And I insert "123" in the password field
	And I click on the "Remember me" checkbox
	And I click on the Login button
	Then I should see the orders interface
	Then I should see the order list page 
	And I click on the first order
  Then I should see the order customer name
	And I should see the amount off time passed since the order was created
	And I should see order pickup location
	And I should see order destination
	And I should see order profit
	And I should see order delivery distance
	And I should see order delivery estimated time
	And I should see the map route
	And I should see a button to accept the order