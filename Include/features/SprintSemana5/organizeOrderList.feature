Feature: Organize Order List
	As a user logged in the app as a driver	
	I want to be able to order the available orders
	So that i can see specific orders easiers

Scenario: Order by distance by furthest location
	Given I have the device ready
	When I start the application
	And I insert "manager_1@mail.pt" in the email field
	And I insert "123" in the password field
	And I click on the "Remember me" checkbox
	And I click on the Login button
	Then I should see the orders interface	
	And I click order by furthest location button
	Then I should see the list of orders order by the furthest location

Scenario: Order by distance by nearest location
	Given I have the device ready
	When I start the application
	And I insert "manager_1@mail.pt" in the email field
	And I insert "123" in the password field
	And I click on the "Remember me" checkbox
	And I click on the Login button
	Then I should see the orders interface	
	And I click order by the nearest location button
	Then I should see the list of orders order by the nearest location