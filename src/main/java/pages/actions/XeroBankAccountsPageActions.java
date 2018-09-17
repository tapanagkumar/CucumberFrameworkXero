package pages.actions;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import static org.testng.Assert.assertEquals;

import com.github.javafaker.Faker;
import com.github.javafaker.IdNumber;

import pages.locators.XeroBankAccountsLocators;

import utils.SeleniumDriver;

public class XeroBankAccountsPageActions
    {
    String			Bank                     = "ANZ (AU)";
    XeroBankAccountsLocators	xeroBankAccountsLocators = null;
    Faker			faker                    = new Faker();
    Random			generator                = new Random();
    String			business                 = faker.name().fullName();
    long			AccountNumber            = faker.number().randomNumber();

    public XeroBankAccountsPageActions()
        {
        this.xeroBankAccountsLocators = new XeroBankAccountsLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), xeroBankAccountsLocators);
        }

    public void clickAddBnkAccount()
        {
        xeroBankAccountsLocators.AddBankAccounts.click();
        }

    public void clickContinue()
        {
        xeroBankAccountsLocators.Continue.click();
        }

    public void clickOnAccountDropdown()
        {
        xeroBankAccountsLocators.ClickonAccountTypeMenu.click();
        }

    public void clickOnBank()
        {
        xeroBankAccountsLocators.ClickonBank.click();
        }

    public void enterAccountName()
        {
        xeroBankAccountsLocators.EnterAccountName.sendKeys(business);
        }

    public void enterAccountNumber()
        {
        xeroBankAccountsLocators.AccountNumber.sendKeys(Long.toString(AccountNumber));
        }

    public void enterBSB()
        {
        // Generate a Random six digit number and assign it to a variable num'
        int	BSBNumber = generator.nextInt(900000) + 100000;

        xeroBankAccountsLocators.Bsb.sendKeys(Integer.toString(BSBNumber));
        }

    public void searchBank()
        {
        xeroBankAccountsLocators.EnterBankName.sendKeys(Bank);
        }

    public void selectAccountType()
        {
        xeroBankAccountsLocators.SelectAccountType.click();
        }

    public void verifyIfAccountAdded()
        {
        assertEquals(business + " has been added.", xeroBankAccountsLocators.CheckifAdded.getText());
        }
    }


//~ Formatted by Jindent --- http://www.jindent.com
