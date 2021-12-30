package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class FacebookWindowHandlePage extends Utils {

    By _acceptCookies = By.xpath("//div[@class='_9xo5']/button[2]");
    public void windowHandles()
    {//window handles (switch to main window to child window(facebook page)
        Set<String> windowHandle = driver.getWindowHandles();
        Iterator<String> iterator = windowHandle.iterator();
        String parentWindow = iterator.next();
        String childWindow = iterator.next();
        driver.switchTo().window(childWindow);

    }
    public void acceptCookies()
    {//Accept cookies
        clickOnElement(_acceptCookies);

    }
    public void verifyUserIsOnFacebookPage()
    {//verify user is on facebook page
        Assert.assertTrue(driver.getCurrentUrl().contains("nopCommerce"));
    }
    public void closeFacebookWindowAndSwitchToMAinWindow()
    {
        //close facebook tab or child window
        driver.close();
        //now user switch to main page (parent window)
        Set<String> windowHandle = driver.getWindowHandles();
        Iterator<String> iterator = windowHandle.iterator();
        String parentWindow = iterator.next();
        driver.switchTo().window(parentWindow);
    }
}
