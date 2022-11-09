Feature: Home page tests


@IN-10
Scenario: When admin logs in "Manage Access" button should be visible
  When I enter email admin@yahoo.com
  And I enter password admin123
  Then Click Login button
  Then Verify Manage Access button is displayed