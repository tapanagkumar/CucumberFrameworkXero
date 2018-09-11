package pages.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import pages.locators.XeroBankAccountsLocators;
import utils.SeleniumDriver;

import com.github.javafaker.Faker;

public class XeroBankAccountsPageActions {
	String Bank = "ANZ (AU)";
	XeroBankAccountsLocators xeroBankAccountsLocators = null;
	Faker faker = new Faker();
	String business = faker.name().fullName();
	
	public XeroBankAccountsPageActions()
	{
		this.xeroBankAccountsLocators = new XeroBankAccountsLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), xeroBankAccountsLocators);
		
	}
	
	public void clickAddBnkAccount()
	{
		xeroBankAccountsLocators.AddBankAccounts.click();
	}
	
	public void searchBank()
	{
		xeroBankAccountsLocators.EnterBankName.sendKeys(Bank);
	}
	
	public void clickOnBank()
	{
		xeroBankAccountsLocators.ClickonBank.click();
	}
	
	public void enterAccountName()
	{

		xeroBankAccountsLocators.EnterAccountName.sendKeys(business);
	}
}
