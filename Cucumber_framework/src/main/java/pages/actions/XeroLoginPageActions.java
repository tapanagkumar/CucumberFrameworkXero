package pages.actions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import pages.locators.XeroHomePageLocators;
import pages.locators.XeroLoginPageLocators;
import utils.SeleniumDriver;
import org.apache.commons.codec.binary.Base64;

public class XeroLoginPageActions {
	String encodedBytes = "R293cmlfazEyMw==";
	XeroLoginPageLocators xeroLoginPageLocators = null;
	
	public XeroLoginPageActions() {

		this.xeroLoginPageLocators = new XeroLoginPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), xeroLoginPageLocators);
	}

	public void enterUserName() {

		xeroLoginPageLocators.loginField.sendKeys("tapanagkumar@gmail.com");

	}
	
	public void enterPassword() {

		byte[] decodedBytes = Base64.decodeBase64(encodedBytes);
		xeroLoginPageLocators.passwordField.sendKeys(new String(decodedBytes));

	}
	
	public void clickOnSubmit() {

		xeroLoginPageLocators.loginSubmitButton.click();

	}
	
	public void clickNotNow() {

		xeroLoginPageLocators.notNow.click();
	}

}
