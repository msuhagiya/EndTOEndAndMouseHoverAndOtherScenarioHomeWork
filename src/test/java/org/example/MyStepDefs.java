package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class MyStepDefs {
    Utils utils = new Utils();
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    ComputerPage computerPage = new ComputerPage();
    DesktopPage desktopPage = new DesktopPage();
    BuildYourOwnComputer buildYourOwnComputer = new BuildYourOwnComputer();
    EmailAFriendPage emailAFriendPage = new EmailAFriendPage();
    NewsCommentPage newsCommentPage = new NewsCommentPage();
    NewsCommentResultPage newsCommentResultPage = new NewsCommentResultPage();
    ReferAFriendResultPage referAFriendResultPage = new ReferAFriendResultPage();
    VerifyUrlAndPageTitle verifyUrlAndPageTitle = new VerifyUrlAndPageTitle();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckOutPage checkOutPage = new CheckOutPage();
    ShippingMethodPage shippingMethodPage = new ShippingMethodPage();
    PaymentMethodPage paymentMethodPage = new PaymentMethodPage();
    ConfirmOrderPage confirmOrderPage = new ConfirmOrderPage();
    FacebookWindowHandlePage facebookWindowHandlePage = new FacebookWindowHandlePage();
    PopupHandlePage popupHandlePage = new PopupHandlePage();
    NewOnlineStoreIsOpenPage newOnlineStoreIsOpenPage = new NewOnlineStoreIsOpenPage();

    @Given("user is on registration page")
    public void user_is_on_registration_page() {
        //Click on register
        homePage.clickOnRegistration();
        //verify user is on registration page
        registrationPage.verifyUserIsOnRegistrationPage();
    }
    @When("user enters required registration details")
    public void user_enters_required_registration_details() {
        //Enter registration details
        registrationPage.userEntersRegistrationDetails();
    }
    @When("click on register submit button")
    public void click_on_register_submit_button() {
        //click on register submit button
        registrationPage.clickOnRegisterSubmitButton();
    }
    @Then("user should able to register successfully")
    public void user_should_able_to_register_successfully() {
        //Verify user is on registration successfully page
        registrationResultPage.verifyUserIsOnRegistrationSuccessPage();
        //to verify user is successfully register
        registrationResultPage.userIsSuccessfullyRegister();

    }
    @Given("User is on computers category page")
    public void user_is_on_computers_category_page() {
        homePage.clickOnComputerMenu();
        computerPage.verifyUserIsOnComputerPage();
    }
    @When("User clicks on desktop category")
    public void user_clicks_on_desktop_category() {
        computerPage.userCanClickOnDesktopInComputerPage();
    }
    @Then("user should be able to navigate to desktop category page successfully")
    public void user_should_be_able_to_navigate_to_desktop_category_page_successfully() {
        desktopPage.verifyUserIsOnDesktopPage();
    }

    @When("user clicks on computers category")
    public void user_clicks_on_computers_category() {
       homePage.clickOnComputerMenu();
    }

    @When("user clicks on build your own computer item")
    public void user_clicks_on_build_your_own_computer_item() {
        desktopPage.clickOnBuildYourOwnComputer();
    }
    @And("user clicks on desktop category")
    public void userClicksOnDesktopCategory() {
        computerPage.verifyUserIsOnComputerPage();
        computerPage.userCanClickOnDesktopInComputerPage();
    }
    @When("user clicks on email a friend button")
    public void user_clicks_on_email_a_friend_button() {
        buildYourOwnComputer.verifyUseIsOnBuildYourOwnComputerPage();
        buildYourOwnComputer.clickOnEmailAFriend();
    }
    @When("user enters required detail on email a friend")
    public void user_enters_required_detail_on_email_a_friend() {
        emailAFriendPage.enterDetailsOnFieldForEmailAFriend();
    }
    @When("user clicks on send email button")
    public void user_clicks_on_send_email_button() {
     emailAFriendPage.clickOnSendEmailButton();
    }
    @Then("registered user should be able to refer a product successfully")
    public void registered_user_should_be_able_to_refer_a_product_successfully() {
        referAFriendResultPage.toVerifyUserReferAProductToAFriendSuccessfully();
    }


    @Given("User is on new online store is open page")
    public void user_is_on_new_online_store_is_open_page() {
        homePage.clickOnDetailUnderNews();
    }
    @When("User enters required details on leave your comments")
    public void user_enters_required_details_on_leave_your_comments() {
       newsCommentPage.verifyUserIsOnNewsCommentPage();
       newsCommentPage.userEntersComment();
    }
    @When("User clicks on new comment button")
    public void user_clicks_on_new_comment_button() {
        newsCommentPage.clickOnNewCommentButton();
    }
    @Then("User should be able to add news comment successfully")
    public void user_should_be_able_to_add_news_comment_successfully() {
        newsCommentResultPage.verifyUserIsOnCommentSuccessfullyAddedPage();
        newsCommentResultPage.NewsCommentIsSuccessfullyAdded();
    }
    @Given("I am on home page")
    public void i_am_on_home_page() {

    }

    @When("I click on {string} button")
    public void i_click_on_button(String category_button_name) {
     homePage.clickOnCategoryButton(category_button_name);
    }

    @Then("I should able to verify the {string} accordingly")
    public void i_should_able_to_verify_the_accordingly(String page_url)
    {
       //VerifyUrlAndPageTitle.verifyCurrentURL(page_url);
        Utils.verifyCurrentURL(page_url);
    }

    @Then("I should able to verify the page title as {string} accordingly")
    public void i_should_able_to_verify_the_page_title_as_accordingly(String text) {
        verifyUrlAndPageTitle.verifyCategoryTitle(text);
    }
    @When("I click on {string} button accordingly")
    public void i_click_on_button_accordingly(String sub_category_button_name) {
        homePage.clickOnSubCategoryButton(sub_category_button_name);
    }
  /*@Then("I should be able to verify category font color before and after hover successfully")
    public void i_should_be_able_to_verify_category_font_color_before_and_after_hover_successfully() {
        homePage.verifyCategoryColorBeforeAndAfterHover();
    }*/
  @Then("I should be able to verify {string} font color before and after hover successfully")
  public void i_should_be_able_to_verify_font_color_before_and_after_hover_successfully(String category_name) {
   homePage.verifyCategoryColorBeforeAndAfterHover(category_name);
  }
    @When("user selects all build it features")
    public void user_selects_all_build_it_features() {
        buildYourOwnComputer.enterBuildItFeatures();

    }

    @When("user clicks on add to cart button")
    public void user_clicks_on_add_to_cart_button() {
     buildYourOwnComputer.clickOnAddToCartButton();
    }

    @When("user clicks on shopping cart button")
    public void user_clicks_on_shopping_cart_button() {
    buildYourOwnComputer.clickOnShoppingCart();
    }

    @When("user marks on I agree checkbox")
    public void user_marks_on_i_agree_checkbox() {
      shoppingCartPage.clickOnCheckBoxOfIAgree();
    }

    @When("user clicks on checkout button")
    public void user_clicks_on_checkout_button() {
      shoppingCartPage.clickOnCheckOutButton();
    }

    @When("user enters billing address details and clicks on continue button")
    public void user_enters_billing_address_details_and_clicks_on_continue_button() {
       checkOutPage.enterBillingAddressDetail();
    }

    @When("user selects shipping method and clicks on continue button")
    public void user_selects_shipping_method_and_clicks_on_continue_button() {
        shippingMethodPage.selectShippingMethodAndContinue();
    }

    @When("user selects payment method")
    public void user_selects_payment_method() {
        paymentMethodPage.selectPaymentMethod();
    }

    @When("user enters payment card information and clicks on continue button")
    public void user_enters_payment_card_information_and_clicks_on_continue_button() {
        paymentMethodPage.enterPaymentCardInformation();
    }

    @When("user clicks on confirm button")
    public void user_clicks_on_confirm_button() {
        confirmOrderPage.clickOnConfirmButtonToConfirmOrder();
    }

    @Then("user should be able to checkout successfully")
    public void user_should_be_able_to_checkout_successfully() {
        confirmOrderPage.verifyOrderHasBeenCompletedSuccessfully();
    }
    @When("I click on Facebook button")
    public void i_click_on_facebook_button() {
       homePage.clickOnFacebookButton();
    }
    @And("I switch to facebook Window")
    public void iSwitchToFacebookWindow() {
        facebookWindowHandlePage.windowHandles();
    }

    @When("I accept cookies on facebook window")
    public void i_accept_cookies_on_facebook_window() {
        facebookWindowHandlePage.acceptCookies();
    }

    @Then("I should be able to verify I am on facebook page through nopcommerce")
    public void i_should_be_able_to_verify_i_am_on_facebook_page_through_nopcommerce() {
        facebookWindowHandlePage.verifyUserIsOnFacebookPage();
        facebookWindowHandlePage.closeFacebookWindowAndSwitchToMAinWindow();
    }
    @When("I click on vote button")
    public void i_click_on_vote_button() {
        homePage.clickOnVoteButton();
    }
    @When("I should be able to verify popup message successfully")
    public void i_should_be_able_to_verify_popup_message_successfully() {
        popupHandlePage.verifyPopupMessage();
    }
    @Then("popup is visible and handle it")
    public void popup_is_visible_and_handle_it() {
        popupHandlePage.popupHandling();
    }
    @When("click on continue under registration success message")
    public void click_on_continue_under_registration_success_message() {
        registrationResultPage.clickOnContinue();
    }
    @When("user click on new online store is open")
    public void user_click_on_new_online_store_is_open() {
        homePage.clickOnNewOnlineStoreIsOpen();
    }
    @When("user verify user is on new online store is open and verify leave your comment message")
    public void user_verify_user_is_on_new_online_store_is_open_and_verify_leave_your_comment_message() {
        newOnlineStoreIsOpenPage.verifyUserIsOnNewOnlineStoreIsOpenPage();
    }
    @Then("user should be able to verify my comment is last in the list")
    public void user_should_be_able_to_verify_my_comment_is_last_in_the_list() {
      newOnlineStoreIsOpenPage.verifyMyCommentAppearLastInTheList();
    }


}
