Feature: View & resume active order
  As a user logged in the app as a driver
  I want to be able to view the orders I have active
  So that I can resume its deliver process

Scenario: view active orders
	Given I have the device ready
	When I start the application
	And I insert "bruno@gmail.com" in the email field
	And I insert "123" in the password field
	And I click on the "Remember me" checkbox
	And I click on the Login button
	Then I should see the orders interface	
	And I open the side menu
	And I click on the active orders button
	Then I should see the active orders interface

Scenario: view empty active orders
	Given I have the device ready
	When I start the application
	And I insert "manager_1@mail.pt" in the email field
	And I insert "123" in the password field
	And I click on the "Remember me" checkbox
	And I click on the Login button
	Then I should see the orders interface	
	And I open the side menu
	And I click on the active orders button
	Then I should see an error message stating that i have no active orders

Scenario: resume active orders
	Given I have the device ready
	When I start the application
	And I insert "bruno@gmail.com" in the email field
	And I insert "123" in the password field
	And I click on the "Remember me" checkbox
	And I click on the Login button
	Then I should see the orders interface	
	And I open the side menu
	And I click on the active orders button
	Then I should see the active orders interface
	And I click on one of the active orders
	Then I sould see the active order details