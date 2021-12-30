Feature: Multi window handling

  @test
  Scenario: As a user I click on facebook button on https://demo.nopcommerce.com/
    So I should navigate to facebook window

    Given I am on home page
    When I click on Facebook button
    And I switch to facebook Window
    And I accept cookies on facebook window
    Then I should be able to verify I am on facebook page through nopcommerce