package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerPage extends Utility
{

    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());

    public ComputerPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[1]/a[1]")
    WebElement clickOnComputer;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Computers')]")
    WebElement computerText;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
    WebElement desktopLink;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Desktops')]")
    WebElement desktopText;

    public void setClickOnComputer()
    {
        clickOnElement(clickOnComputer);
        log.info("Click on Login Button "+clickOnComputer.toString());
    }

    public String setComputerText()
    {
        log.info("Getting text from : " + computerText.toString());
       return getTextFromElement(computerText);
    }

    //__________________________________________________

    public void mouseHoverOnComputer()
    {
        mouseHoverToElement(clickOnComputer);
        log.info(" mouseHoverOnComputer  " + clickOnComputer.toString());
    }

    public void clickOnDeskTopLink()
    {
        clickOnElement(desktopLink);
        log.info("Click on desktopLink "+desktopLink.toString());
    }

    public String getDeskTopText()
    {
        log.info("Getting text from : " + desktopText.toString());
       return getTextFromElement(desktopText);
    }



}
