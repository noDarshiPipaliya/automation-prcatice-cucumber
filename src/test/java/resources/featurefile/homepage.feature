Feature: Homepage test

  As a user I should

  @smoke
  Scenario: navigate to homepage successfully
    Given  I click on women link
    When   I click on dresses link
    And    I click on t-shirt link
    And    I click on signin link
    Then   get display logo
