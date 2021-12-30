package org.example;

import org.openqa.selenium.By;

public class ShippingMethodPage extends Utils {
    By _clickOnContinue = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    public void selectShippingMethodAndContinue()
    {
        clickOnElement(_clickOnContinue);
    }
}
