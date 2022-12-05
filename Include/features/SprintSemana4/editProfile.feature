Feature: Edit Profile
	As user logged in the app
	I want to see my profile
	So that I can edit my information
	
Scenario: Edit with invalid name
	Given I have the device ready
	When I start the application
	And I insert "nuno.mota@mail.pt" in the email field
	And I insert "123" in the password field
	And I click on the Login button
	Then I should see the dashboard interface
	And I open the side menu
	And I click on the profile picture
	And I should see the profile tab
	And I change my name to "Nuno_1"
	And I click on the save button
	Then I should see an error message stating that the name is invalid

Scenario: Edit with invalid email
	Given I have the device ready
	When I start the application   
	And I insert "nuno.mota@mail.pt" in the email field
	And I insert "123" in the password field
	And I click on the Login button
	Then I should see the dashboard interface
	And I open the side menu
	And I click on the profile picture
	And I should see the profile tab
	And I change my email to "nuno_mota"
	And I click on the save button
	Then I should see an error message stating that the email is invalid
	
Scenario: Edit with invalid phone number
	Given I have the device ready
	When I start the application
	And I insert "nuno.mota@mail.pt" in the email field
	And I insert "123" in the password field
	And I click on the Login button
	Then I should see the dashboard interface
	And I open the side menu
	And I click on the profile picture
	And I should see the profile tab
	And I change my phone number to "9023d"
	And I click on the save button
	Then I should see an error message stating that the phone number is invalid

Scenario: Edit with invalid license plate
	Given I have the device ready
	When I start the application  
	And I insert "nuno.mota@mail.pt" in the email field
	And I insert "123" in the password field
	And I click on the Login button
	Then I should see the dashboard interface
	And I open the side menu
	And I click on the profile picture
	And I should see the profile tab
	And I change my license plate to "99-BB88"
	And I click on the save button
	Then I should see an error message stating that the licence plate is invalid

Scenario: Edit with invalid password
	Given I have the device ready
	When I start the application
	And I insert "nuno.mota@mail.pt" in the email field
	And I insert "123" in the password field
	And I click on the Login button
	Then I should see the dashboard interface
	And I open the side menu
	And I click on the profile picture
	And I should see the profile tab
	And I change my password to "1"
	And I click on the save button
	Then I should see an error message stating that the password is invalid

Scenario: Edit name
	Given I have the device ready
	When I start the application for the first time
	And I insert "nuno.mota@mail.pt" in the email field
	And I insert "123" in the password field
	And I click on the "Remember me" checkbox
	And I click on the Login button
	Then I should see the dashboard interface
	And I open the side menu
	And I click on the profile picture
	And I should see the profile tab
	And I change my name to "Nuno Carro"
	And I click on the save button
	Then I should see a message stating that was edited with success
	And I close the application
	And I start the application login remember
	Then I should see the dashboard interface
	And I open the side menu
	And I click on the profile picture
	And I should see the profile tab
	Then I should see the name "Nuno Carro"

Scenario: Edit email
	Given I have the device ready
	When I start the application
	And I insert "nuno.mota@mail.pt" in the email field
	And I insert "123" in the password field
	And I click on the Login button
	Then I should see the dashboard interface
	And I open the side menu
	And I click on the profile picture
	And I should see the profile tab
	And I change my email to "nuno_mota@mail.pt"
	And I click on the save button
	Then I should see a message stating that was edited with success
	And I close the application
	And I start the application
	And I insert "nuno_mota@mail.pt" in the email field
	And I insert "123" in the password field
	And I click on the Login button
	Then I should see the dashboard interface
	
Scenario: Edit phone number
	Given I have the device ready
	When I start the application for the first time
	And I insert "nuno_mota@mail.pt" in the email field
	And I insert "123" in the password field
	And I click on the "Remember me" checkbox
	And I click on the Login button
	Then I should see the dashboard interface
	And I open the side menu
	And I click on the profile picture
	And I should see the profile tab
	And I change my phone number to "912345678"
	And I click on the save button
	Then I should see a message stating that was edited with success
	And I close the application
	And I start the application login remember
	Then I should see the dashboard interface
	And I open the side menu
	And I click on the profile picture
	And I should see the profile tab
	Then I should see the phone number "912345678"

Scenario: Edit license plate
	Given I have the device ready
	When I start the application for the first time  
	And I insert "nuno_mota@mail.pt" in the email field
	And I insert "123" in the password field
	And I click on the "Remember me" checkbox
	And I click on the Login button
	Then I should see the dashboard interface
	And I open the side menu
	And I click on the profile picture
	And I should see the profile tab
	And I change my license plate to "99-BB-88"
	And I click on the save button
	Then I should see a message stating that was edited with success
	And I close the application
	And I start the application login remember
	Then I should see the dashboard interface
	And I open the side menu
	And I click on the profile picture
	And I should see the profile tab
	Then I should see the license plate "99-BB-88"

Scenario: Edit password
	Given I have the device ready
	When I start the application for the first time
	And I insert "nuno_mota@mail.pt" in the email field
	And I insert "123" in the password field
	And I click on the Login button
	Then I should see the dashboard interface
	And I open the side menu
	And I click on the profile picture
	And I should see the profile tab
	And I change my password to "1234"
	And I click on the save button
	Then I should see a message stating that was edited with success
	And I close the application
	And I start the application
	And I insert "nuno_mota@mail.pt" in the email field
	And I insert "1234" in the password field
	And I click on the Login button
	Then I should see the dashboard interface 