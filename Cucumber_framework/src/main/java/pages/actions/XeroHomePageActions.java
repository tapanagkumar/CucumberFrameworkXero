package pages.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import pages.locators.XeroHomePageLocators;
import utils.SeleniumDriver;

public class XeroHomePageActions {
	XeroHomePageLocators xeroHomePageLocators = null;

	public XeroHomePageActions() {

		this.xeroHomePageLocators = new XeroHomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), xeroHomePageLocators);
	}

	public void clickOnLogin() {
		// moveToCarsForSaleMenu();
		/// carsGuideHomePageLocators.searchCarsLink.click();
		xeroHomePageLocators.loginLink.click();

	}
}
