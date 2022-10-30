Feature: Admin User features tests

  @IN-11
  Scenario: Edit/ Delete any questions under Interview section
    Given I login as Admin
    When I click delete button the comment is deleted

@IN-12
  Scenario: Add New Dashboard
  Given I login as Admin
  When Admin clicks on New Dashboard window and Enter new Dashboard name
  Then click a button Add
  And Verify new Dashboard is displayed
