Feature: Register
  As a user opening the app
  I want to register into the application
  So that I can access the login page

#Scenarios where register succeeds
Scenario: Register with valid email, password, name , licence plate and phone number
	Given I have the device ready
	When I start the application	
	And I click on the register link
	And I insert "pedro" in the name field
	And I insert "pedroxp@gmail.com" in the email field on register page
	And I insert "pedroxpto" in the password field on register page
	And I insert "pedroxpto" in the password confirmation field
	And I insert "94-98-FL" in the  licence plate field
	And I insert "910000000" in the  phone number field
	And I click on the Register button
	Then I should see a confirmation message and be presented with the login interface

#Scenarios where register does not succeed
Scenario: Register with taken email, valid password, name , licence plate and phone number
	Given I have the device ready
	When I start the application	
	And I click on the register link
	And I insert "pedro" in the name field
	And I insert "pedroxp@gmail.com" in the email field on register page
	And I insert "pedroxpto" in the password field on register page
	And I insert "pedroxpto" in the password confirmation field
	And I insert "94-98-FL" in the  licence plate field
	And I insert "910000000" in the  phone number field
	And I click on the Register button
	Then I should see an error message stating that the register has failed


Scenario: Register with no input filled
	Given I have the device ready
	When I start the application
	And I click on the register link	
	And I click on the Register button
	Then I should see an error message stating that all fields are required

Scenario: Register with invalid name
	Given I have the device ready
	When I start the application	
	And I click on the register link
	And I insert "pedro.xpto4" in the name field
	And I insert "bruno@gmail.com" in the email field on register page
	And I insert "pedroxpto" in the password field on register page
	And I insert "pedroxpto" in the password confirmation field
	And I insert "94-98-FL" in the  licence plate field
	And I insert "910000000" in the  phone number field
	And I click on the Register button
	Then I should see an error message stating that the name is invalid	

Scenario: Register with invalid phone number
	Given I have the device ready
	When I start the application	
	And I click on the register link
	And I insert "pedro" in the name field
	And I insert "bruno@gmail.com" in the email field on register page
	And I insert "pedroxpto" in the password field on register page
	And I insert "pedroxpto" in the password confirmation field
	And I insert "94-98-FL" in the  licence plate field
	And I insert "910000" in the  phone number field
	And I click on the Register button
	Then I should see an error message stating that the phone number is invalid	

Scenario: Register with invalid email
	Given I have the device ready
	When I start the application	
	And I click on the register link
	And I insert "pedro" in the name field
	And I insert "brunogmail.com" in the email field on register page
	And I insert "pedroxpto" in the password field on register page
	And I insert "pedroxpto" in the password confirmation field
	And I insert "94-98-FL" in the  licence plate field
	And I insert "910000000" in the  phone number field
	And I click on the Register button
	Then I should see an error message stating that the email is invalid

Scenario: Register with invalid password
	Given I have the device ready
	When I start the application	
	And I click on the register link
	And I insert "pedro" in the name field
	And I insert "pedro@gmail.com" in the email field on register page
	And I insert "p" in the password field on register page
	And I insert "pedroxpto" in the password confirmation field
	And I insert "94-98-FL" in the  licence plate field
	And I insert "910000000" in the  phone number field
	And I click on the Register button
	Then I should see an error message stating that the password is invalid

Scenario: Register with invalid password confirmation
	Given I have the device ready
	When I start the application	
	And I click on the register link
	And I insert "pedro" in the name field
	And I insert "pedro@gmail.com" in the email field on register page
	And I insert "pedroxpto" in the password field on register page
	And I insert "pe" in the password confirmation field
	And I insert "94-98-FL" in the  licence plate field
	And I insert "910000000" in the  phone number field
	And I click on the Register button
	Then I should see an error message stating that the password confirmation is invalid	
	
	
Scenario: Register with mismatched passwords
	Given I have the device ready
	When I start the application	
	And I click on the register link
	And I insert "pedro" in the name field
	And I insert "pedro@gmail.com" in the email field on register page
	And I insert "pedroxpto" in the password field on register page
	And I insert "pedro" in the password confirmation field
	And I insert "94-98-FL" in the  licence plate field
	And I insert "910000000" in the  phone number field
	And I click on the Register button
	Then I should see an error message stating that the passwords do not match

Scenario: Register with invalid licence plate
	Given I have the device ready
	When I start the application	
	And I click on the register link
	And I insert "pedro" in the name field
	And I insert "pedro@gmail.com" in the email field on register page
	And I insert "pedroxpto" in the password field on register page
	And I insert "pedroxpto" in the password confirmation field
	And I insert "94-98-" in the  licence plate field
	And I insert "910000000" in the  phone number field
	And I click on the Register button
	Then I should see an error message stating that the licence plate is invalid	

Scenario: Insert only password
	Given I have the device ready
	When I start the application	
	And I click on the register link
	And I insert "pedroxpto" in the password field on register page
	And I click on the Register button
	Then I should see an error message stating that the fields other than the "password" are empty	


Scenario: Insert only email
	Given I have the device ready
	When I start the application	
	And I click on the register link
	And I insert "pedro@gmail.com" in the email field on register page
	And I click on the Register button
	Then I should see an error message stating that the fields other than the "email" are empty	

Scenario: Insert only name
	Given I have the device ready
	When I start the application	
	And I click on the register link
	And I insert "pedro" in the name field
	And I click on the Register button
	Then I should see an error message stating that the fields other than the "name" are empty	

Scenario: Insert only password confirmation
	Given I have the device ready
	When I start the application	
	And I click on the register link
	And I insert "pedroxpto" in the password confirmation field
	And I click on the Register button
	Then I should see an error message stating that the fields other than the "password confirmation" are empty	

Scenario: Insert only the licence plate
	Given I have the device ready
	When I start the application	
	And I click on the register link
	And I insert "94-98-FL" in the  licence plate field
	And I click on the Register button
	Then I should see an error message stating that the fields other than the "licence plate" are empty	

Scenario: Insert only the phone number
	Given I have the device ready
	When I start the application	
	And I click on the register link
	And I insert "91000000" in the  phone number field
	And I click on the Register button
	Then I should see an error message stating that the fields other than the "phone number" are empty	