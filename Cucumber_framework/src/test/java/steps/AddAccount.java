package steps;

import java.util.List;

import org.openqa.selenium.WebDriver;

import pages.actions.XeroHomePageActions;
import pages.actions.XeroLoginPageActions;
import pages.locators.XeroDashBoardLocators;
import pages.actions.XeroBankAccountsPageActions;
import pages.actions.XeroDashBoardActions;
import utils.SeleniumDriver;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
//import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddAccount {
	public static WebDriver driver = null;
	XeroHomePageActions XeroHomePageActions = new XeroHomePageActions();
	XeroLoginPageActions XeroLoginPageActions = new XeroLoginPageActions();
	XeroDashBoardActions XeroDashBoardActions = new XeroDashBoardActions();
	XeroBankAccountsPageActions XeroBankAccountsPageActions = new XeroBankAccountsPageActions();

	@Given("^I am on the Home Page \"([^\"]*)\" of Website$")
	public void i_navigate_to_xero_page(String webSiteURL) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		SeleniumDriver.openPage(webSiteURL);

	}

	@When("^I click on the Login Button$")
	public void i_validate_the_page_title() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		XeroHomePageActions.clickOnLogin();

	}

	@And("^I successfully login$")
	public void i_successfully_login() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		XeroLoginPageActions.enterUserName();
		XeroLoginPageActions.enterPassword();
		XeroLoginPageActions.clickOnSubmit();
		XeroLoginPageActions.clickNotNow();
	}

	@And("^Navigate to Bank Accounts page$")
	public void navigate_to_Bank_Accounts_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		XeroDashBoardActions.moveToAccounts();
		XeroDashBoardActions.clickOnAccounts();
		XeroDashBoardActions.moveToBankAccounts();
		XeroDashBoardActions.clickOnBankAccounts();
	}

	@And("^Add an ANZ\\(AU\\) Account$")
	public void add_an_ANZ_AU_Account() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		XeroBankAccountsPageActions.clickAddBnkAccount();
		XeroBankAccountsPageActions.searchBank();
		XeroBankAccountsPageActions.clickOnBank();
		XeroBankAccountsPageActions.enterAccountName();
	}

	@Then("^I check if the account is really added or not\\.$")
	public void i_check_if_the_account_is_really_added_or_not() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

}
