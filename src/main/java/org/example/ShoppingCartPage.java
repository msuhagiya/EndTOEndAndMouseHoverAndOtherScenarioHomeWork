package org.example;

import org.openqa.selenium.By;

public class ShoppingCartPage extends Utils{
    By _clickOnCheckbox = By.id("termsofservice");
    By _clickOnCheckout = By.xpath("//button[@id='checkout']");
    public void clickOnCheckBoxOfIAgree()
    {
        clickOnElement(_clickOnCheckbox);
    }
    public void clickOnCheckOutButton()
    {
        clickOnElement(_clickOnCheckout);
    }
}
