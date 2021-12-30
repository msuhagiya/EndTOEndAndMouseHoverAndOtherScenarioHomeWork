Feature: Navigate to Sub category page

  @test
  Scenario Outline: As a user, I should able to navigate to correct sub category page

    Given I am on home page
    When I click on "<Category>" button
    And I click on "<Sub_Category>" button accordingly
    And I should able to verify the "<page_url>" accordingly
    And I should able to verify the page title as "<page_title>" accordingly
    Then I should be able to verify "<Category>" font color before and after hover successfully
    Examples:
      | Category    | Sub_Category   | page_url                                  | page_title     |
      | Computers   | Desktops       | https://demo.nopcommerce.com/desktops     | Desktops       |
      | Computers   | Notebooks      | https://demo.nopcommerce.com/notebooks    | Notebooks      |
      | Computers   | Software       | https://demo.nopcommerce.com/software     | Software       |
      | Electronics | Camera & photo | https://demo.nopcommerce.com/camera-photo | Camera & photo |
      | Electronics | Cell phones    | https://demo.nopcommerce.com/cell-phones  | Cell phones    |
      | Electronics | Others         | https://demo.nopcommerce.com/others       | Others         |
      | Apparel     | Shoes          | https://demo.nopcommerce.com/shoes        | Shoes          |
      | Apparel     | Clothing       | https://demo.nopcommerce.com/clothing     | Clothing       |
      | Apparel     | Accessories    | https://demo.nopcommerce.com/accessories  | Accessories    |
