package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class NewsCommentPage extends Utils{
    By _commentTitleField = By.id("AddNewComment_CommentTitle");
    By _commentTextField = By.id("AddNewComment_CommentText");
    By _clickOnNewComment = By.xpath("//div[@class='buttons']/button");
    public void verifyUserIsOnNewsCommentPage()
    {
        //Verify user is on new online store is open where user can add comment
        Assert.assertTrue(driver.getCurrentUrl().contains("new-online-store-is-open"));
    }
    public void userEntersComment() {
        //Type the Title
        typeText(_commentTitleField, loadProp.getProperty("commentTitle"));
        //Type comment
        typeText(_commentTextField,loadProp.getProperty("newsComment"));

    }
    public void clickOnNewCommentButton()
    {
        //Click on new comment
        clickOnElement(_clickOnNewComment);
    }
}
