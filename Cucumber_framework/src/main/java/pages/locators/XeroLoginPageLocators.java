package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class XeroLoginPageLocators {
	
	@FindBy(how=How.ID,using="email")
	public WebElement loginField;
	
	@FindBy(how=How.ID,using="password")
	public WebElement passwordField;
	
	@FindBy(how=How.ID,using="submitButton")
	public WebElement loginSubmitButton;
	
	@FindBy(how=How.XPATH,using="(.//*[normalize-space(text()) and normalize-space(.)='Set up 2SA now'])[1]/following::button[1]")
	public WebElement notNow;
}
