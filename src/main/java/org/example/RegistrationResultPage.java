package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import static org.example.BasePage.driver;
import static org.example.Utils.getTextFromElement;

public class RegistrationResultPage extends Utils{
    By _getText = By.xpath("//div[@class='result']");
    By _clickOnContinue = By.xpath("//a[contains(text(),'Continue')]");
    public void verifyUserIsOnRegistrationSuccessPage()
    {
        //verify user is on registration success page
        Assert.assertTrue(driver.getCurrentUrl().contains("registerresult"));
    }
    public void userIsSuccessfullyRegister()
    {
        //store actual result
        String actualRegisterSuccessMessage = getTextFromElement(_getText);
        //Store expected result
        String expectedRegisterSuccessMessage ="Your registration completed";
        //Compare actual result and expected result
        Assert.assertEquals(actualRegisterSuccessMessage,expectedRegisterSuccessMessage,"Register success is incorrect");

    }
    public void clickOnContinue()
    {
        clickOnElement(_clickOnContinue);
    }
}
