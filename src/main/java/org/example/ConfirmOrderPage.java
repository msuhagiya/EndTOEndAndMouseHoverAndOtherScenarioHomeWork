package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ConfirmOrderPage extends Utils{
    By _clickOnConfirmButton = By.xpath("//div[@id='confirm-order-buttons-container']/button");
    By _verifyOrderHasBeenConfirm = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");
    public void clickOnConfirmButtonToConfirmOrder()
    {//click on confirm button to confirm your order
        clickOnElement(_clickOnConfirmButton);
    }
    public void verifyOrderHasBeenCompletedSuccessfully()
    {//verify url as I am on your order has been completed
        waitForVisible(_verifyOrderHasBeenConfirm,10);
        Assert.assertTrue(driver.getCurrentUrl().contains("completed"));
        //verify your order has been completed message
        Assert.assertEquals(getTextFromElement(_verifyOrderHasBeenConfirm),loadProp.getProperty("expectedResultForOrderConfirmation"),"Your order has not been completed");
    }
}
