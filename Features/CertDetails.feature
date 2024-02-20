Feature: Certificate Feature
  This feature is to check the certificate page

  Scenario: Simulate a certificate price
    Given User has a valid login
    When User click to simulate price button
    And logs in you account
    Then User should go to simulate certificates page