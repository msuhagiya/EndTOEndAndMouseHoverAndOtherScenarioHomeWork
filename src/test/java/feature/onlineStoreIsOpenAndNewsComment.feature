Feature: New comment to add and it should appear last in the list

  @test
  Scenario: As a register user I add news comment in new online store is open
    So I should verify my comment should appear last in the list

    Given user is on registration page
    When user enters required registration details
    And click on register submit button
    And user should able to register successfully
    And click on continue under registration success message
    And user click on new online store is open
    And user verify user is on new online store is open and verify leave your comment message
    And User enters required details on leave your comments
    And User clicks on new comment button
    And User should be able to add news comment successfully
    Then user should be able to verify my comment is last in the list