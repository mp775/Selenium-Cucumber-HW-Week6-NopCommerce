package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuildYourOwnComputerPage extends Utility
{
    private static final Logger log = LogManager.getLogger(BuildYourOwnComputerPage.class.getName());

    public BuildYourOwnComputerPage() {
        PageFactory.initElements(driver, this);

    }


    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[1]/a[1]")
    WebElement clickOnComputer;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
    WebElement desktopLink;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/h2[1]/a[1]")
    WebElement clickOnBuildComputer;

    @CacheLookup
    @FindBy(id = "product_attribute_1")
    WebElement selectProcessor;

    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement selectRam;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_3_6']")
    WebElement selectHdd;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_3_7']")
    WebElement selectHdd1;

    @CacheLookup
    @FindBy(xpath = "//dd[@id='product_attribute_input_4']")
    WebElement selectOS;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_4_9']")
    WebElement selectOs1;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_10']")
    WebElement selectSoftWare;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_11']")
    WebElement selectSoftWare1;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_12']")
    WebElement selectSoftWare2;

    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/p[1]")
    WebElement text;



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
    public void clickOnBuildComputer()
    {
        clickOnElement(clickOnBuildComputer);
        log.info("Click on BuildComputer "+clickOnBuildComputer.toString());
    }


   //_____________________________________________
    public void setSelectProcessor(String processor)
    {
        sendTextToElement(this.selectProcessor,processor);
        log.info("send text "+selectProcessor.toString());
    }
    public void setSelectRam(String ram)
    {
        sendTextToElement(this.selectRam,ram);
        log.info("send text "+selectRam.toString());
    }


    public void clickOnhdd(String hdd)
    {
        if(hdd.equals("320 GB")) {
            clickOnElement(selectHdd);
        }
        else {
            clickOnElement(selectHdd1);
        }
    }

    public void setSelectOS(String os)
    {
        if(os.equals(" Vista Home [+$50.00]")) {
            setSelectOS(os);
        }
        else if ((os.equals(" Vista Premium [+$60.00]")))
        {
            clickOnElement(selectOS);
        }
        else
        {
            clickOnElement(selectOs1);
        }
        log.info("select os "+selectOS.toString());

    }

    public void setSelectSoftWare(String software)
    {
        if (software.equals("Microsoft Office [+$50.00]")) {
            clickOnElement(selectSoftWare);
        }
        else if(software.equals("Acrobat Reader [+$10.00]"))
        {
            clickOnElement(selectSoftWare1);
        }
        else
        {
           clickOnElement(selectSoftWare2);
        }
        log.info("select software "+selectSoftWare.toString());

    }
  //_______________________________________________________________

    public void dataSet(String processor,String ram,String hdd,String os,String software)  {
        setSelectProcessor(processor);
        setSelectRam(ram);

        clickOnhdd(hdd);

        setSelectOS(os);
        setSelectSoftWare(software);



    }

    public void setAddToCart()
    {
        clickOnElement(addToCart);
        log.info("Click on addToCart "+addToCart.toString());

    }
    public String  getText()
    {
        log.info("get text "+text.toString());
       return getTextFromElement(text);

    }

}
