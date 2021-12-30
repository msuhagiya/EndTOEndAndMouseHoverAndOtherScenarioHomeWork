package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistrationPage extends Utils{
    By _firstNameField = By.id("FirstName");
    By _lastNameField = By.id("LastName");
    By _emailField = By.id("Email");
    By _passwordField = By.id("Password");
    By _confirmPassword =By.id("ConfirmPassword");
    By _clickOnRegistrationButton = By.id("register-button");
    By _birthDay = By.name("DateOfBirthDay");
    By _birthMonth = By.name("DateOfBirthMonth");
    By _birthYear = By.name("DateOfBirthYear");


    LoadProp loadProp = new LoadProp();

    public void verifyUserIsOnRegistrationPage()
    {
        //Verify user is on registration page
       Assert.assertTrue(driver.getCurrentUrl().contains("register"),"User is not on registration page");
    }
    public void userEntersRegistrationDetails()
    {
        //enter the first name
        typeText(_firstNameField,loadProp.getProperty("firstName"));

        //enter the lastname
        typeText(_lastNameField,loadProp.getProperty("lastName"));

        //Enter day of birth
        doSelectByVisibleText(_birthDay,loadProp.getProperty("birthDay"));
       // Select selectDay = new Select(driver.findElement(By.name("DateOfBirthDay")));
        //selectDay.selectByVisibleText("21");
        //Enter month of birth
        doSelectByValue(_birthMonth,loadProp.getProperty("birthMonth"));
        //Select selectMonth = new Select(driver.findElement(By.name("DateOfBirthMonth")));
        //selectMonth.selectByValue("6");
        //Enter year of birth
        doSelectByValue(_birthYear,loadProp.getProperty("birthYear"));
       // Select selectYear = new Select(driver.findElement(By.name("DateOfBirthYear")));
       // selectYear.selectByValue("2021");

        //Enter email address
        typeText(_emailField,loadProp.getProperty("email101")+ currentTimeStamp() + loadProp.getProperty("email102"));

        //Enter password
        typeText(_passwordField, loadProp.getProperty("password"));

        //Confirm password
        typeText(_confirmPassword,loadProp.getProperty("confirmPassword"));

        //click on Register
       // waitForClickable(_clickOnRegistrationButton, 20);
      //  clickOnElement(_clickOnRegistrationButton);
    }
    public void clickOnRegisterSubmitButton()
    {
       // click on Register
        waitForClickable(_clickOnRegistrationButton, 20);
        clickOnElement(_clickOnRegistrationButton);
    }
}
