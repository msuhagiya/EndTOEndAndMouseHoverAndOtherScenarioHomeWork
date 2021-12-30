package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class NewsCommentResultPage extends Utils{
    public void verifyUserIsOnCommentSuccessfullyAddedPage()
    {//assert url you are on new online store is open page
        Assert.assertTrue(driver.getCurrentUrl().contains("new-online-store-is-open"));
    }
    public void NewsCommentIsSuccessfullyAdded()
    {
    String actualText = driver.findElement(By.xpath("//div[@class='notifications']/div")).getText();
    //Expected message result
    String expectedText = "News comment is successfully added.";
    //Comparing message News comment is successfully added with actual message.
    Assert.assertEquals(actualText,expectedText,"News comment has not been added");
    }
}
