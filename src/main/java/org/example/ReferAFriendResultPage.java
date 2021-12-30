package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ReferAFriendResultPage extends Utils{
    LoadProp loadProp = new LoadProp();
    public void toVerifyUserReferAProductToAFriendSuccessfully() {
        //Confirmation message after sending email
        String actualMessage = getTextFromElement(By.xpath("//div[@class='result']"));
        //Expected message result
        String expectedMessage = "Your message has been sent.";
        //Comparing actual and expected send email message
        Assert.assertEquals(actualMessage, expectedMessage, "Your message has not been sent.");
    }
}
