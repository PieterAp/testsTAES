Feature: Show Available Orders  
	As user logged in the app 
	I want to see my orders 
	So that I can assign myself to deliver that order 

Scenario: Show orders 
	Given I have the device ready
	When I start the application
	And I insert "manager_1@mail.pt" in the email field
	And I insert "123" in the password field 
	And I click on the "Remember me" checkbox
	And I click on the Login button
	Then I should see the orders interface	
	Then I should see the order list page 

Scenario: Show empty orders 
	Given I have the device ready
	When I start the application
	And I insert "manager_1@mail.pt" in the email field
	And I insert "123" in the password field 
	And I click on the "Remember me" checkbox
	And I click on the Login button
	Then I should see the orders interface	
	Then I should see a message stating that there are no orders to be listed