package pages.actions;

import org.apache.commons.codec.binary.Base64;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pages.locators.XeroHomePageLocators;
import pages.locators.XeroLoginPageLocators;

import utils.SeleniumDriver;

public class XeroLoginPageActions
    {
    String			encodedBytes          = "WGVyb18xMjM=";
    XeroLoginPageLocators	xeroLoginPageLocators = null;

    public XeroLoginPageActions()
        {
        this.xeroLoginPageLocators = new XeroLoginPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), xeroLoginPageLocators);
        }

    public void clickNotNow()
        {
        xeroLoginPageLocators.notNow.click();
        }

    public void clickOnSubmit()
        {
        xeroLoginPageLocators.loginSubmitButton.click();
        }

    public void enterPassword()
        {
        byte[]	decodedBytes = Base64.decodeBase64(encodedBytes);

        xeroLoginPageLocators.passwordField.sendKeys(new String(decodedBytes));
        }

    public void enterUserName()
        {
        xeroLoginPageLocators.loginField.sendKeys("tapanagkumar@gmail.com");
        }
    }


//~ Formatted by Jindent --- http://www.jindent.com
