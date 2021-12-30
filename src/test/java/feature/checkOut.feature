Feature: Checkout

  @test
  Scenario: As a registered user I should be able to checkout successfully

    Given user is on registration page
    When user enters required registration details
    And click on register submit button
    And user clicks on computers category
    And user clicks on desktop category
    And user clicks on build your own computer item
    And user selects all build it features
    And user clicks on add to cart button
    And user clicks on shopping cart button
    And user marks on I agree checkbox
    And user clicks on checkout button
    And user enters billing address details and clicks on continue button
    And user selects shipping method and clicks on continue button
    And user selects payment method
    And user enters payment card information and clicks on continue button
    And user clicks on confirm button
    Then user should be able to checkout successfully

