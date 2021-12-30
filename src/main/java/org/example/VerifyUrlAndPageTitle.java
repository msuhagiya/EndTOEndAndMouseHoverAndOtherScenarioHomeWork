package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class VerifyUrlAndPageTitle extends Utils{
    By _verifyPageTitle = By.xpath("//div[@class='page-title']/h1");
    public void verifyCategoryTitle(String text)
    {//verify page title of page
       Assert.assertTrue(getTextFromElement(_verifyPageTitle).equals(text));
    }
    public static void verifyCurrentURL(String page_url)
    {//verify page url of page
        Assert.assertTrue(driver.getCurrentUrl().equals(page_url));
    }
}
