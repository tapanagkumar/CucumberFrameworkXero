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

    public void enterPassword(String password)
        {
    
		byte[]	password1 = Base64.decodeBase64(password);

        //xeroLoginPageLocators.passwordField.sendKeys(new String(password1));
    	xeroLoginPageLocators.passwordField.sendKeys(new String(password1));
        }

    public void enterUserName(String username)
        {
        xeroLoginPageLocators.loginField.sendKeys(username);
        }
    }


//~ Formatted by Jindent --- http://www.jindent.com
