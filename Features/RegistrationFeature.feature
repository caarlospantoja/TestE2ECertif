Feature: Register Feature
  This feature is to check the main register path

  Scenario: User create an account only with mandatory fields
    Given User navigates to Register Account page
    When User enter the details into below fields
    |nome        |TestesNome                 |
    |apelido     |TestesApelido              |
    |prefixo     |+351                       |
    |telefone    |926189000                  |
    |email       |testesmulticert@yopmail.com|
    |password    |T&st3s0123                 |
    And User check the privacy policy
    And User click in Continue button
    Then User should a pop-up with a successfully registration message