package pages.actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import pages.locators.XeroDashBoardLocators;
import utils.SeleniumDriver;

public class XeroDashBoardActions {
	XeroDashBoardLocators xeroDashBoardLocators = null;
	public  XeroDashBoardActions() {
		this.xeroDashBoardLocators = new XeroDashBoardLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), xeroDashBoardLocators);
	}
	
	public void moveToAccounts()
	{
		Actions action= new Actions(SeleniumDriver.getDriver());
		action.moveToElement(xeroDashBoardLocators.accounts).perform();
	}
	
	public void clickOnAccounts()
	{
		//moveToCarsForSaleMenu();

		xeroDashBoardLocators.accounts.click();
		
	}
	
	public void moveToBankAccounts()
	{
		Actions action= new Actions(SeleniumDriver.getDriver());
		action.moveToElement(xeroDashBoardLocators.BankAccounts).perform();
	}
	
	public void clickOnBankAccounts()
	{
		//moveToCarsForSaleMenu();
		xeroDashBoardLocators.BankAccounts.click();
		
	}
		
	}

