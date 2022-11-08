Feature: Register
  As a user opening the app
  I want to register into the application
  So that I can access the login page

#Scenarios where register succeeds
Scenario: Register with valid email and password and name and licence plate
	Given I have the device ready
	When I start the application	
	And I click on the register link
	And I insert "pedro" in the name field
	And I insert "pedro@gmail.com" in the email field
	And I insert "pedroxpto" in the password field
	And I insert "pedroxpto" in the password confirmation field
	And I insert "94-98-FL" in the  licence plate field
	And I click on the "Register" button
	Then I should see a confirmation message and be presented with the login interface

#Scenarios where register does not succeed
Scenario: Register with no input filled
	Given I have the device ready
	When I start the application
	And I click on the register link	
	And I click on the "Register" button
	Then I should see an error message stating that the register has failed
	
Scenario: Register with invalid name
	Given I have the device ready
	When I start the application	
	And I click on the register link
	And I insert "pedro.xpto4" in the name field
	And I insert "brunogmail.com" in the email field
	And I insert "pedroxpto" in the password field
	And I insert "pedroxpto" in the password confirmation field
	And I insert "94-98-FL" in the  licence plate field
	And I click on the "Register" button
	Then I should see an error message stating that the email is invalid	

Scenario: Register with invalid email
	Given I have the device ready
	When I start the application	
	And I click on the register link
	And I insert "pedro" in the name field
	And I insert "brunogmail.com" in the email field
	And I insert "pedroxpto" in the password field
	And I insert "pedroxpto" in the password confirmation field
	And I insert "94-98-FL" in the  licence plate field
	And I click on the "Register" button
	Then I should see an error message stating that the email is invalid
	
Scenario: Register with invalid password
	Given I have the device ready
	When I start the application	
	And I click on the register link
	And I insert "pedro" in the name field
	And I insert "pedro@gmail.com" in the email field
	And I insert "p" in the password field
	And I insert "p" in the password confirmation field
	And I insert "94-98-FL" in the  licence plate field
	And I click on the "Register" button
	Then I should see an error message stating that the password is invalid
	
Scenario: Register with invalid password confirmation
	Given I have the device ready
	When I start the application	
	And I click on the register link
	And I insert "pedro" in the name field
	And I insert "pedro@gmail.com" in the email field
	And I insert "pedroxpto" in the password field
	And I insert "pedro" in the password confirmation field
	And I insert "94-98-FL" in the  licence plate field
	And I click on the "Register" button
	Then I should see an error message stating that the password confirmation is invalid	
	
	Scenario: Register with invalid licence plate
	Given I have the device ready
	When I start the application	
	And I click on the register link
	And I insert "pedro" in the name field
	And I insert "pedro@gmail.com" in the email field
	And I insert "pedroxpto" in the password field
	And I insert "pedroxpto" in the password confirmation field
	And I insert "94-98-" in the  licence plate field
	And I click on the "Register" button
	Then I should see an error message stating that the password confirmation is invalid	

Scenario: Insert only password and attempt register
	Given I have the device ready
	When I start the application	
	And I click on the register link
	And I insert "pedroxpto" in the password field
	And I click on the "Register" button
	Then I should see an error message stating that the register has failed	

Scenario: Insert only email and attempt register
	Given I have the device ready
	When I start the application	
	And I click on the register link
	And I insert "pedro@gmail.com" in the email field
	And I click on the "Register" button
	Then I should see an error message stating that the register has failed
	
Scenario: Insert only name and attempt register
	Given I have the device ready
	When I start the application	
	And I click on the register link
	And I insert "pedro" in the name field
	And I click on the "Register" button
	Then I should see an error message stating that the register has failed
	
Scenario: Insert only password confirmation and attempt register
	Given I have the device ready
	When I start the application	
	And I click on the register link
	And I insert "pedroxpto" in the password confirmation field
	And I click on the "Register" button
	Then I should see an error message stating that the register has failed
	
	Scenario: Insert only the licence plate and attempt register
	Given I have the device ready
	When I start the application	
	And I click on the register link
	And I insert "94-98-" in the  licence plate field
	And I click on the "Register" button
	Then I should see an error message stating that the register has failed
	
Scenario: Register with no internet connection
	Given I have the device ready
	And I haven't got internet connection
	When I start the application	
	And I click on the register link
	And I insert "pedro" in the name field
	And I insert "pedro@gmail.com" in the email field
	And I insert "pedroxpto" in the password field
	And I insert "pedroxpto" in the password confirmation field
	And I insert "94-98-FL" in the  licence plate field
	And I click on the "Register" button
	Then I should see an error message stating that the register has failed