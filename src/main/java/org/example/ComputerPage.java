package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ComputerPage extends Utils {
    By _clickOnDesktopCategory = By.linkText("Desktops");
    public void verifyUserIsOnComputerPage()
    {
        //verify user is on computer page
        Assert.assertTrue(driver.getCurrentUrl().contains("computers"));
    }
    public void userCanClickOnDesktopInComputerPage()
    {
        //Click on sub category Desktops
        clickOnElement((_clickOnDesktopCategory));
    }
}
