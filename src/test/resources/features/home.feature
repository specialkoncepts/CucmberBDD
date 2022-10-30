Feature: Home page tests
  Background: Navigate to Home page
    Given User open url "https://interview-prep-test.herokuapp.com/login"

  @IN-2
  Scenario: User access
      When User login with username"test@yahoo.com"
      Then User login with password"test123"
      Then Verify user Should see "sign out" button from the nav bar after signed in
      Then Verify user should not have access to "Manage Access" button




@IN-10
Scenario: When admin logs in "Manage Access" button should be visible
  When I enter email admin@yahoo.com
  And I enter password admin123
  Then Click Login button
  Then Verify Manage Access button is displayed