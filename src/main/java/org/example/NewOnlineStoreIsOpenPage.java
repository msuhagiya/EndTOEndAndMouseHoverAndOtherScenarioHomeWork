package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


import java.util.ArrayList;
import java.util.List;

public class NewOnlineStoreIsOpenPage extends Utils{

    By _GetTextFromNewOnlineStoreIsOpen = By.xpath("//h1[contains(text(),'New online store is open!')]");
    By _getTextFromNewComment = By.xpath("//strong[contains(text(),'Leave your comment')]");
    By _ListOfComment = By.xpath("//div[@class='comment-list']");
    By _compareList = By.xpath("//div[@class=\"comment news-comment\"]");
    public void verifyUserIsOnNewOnlineStoreIsOpenPage()
    {//verify I am on new online store is open page
        Assert.assertTrue(getTextFromElement(_GetTextFromNewOnlineStoreIsOpen).contains("store is open!"),"You are not on online store is open page ");
        //verify the title leave your comment
        Assert.assertTrue(getTextFromElement(_getTextFromNewComment).contains("Leave"),"you are not on right page");
    }
    public void verifyMyCommentAppearLastInTheList()
    {//verify my comment is last in a list
       // List<String> lastComment = new ArrayList<>();
        WebElement selectComment = driver.findElement(_ListOfComment);
        //declared Array for comment list
        List<WebElement> compares = selectComment.findElements(_compareList);
        //stored last comment in a list
       WebElement printLastComment = compares.get(compares.size()-1 );
       //print last comment
        System.out.println(printLastComment.getText());
        //assert last comment with your comment
        Assert.assertTrue(printLastComment.getText().contains("This is new comment"));
    }
}