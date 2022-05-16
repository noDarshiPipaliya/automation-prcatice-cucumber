Feature: user should navigate to products page successfully

  As a user I want to navigate to products page

  @smoke
  Scenario:  User should navigate products page
    Given  I click on women link
    When   I click on tops link
    And    I click on products
    And    I click on more option
    And    I click on colour link
    And    I click on quantity link
    And    I click on size drop down
    Then   I click on add to cart button

