package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility
{
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement text;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement email;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement password;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement clickOnLoginButton;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]")
    WebElement text2;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]")
    WebElement text3;

    public void setText()
    {
        getTextFromElement(text);
        log.info("Getting text from : " + text.toString());
    }

    public void enterEmail(String email1)
    {
        sendTextToElement(email,email1);
        log.info("Enter Email : " + email.toString());
    }

    public void enterPassWord(String password1)
    {
        sendTextToElement(password,password1);
        log.info("Enter Email : " + password.toString());
    }

    public void setClickOnLoginButton()
    {
        clickOnElement(clickOnLoginButton);
        log.info("Click on Login Button "+clickOnLoginButton.toString());
    }

    public String  getText2()
    {
        log.info("Getting text from : " + text2.toString());
       return getTextFromElement(text2);

    }

    public String getText3()
    {

        log.info("Getting text from : " + text3.toString());
        return getTextFromElement(text3);
    }
}
