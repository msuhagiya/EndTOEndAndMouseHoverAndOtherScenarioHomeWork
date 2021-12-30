package org.example;

import org.openqa.selenium.By;

public class PaymentMethodPage extends Utils{
    By _selectPaymentMethodAsCreditCard = By.id("paymentmethod_1");
    By _clickOnContinueAfterSelectPaymentMethod = By.xpath("//div[@id='payment-method-buttons-container']/button");
    By _selectCardType = By.id("CreditCardType");
    By _typeCardHoldersName = By.xpath(" //input[@id='CardholderName']");
    By _typeCardNumber = By.id("CardNumber");
    By _selectCardExpiryMonth = By.id("ExpireMonth");
    By _selectCardExpiryYear = By.id("ExpireYear");
    By _typeCVVNumber =  By.xpath("//input[@id='CardCode']");
    By _clickOnContinue = By.xpath("//div[@id='payment-info-buttons-container']/button");
    public void selectPaymentMethod()
    {    //select payment card method as credit card
        clickOnElement(_selectPaymentMethodAsCreditCard);
        //click on continue
        clickOnElement(_clickOnContinueAfterSelectPaymentMethod);
    }
    public void enterPaymentCardInformation()
    {    //select card type
        doSelectByVisibleText(_selectCardType,loadProp.getProperty("cardType"));
        //type card holder name
        typeText(_typeCardHoldersName,loadProp.getProperty("cardHoldersName"));
        //type visa card number
        typeText(_typeCardNumber,loadProp.getProperty("visaCardNo"));
        //select month of card expiry
        doSelectByValue(_selectCardExpiryMonth,loadProp.getProperty("cardExpMonthValue"));
        //select year of card expiry
        doSelectByValue(_selectCardExpiryYear,loadProp.getProperty("cardExpYearValue"));
        //type cvv code of card
        typeText(_typeCVVNumber,loadProp.getProperty("visaCardCVVCode"));
        //click on continue
        clickOnElement(_clickOnContinue);
    }
}
