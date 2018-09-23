package steps;

import java.util.List;

import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;

//import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import pages.actions.XeroBankAccountsPageActions;
import pages.actions.XeroDashBoardActions;
import pages.actions.XeroHomePageActions;
import pages.actions.XeroLoginPageActions;

import utils.SeleniumDriver;

public class AddAccount
    {
    public static WebDriver	driver                      = null;
    XeroHomePageActions		XeroHomePageActions         = new XeroHomePageActions();
    XeroLoginPageActions	XeroLoginPageActions        = new XeroLoginPageActions();
    XeroDashBoardActions	XeroDashBoardActions        = new XeroDashBoardActions();
    XeroBankAccountsPageActions	XeroBankAccountsPageActions = new XeroBankAccountsPageActions();

    @When("^Add an \"([^\"]*)\" Account$")
    public void add_an_Account(String Bank) throws Throwable {

        // Write code here that turns the phrase above into concrete actions
        XeroBankAccountsPageActions.clickAddBnkAccount();
        XeroBankAccountsPageActions.searchBank(Bank);
        XeroBankAccountsPageActions.clickOnBank();
        XeroBankAccountsPageActions.enterAccountName();
        XeroBankAccountsPageActions.clickOnAccountDropdown();
        XeroBankAccountsPageActions.selectAccountType();
        XeroBankAccountsPageActions.enterBSB();
        XeroBankAccountsPageActions.enterAccountNumber();
        XeroBankAccountsPageActions.clickContinue();
        }

    @Then("^I check if the account is really added or not\\.$")
    public void i_check_if_the_account_is_really_added_or_not() throws Throwable
        {
        XeroBankAccountsPageActions.verifyIfAccountAdded();
        }

    @When("^I enter \"([^\"]*)\" and \"([^\"]*)\" click on the Login Button$")
    public void i_enter_and_click_on_the_Login_Button(String email, String password) throws Throwable
        {
        XeroHomePageActions.clickOnLogin();

        // Write code here that turns the phrase above into concrete actions
        XeroLoginPageActions.enterUserName(email);
        XeroLoginPageActions.enterPassword(password);
        }

    @Given("^I am on the Home Page \"([^\"]*)\" of Website$")
    public void i_navigate_to_xero_page(String webSiteURL) throws Throwable
        {
        // Write code here that turns the phrase above into concrete actions
        SeleniumDriver.openPage(webSiteURL);
        }

    @And("^I successfully login$")
    public void i_successfully_login() throws Throwable
        {
        // Write code here that turns the phrase above into concrete actions
        XeroLoginPageActions.clickOnSubmit();
        XeroLoginPageActions.anotherAuthenticationMethod();
        XeroLoginPageActions.securityQuestions();
        XeroLoginPageActions.answerQuestionsOne();
        XeroLoginPageActions.answerQuestionsTwo();
        XeroLoginPageActions.clickLoginAfterAnswering();
        }

    @And("^Navigate to Bank Accounts page$")
    public void navigate_to_Bank_Accounts_page() throws Throwable
        {
        // Write code here that turns the phrase above into concrete actions
        XeroDashBoardActions.moveToAccounts();
        XeroDashBoardActions.clickOnAccounts();
        XeroDashBoardActions.moveToBankAccounts();
        XeroDashBoardActions.clickOnBankAccounts();
        }
    }


//~ Formatted by Jindent --- http://www.jindent.com
