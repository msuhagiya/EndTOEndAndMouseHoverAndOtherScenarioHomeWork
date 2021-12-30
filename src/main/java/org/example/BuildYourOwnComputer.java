package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class BuildYourOwnComputer extends Utils {
    LoadProp loadProp = new LoadProp();
    By _clickOnEmailAFriendButton = By.xpath("//form[@id='product-details-form']/div[2]/div/div[2]/div[10]/div[3]/button");
    By _selectProcessor = By.id("product_attribute_1");
    By _selectRam = By.id("product_attribute_2");
    By _selectHDDRadioButton = By.id("product_attribute_3_6");
    By _selectOS = By.id("product_attribute_4_9");
    By _checkboxSoftware1 = By.id("product_attribute_5_10");
    By _checkboxSoftware2 = By.id("product_attribute_5_11");
    By _checkboxSoftware3 = By.id("product_attribute_5_12");
    By _enterQuantity = By.xpath("//input[@id='product_enteredQuantity_1']");
    By _clickOnAddToCartButton = By.xpath("//button[@id='add-to-cart-button-1']");
    By _AssertForItemSuccessfullyAdded = By.xpath("//div[@class='bar-notification success']/p");
    By _clickOnShoppingCartButton = By.xpath("//span[contains(text(),'Shopping cart')]");
    public void verifyUseIsOnBuildYourOwnComputerPage()
    {
        Assert.assertTrue(driver.getCurrentUrl().contains("build-your-own-computer"),"You are not on Build your own computer page");
    }
    public void clickOnEmailAFriend()
    {
        //Click on Email a friend
        clickOnElement(_clickOnEmailAFriendButton);
    }
    public void enterBuildItFeatures() {//select processor by value
        doSelectByValue(_selectProcessor, loadProp.getProperty("processorValue"));
        //select ram by value
        doSelectByValue(_selectRam, loadProp.getProperty("ramValue"));
        //select HDD radio button
        clickOnElement(_selectHDDRadioButton);
        //select OS
        clickOnElement(_selectOS);
        //tick all checkbox under software
        //clickOnElement(_checkboxSoftware1);
        clickOnElement(_checkboxSoftware2);
        clickOnElement(_checkboxSoftware3);
        //typeText(_enterQuantity,loadProp.getProperty("enterQuantity"));
    }
    public void clickOnAddToCartButton(){
        //click on add to cart button
        clickOnElement(_clickOnAddToCartButton);
        //verify item successfully added to cart
        //String expectedResult = "The product has been added to your shopping cart";
       // Assert.assertTrue(getTextFromElement(_AssertForItemSuccessfullyAdded).equals(expectedResult), "item has not been added");
        //waitForVisible(_clickOnAddToCartButton,10);
    }
    public void clickOnShoppingCart()
    {   //click on shopping cart
        waitForClickable(_clickOnShoppingCartButton,10);
        clickOnElement(_clickOnShoppingCartButton);
    }
}
