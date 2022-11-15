Feature: Login
  As a user opening the app
  I want to login into the application
  So that I can access its features


#Scenarios where login succeeds
Scenario: Login with correct email and password
	Given I have the device ready
	When I start the application	
	And I insert "manager_1@mail.pt" in the email field
	And I insert "123" in the password field 
	And I click on the Login button
	Then I should see a confirmation message and be presented with the dashboard
	
Scenario: Login with selected remember 
	Given I have the device ready
	When I start the application for the first time	
	And I insert "manager_1@mail.pt" in the email field
	And I insert "123" in the password field 
	And I click on the "Remember me" checkbox
	And I click on the Login button
	And I close the application
	And I start the application login remember
	Then I should see the dashboard interface

	
#Scenarios where login does not succeed
#DONE
Scenario: Login with invalid email
	Given I have the device ready
	When I start the application	
	And I insert "snail" in the email field
	And I insert "pedroxpto" in the password field 
	And I click on the Login button
	Then I should see an error message stating that the email isn't valid

#DONE
Scenario: Login with no input filled
	Given I have the device ready
	When I start the application	
	And I click on the Login button
	Then I should see an error message stating that both email and password are required fields

#DELETE?
Scenario: Login with wrong email
	Given I have the device ready
	When I start the application	
	And I insert "bruno@gmail.com" in the email field
	And I insert "123" in the password field 
	And I click on the Login button
	Then I should see an error message stating that the login has failed

#DONE
Scenario: Insert no email
	Given I have the device ready
	When I start the application	
	And I insert "pedroxpto" in the password field 
	And I click on the Login button
	Then I should see an error message stating that the email is required

#DELETE?
Scenario: Login with wrong password
	Given I have the device ready
	When I start the application	
	And I insert "chef_1@mail.pt" in the email field
	And I insert "tostaMista" in the password field 
	And I click on the Login button
	Then I should see an error message stating that the login has failed

#DONE	
Scenario: Insert no password
	Given I have the device ready
	When I start the application	
	And I insert "pedro@gmail.com" in the email field 
	And I click on the Login button
	Then I should see an error message stating that the password is required

#Scenario: Login with no internet connection
	#Given I have the device ready
	#When I start the application	
	#And I haven't got internet connection
	#And I insert "pedro@gmail.com" in the email field
	#And I insert "pedroxpto" in the password field 
	#And I click on the Login button
	#Then I should see an error message stating that the login has failed
	