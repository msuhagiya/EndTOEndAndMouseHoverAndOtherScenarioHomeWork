Feature: Refer A product
  As a register user, I want to refer a product to a friend on DemoNopeCommerce website

  @regression2
  Scenario: Registered user should be able to refer a product to a friend successfully

    Given user is on registration page
    When user enters required registration details
    And click on register submit button
    And user clicks on computers category
    And user clicks on desktop category
    And user clicks on build your own computer item
    And user clicks on email a friend button
    And user enters required detail on email a friend
    And user clicks on send email button
    Then registered user should be able to refer a product successfully
