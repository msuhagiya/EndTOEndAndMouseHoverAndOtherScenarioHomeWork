package org.example;

import org.testng.Assert;

public class PopupHandlePage extends Utils {
    LoadProp loadProp = new LoadProp();
    public void popupHandling()
    { //handle popup window
        driver.switchTo().alert().accept();
    }
    public void verifyPopupMessage()
    {   //verify popup message
        Assert.assertEquals(driver.switchTo().alert().getText(),loadProp.getProperty("expectedResultPopUpMessage"),"Message not found");
        System.out.println(driver.switchTo().alert().getText());
    }
}
