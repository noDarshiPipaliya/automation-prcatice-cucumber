Feature: user should navigate to create account page

  As a user I should navigate to create account page

  @sanity
  Scenario: user should create account successfully
    Given   I click on signin link
    When    I click on E-mail address
    And     I click on create account button
    And     I get create account text
    And     I click on firstname field
    And     I click on lastname field
    And     I click on email field
    And     I click on password
    And     I click on add firstname
    And     I click on add lastname
    And     I click on address field
    And     I click on city field
    And     I click on state field
    And     I click on zip code dield
    And     I click on country field
    And     I click on phone number field
    And     I click on reference field
    Then    I click on register button