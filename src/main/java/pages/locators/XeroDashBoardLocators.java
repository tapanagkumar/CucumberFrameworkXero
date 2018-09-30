package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class XeroDashBoardLocators {
    @FindBy(
            how = How.LINK_TEXT,
            using = "Accounts"
    )
    public WebElement accounts;
    @FindBy(
            how = How.LINK_TEXT,
            using = "Bank Accounts"
    )
    public WebElement BankAccounts;
}


//~ Formatted by Jindent --- http://www.jindent.com
