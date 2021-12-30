package org.example;

import org.openqa.selenium.By;

public class CheckOutPage extends Utils {
    LoadProp loadProp = new LoadProp();
    By _selectCountry = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By _typeCityName = By.xpath(" //input[@id='BillingNewAddress_City']");
    By _typeAddressLine1 = By.id("BillingNewAddress_Address1");
    By _typePostCode = By.id("BillingNewAddress_ZipPostalCode");
    By _typePhoneNumber = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    By _clickOnContinue = By.xpath("//div[@id='billing-buttons-container']/button[4]");
    public void enterBillingAddressDetail()
    {//select country name
      doSelectByVisibleText(_selectCountry,loadProp.getProperty("selectCountry"));
      //type city name
      typeText(_typeCityName,loadProp.getProperty("cityName"));
      //type first line of address
      typeText(_typeAddressLine1,loadProp.getProperty("addressLine1"));
      //type post code
      typeText(_typePostCode,loadProp.getProperty("postalCode"));
      //type phone number
      typeText(_typePhoneNumber,loadProp.getProperty("phoneNumber"));
      //click on continue button
      clickOnElement(_clickOnContinue);
    }
}
