package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends Utility
{
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement message;

    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement clickOnRegisterButton;

    @CacheLookup
    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement errorMessageFirstName;

    @CacheLookup
    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement errorMessageLastName;

    @CacheLookup
    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement errorMessageEmail;

    @CacheLookup
    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement errorMessagePassword;

    @CacheLookup
    @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    WebElement errorMessageConformPassword;

    @CacheLookup
    @FindBy(xpath = "//input[@id='gender-female']")
    WebElement gender;

    @CacheLookup
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement enterFirstName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement enterLastName;

    @CacheLookup
    @FindBy(name = "DateOfBirthDay")
    WebElement selectDay;

    @CacheLookup
    @FindBy(name = "DateOfBirthMonth")
    WebElement selectMonth;

    @CacheLookup
    @FindBy(name = "DateOfBirthYear")
    WebElement selectYear;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement enterEmail;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement enterPassword;

    @CacheLookup
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement enterConfirmPassword;

    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement getClickOnRegisterButton;

    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement message1;


    public String  getMessage()
    {
        log.info("Getting text from : " + message.toString());
        return  getTextFromElement(message);
    }

    public void setClickOnRegisterButton()
    {
        clickOnElement(clickOnRegisterButton);
        log.info("Click on Button "+clickOnRegisterButton.toString());
    }

    public String firstNameRequired()
    {
        log.info("Enter First Name : " + errorMessageFirstName.toString());
         return getTextFromElement(errorMessageFirstName);
    }

    public String  lastNameRequired()
    {
        log.info("Enter First Name : " + errorMessageLastName.toString());
        return getTextFromElement(errorMessageLastName);
    }

    public String  emailRequired()
    {
        log.info("Enter First Name : " + errorMessageEmail.toString());
       return getTextFromElement(errorMessageEmail);
    }
    public String  passwordRequired()
    {
        log.info("Enter First Name : " + errorMessagePassword.toString());
       return getTextFromElement(errorMessagePassword);
    }
    public String conformPasswordRequired()
    {
        log.info("Enter First Name : " + errorMessageConformPassword.toString());
        return getTextFromElement(errorMessageConformPassword);
    }


    //__________________________________________________

    public void selectGender()
    {
        clickOnElement(gender);
        log.info("Click on Button "+gender.toString());
    }

    public void setEnterFirstName(String enterFirstName1)
    {
        sendTextToElement(enterFirstName,enterFirstName1);
        log.info("Enter First Name : " + enterFirstName.toString());
    }

    public void setEnterLastName(String enterLastName1)
    {
        sendTextToElement(enterLastName,enterLastName1);
        log.info("Enter Last Name : " + enterLastName.toString());
    }

    public void setSelectDay(String day)
    {
        selectByValueFromDropDown(selectDay,day);
        //"5"
        log.info("Select Day : " + selectDay.toString());
    }

    public void setSelectMonth(String month)
    {
        selectByVisibleTextFromDropDown(selectMonth,month);
        //August
        log.info("Select Month : " + selectMonth.toString());
    }
    public void setSelectYear(String year)
    {
        selectByValueFromDropDown(selectYear,year);
        //"2001"
        log.info("Select Year : " + selectYear.toString());
    }
    public void setEnterEmail(String enterEmail1)
    {
        sendTextToElement(enterEmail,enterEmail1);
        log.info("Enter Email : " + enterEmail.toString());
    }
    public void setEnterPassword(String enterPassword1)
    {
        sendTextToElement(enterPassword,enterPassword1);
        log.info("Enter password : " + enterPassword.toString());
    }

    public void setEnterConfirmPassword(String enterConfirmPassword1)
    {
        sendTextToElement(enterConfirmPassword,enterConfirmPassword1);
        log.info("Enter password : " + enterConfirmPassword.toString());
    }

    public void ClickOnRegisterButton()
    {
        clickOnElement(getClickOnRegisterButton);
        log.info("Click on Button "+getClickOnRegisterButton.toString());
    }

    public String  getText()
    {
        log.info("Getting text from : " + message1.toString());
       return getTextFromElement(message1);
    }
}
