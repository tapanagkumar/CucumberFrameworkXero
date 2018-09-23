package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class XeroLoginPageLocators
    {
    @FindBy(
        how   = How.ID,
        using = "email"
        )
    public WebElement	loginField;
    @FindBy(
        how   = How.ID,
        using = "password"
        )
    public WebElement	passwordField;
    @FindBy(
        how   = How.ID,
        using = "submitButton"
        )
    public WebElement	loginSubmitButton;
    @FindBy(
        how   = How.XPATH,
        using = "(.//*[normalize-space(text()) and normalize-space(.)='Set up 2SA now'])[1]/following::button[1]"
        )
    public WebElement	notNow;
    @FindBy(
        how   = How.XPATH,
        using = "//*[@id=\"auth-splashpage\"]/div/div/form/button[2]"
        )
    public WebElement	userAnotherMethod;
    @FindBy(
        how   = How.XPATH,
        using = "//*[@id=\"auth-splashpage\"]/div/div/ol/li[2]/button"
        )
    public WebElement	useSecurityQuestions;
    @FindBy(
        how   = How.XPATH,
        using = "/html/body/div[1]/div/div/form/label[1]/span"
        )
    public WebElement	questionOne;
    @FindBy(
        how   = How.XPATH,
        using = "/html/body/div[1]/div/div/form/label[1]/div/input"
        )
    public WebElement	inputOne;
    @FindBy(
        how   = How.XPATH,
        using = "/html/body/div[1]/div/div/form/label[2]/span"
        )
    public WebElement	questionTwo;
    @FindBy(
        how   = How.XPATH,
        using = "/html/body/div[1]/div/div/form/label[2]/div/input"
        )
    public WebElement	inputTwo;
    @FindBy(
        how   = How.XPATH,
        using = "//*[@id=\"auth-splashpage\"]/div/div/form/button[1]"
        )
    public WebElement	authsubmitanswersbutton;
    }


//~ Formatted by Jindent --- http://www.jindent.com
