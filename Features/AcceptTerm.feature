Feature: Terms and Conditions
  This feature is to check terms e conditions page

  Scenario: Accept Terms and conditions (Without ID Data)
    Given User has been choice your certificate
    And User click for continue button
    When User click on link that dont document have ID
    And click to upload document
    And check button from read term document checkout
    And click in the continue button
    Then User go to payment page