package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class XeroBankAccountsLocators {
    @FindBy(
            how = How.XPATH,
            using = "(.//*[normalize-space(text()) and normalize-space(.)='Hide Help'])[1]/following::span[1]"
    )
    public WebElement AddBankAccounts;
    @FindBy(
            how = How.ID,
            using = "xui-searchfield-1018-inputEl"
    )
    public WebElement EnterBankName;
    @FindBy(
            how = How.XPATH,
            using = "(.//*[normalize-space(text()) and normalize-space(.)='No banks available'])[1]/following::li[1]"
    )
    public WebElement ClickonBank;
    @FindBy(
            how = How.ID,
            using = "accountname-1037-inputEl"
    )
    public WebElement EnterAccountName;
    @FindBy(
            how = How.ID,
            using = "accounttype-1039-inputEl"
    )
    public WebElement ClickonAccountTypeMenu;
    @FindBy(
            how = How.XPATH,
            using = "(.//*[normalize-space(text()) and normalize-space(.)='Continue'])[1]/following::li[1]"
    )
    public WebElement SelectAccountType;
    @FindBy(
            how = How.ID,
            using = "branchnumber-1045-inputEl"
    )
    public WebElement Bsb;
    @FindBy(
            how = How.ID,
            using = "accountnumber-1046-inputEl"
    )
    public WebElement AccountNumber;
    @FindBy(
            how = How.ID,
            using = "common-button-submit-1015-btnInnerEl"
    )
    public WebElement Continue;
    @FindBy(
            how = How.CLASS_NAME,
            using = "message"
    )
    public WebElement CheckifAdded;
}


//~ Formatted by Jindent --- http://www.jindent.com
