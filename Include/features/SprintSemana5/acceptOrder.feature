Feature: Accept order
  As a user logged in the app as a driver
  I want to be able to choose an order of my liking
  So that I can claim/accept it

Scenario: Accept an order
	Given I have the device ready
	When I start the application
	And I insert "manager_1@mail.pt" in the email field
	And I insert "123" in the password field
	And I click on the "Remember me" checkbox
	And I click on the Login button
	Then I should see the orders interface
	Then I should see the order list page 
	And I click on the first order
	And I should see a button to accept the order
	And I click on the accept order button
	Then I should see the initiate delivery interface

Scenario: Accept an order that has already been claimed
	Given I have the device ready
	When I start the application
	And I insert "manager_1@mail.pt" in the email field
	And I insert "123" in the password field
	And I click on the "Remember me" checkbox	
	And I click on the Login button
	Then I should see the orders interface
	Then I should see the order list page 
	And I click on the first order
	And I should see a button to accept the order
	And I click on the accept order button
	Then I should see the orders interface