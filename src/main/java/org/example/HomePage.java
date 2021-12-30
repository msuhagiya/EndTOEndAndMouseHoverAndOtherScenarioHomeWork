package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.List;

public class HomePage extends Utils{
    By _clickOnRegistration = By.linkText("Register");
    By _clickOnDetailLink = By.xpath("//div[@class='master-wrapper-page']/div[3]/div[1]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[3]/a[1]");
    By _clickOnComputerCategory = By.linkText("Computers");
    By _clickOnFacebook = By.xpath("//a[contains(text(),'Facebook')]");
    By _clickOnVoteButton = By.id("vote-poll-1");
    By _clickOnNewOnlineStoreOpen = By.xpath("//a[contains(text(),'New online store is open!')]");

    public void clickOnRegistration() {
        //Click on register button
        clickOnElement(_clickOnRegistration);
    }
    public void clickOnDetailUnderNews()
    {
        //click on detail underneath news
        clickOnElement(_clickOnDetailLink);
    }
    public void clickOnComputerMenu()
    {
        //Click on category Computer
        clickOnElement(_clickOnComputerCategory);
    }

    public void clickOnCategoryButton(String category_button_name)
    {//click on category button for scenario outline (for navigate to category pages)
        clickOnElement(By.linkText(category_button_name));
    }
    public void clickOnSubCategoryButton(String sub_category_button_name)
    {//mouse hovering with action class on subcategory (sor navigate to subcategory pages)
        Actions actions = new Actions(driver);
        WebElement subCategory = driver.findElement(By.linkText(sub_category_button_name));
        actions.moveToElement(subCategory).build().perform();
        ((WebElement) subCategory).click();
    }
    public void clickOnFacebookButton()
    {//click on facebook button
        clickOnElement(_clickOnFacebook);
    }
    public void clickOnVoteButton()
    {//click on vote button
        clickOnElement(_clickOnVoteButton);
    }

    public void clickOnNewOnlineStoreIsOpen()
    { //click on new online store is open link
        clickOnElement(_clickOnNewOnlineStoreOpen);
    }
    public void verifyCategoryColorBeforeAndAfterHover(String category_name)
    { //verify text colour before and after hover on category name
        WebElement color = driver.findElement(By.linkText(category_name));
        String s1 = color.getCssValue("color");
        System.out.println("Before : " + s1);
        Actions actions = new Actions(driver);
        actions.moveToElement(color).build().perform();
        WebElement AfterHover = driver.findElement(By.linkText(category_name));
        String s2 = color.getCssValue("color");
        System.out.println("After Hover : " + s2);
        System.out.println(s2.equals(loadProp.getProperty("blue")));
        Assert.assertTrue(s2.equals(loadProp.getProperty("blue")));
    }
}
