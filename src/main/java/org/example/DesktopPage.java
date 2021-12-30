package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class DesktopPage extends Utils {
    By _waitForVisibleDesktop = By.linkText("Desktops");
    By _clickOnBuildYourOwnComputerCategory = By.linkText("Build your own computer");
    public void verifyUserIsOnDesktopPage()
    {
        waitForVisible(_waitForVisibleDesktop,30);
        //Check the url for word "desktops"
        Assert.assertTrue(driver.getCurrentUrl().contains("desktops"),"Desktop page does not open");
    }
    public void clickOnBuildYourOwnComputer()
    {
        //Click on build your own computer
        clickOnElement(_clickOnBuildYourOwnComputerCategory);
    }

}
