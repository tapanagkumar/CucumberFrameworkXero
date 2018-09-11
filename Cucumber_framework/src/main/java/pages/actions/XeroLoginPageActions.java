package pages.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import pages.locators.XeroHomePageLocators;
import pages.locators.XeroLoginPageLocators;
import utils.SeleniumDriver;


public class XeroLoginPageActions {
	
	XeroLoginPageLocators xeroLoginPageLocators = null;
	
	public XeroLoginPageActions() {

		this.xeroLoginPageLocators = new XeroLoginPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), xeroLoginPageLocators);
	}

	public void enterUserName() {
		// moveToCarsForSaleMenu();
		/// carsGuideHomePageLocators.searchCarsLink.click();
		xeroLoginPageLocators.loginField.sendKeys("tapanagkumar@gmail.com");

	}
	
	public void enterPassword() {
		// moveToCarsForSaleMenu();
		/// carsGuideHomePageLocators.searchCarsLink.click();
		xeroLoginPageLocators.passwordField.sendKeys("Gowri_k123");

	}
	
	public void clickOnSubmit() {
		// moveToCarsForSaleMenu();
		/// carsGuideHomePageLocators.searchCarsLink.click();
		xeroLoginPageLocators.loginSubmitButton.click();

	}
	
	public void clickNotNow() {
		// moveToCarsForSaleMenu();
		/// carsGuideHomePageLocators.searchCarsLink.click();
		xeroLoginPageLocators.notNow.click();
	}

}
