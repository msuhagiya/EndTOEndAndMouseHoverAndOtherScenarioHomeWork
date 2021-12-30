Feature: Navigate to category page

  @test
  Scenario Outline: As a user, I should able to navigate to correct category page

    Given I am on home page
    When I click on "<Category>" button
    Then I should able to verify the "<page_url>" accordingly
    And I should able to verify the page title as "<page_title>" accordingly
    Examples:
      | Category          | page_url                                       | page_title        |
      | Computers         | https://demo.nopcommerce.com/computers         | Computers         |
      | Electronics       | https://demo.nopcommerce.com/electronics       | Electronics       |
      | Apparel           | https://demo.nopcommerce.com/apparel           | Apparel           |
      | Digital downloads | https://demo.nopcommerce.com/digital-downloads | Digital downloads |
      | Books             | https://demo.nopcommerce.com/books             | Books             |
      | Jewelry           | https://demo.nopcommerce.com/jewelry           | Jewelry           |
      | Gift Cards        | https://demo.nopcommerce.com/gift-cards        | Gift Cards        |