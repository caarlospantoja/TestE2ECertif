Feature: Login Feature
  This feature is to check the main login path

  Scenario: Login with valid credentials
    Given User has navigated to login page
    When User enters valid email address "testemulticert@yopmail.com" into email field
    And User has entered valid password "T&ste0123" into password field
    And User clicks on login button
    Then User should get successfully logged in