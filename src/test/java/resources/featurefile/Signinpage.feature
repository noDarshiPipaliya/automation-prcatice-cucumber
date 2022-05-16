Feature:  User should navigate to signin page successfully

  As a user I want to signin into page

  @smoke
  Scenario: user should navigate to signin page
    Given I click on signin link
    When  I click on enter email address
    And   I click on password field
    And   I click on signin button
    And   I click on create account button
    And   I get authentication text
    Then  I get create account text
