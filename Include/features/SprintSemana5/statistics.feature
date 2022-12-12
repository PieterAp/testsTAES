Feature: View statistics
  As a user logged in the app as a driver	
  I want to be able to see statistics
  So that I can be aware of my performance

Scenario: statistics
	Given I have the device ready
	When I start the application
	And I insert "nuno_mota@mail.pt" in the email field
	And I insert "1234" in the password field
	And I click on the "Remember me" checkbox
	And I click on the Login button
	Then I should see the orders interface
	And I open the side menu
	And I click on the profile picture
	Then I should see the profile tab
	And I should click on the statistics tab
	Then I should see the statistics page