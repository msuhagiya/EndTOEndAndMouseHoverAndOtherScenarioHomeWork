Feature: Click on vote button and pop up handling

  @test
  Scenario: As a non registered user I click on vote button on https://demo.nopcommerce.com/
    So I see pop up and I should handle pop up window and verify the message

    Given I am on home page
    When I click on vote button
    And  I should be able to verify popup message successfully
    Then popup is visible and handle it