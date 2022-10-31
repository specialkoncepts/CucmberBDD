Feature: Home page tests
  Background: Navigate to Home page
    Given User open url

  @IN-2
  Scenario: User access
      When User login with username"test@yahoo.com"
      Then User login with password"test123"
      Then User click login button
      Then Verify user Should only see sign out button from the nav bar after signed in





@IN-10
Scenario: When admin logs in "Manage Access" button should be visible
  When I enter email admin@yahoo.com
  And I enter password admin123
  Then Click Login button
  Then Verify Manage Access button is displayed