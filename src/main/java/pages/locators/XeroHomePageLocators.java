package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class XeroHomePageLocators {
    @FindBy(
            how = How.LINK_TEXT,
            using = "Login"
    )
    public WebElement loginLink;
}


//~ Formatted by Jindent --- http://www.jindent.com
