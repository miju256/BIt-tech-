Feature: login validation

  Scenario: valid credantial
    Given open browser
    And navigate to url
    When user type facebook userId in text box
    And user type their password in text box
    And user click on login button
    Then user should land his profile page

  Scenario Outline: invalid credantial
    Given open browser
    And navigate to url
    When user type facebook <"userId"> in text box
    And user type their <"password">in text box
    And user click on login button
    Then user should not be landing his profile page

    Examples: 
      | userId  | password |
      | user123 | s233     |