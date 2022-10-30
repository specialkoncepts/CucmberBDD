Feature: Dashboards test
  @US3 @regression
  Scenario: Verify three dashboards are present
    Then Verify link text "All topics" is displayed
    Then Verify link text "Coding" is displayed
    Then Verify link text "Soft skills" is displayed
