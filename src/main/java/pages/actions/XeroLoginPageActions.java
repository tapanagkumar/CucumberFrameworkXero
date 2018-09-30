package pages.actions;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.support.PageFactory;
import pages.locators.XeroLoginPageLocators;
import utils.SeleniumDriver;

public class XeroLoginPageActions {
    XeroLoginPageLocators xeroLoginPageLocators = null;

    public XeroLoginPageActions() {
        this.xeroLoginPageLocators = new XeroLoginPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), xeroLoginPageLocators);
    }

    public void anotherAuthenticationMethod() {
        xeroLoginPageLocators.userAnotherMethod.click();
    }

    public void answerQuestionsOne() {
        if (xeroLoginPageLocators.questionOne.getText().contains("Which movie scared you most as a child?")) {
            xeroLoginPageLocators.inputOne.sendKeys("Evil Dead");
        } else if (xeroLoginPageLocators.questionOne.getText().contains("Who is your favourite painter?")) {
            xeroLoginPageLocators.inputOne.sendKeys("Picasso");
        } else {
            xeroLoginPageLocators.inputOne.sendKeys("Ferrari");
        }

        System.out.println(xeroLoginPageLocators.questionOne.getText());
    }

    public void answerQuestionsTwo() {
        if (xeroLoginPageLocators.questionTwo.getText().contains("Which movie scared you most as a child?")) {
            xeroLoginPageLocators.inputTwo.sendKeys("Evil Dead");
        } else if (xeroLoginPageLocators.questionTwo.getText().contains("Who is your favourite painter?")) {
            xeroLoginPageLocators.inputTwo.sendKeys("Picasso");
        } else {
            xeroLoginPageLocators.inputTwo.sendKeys("Ferrari");
        }

        System.out.println(xeroLoginPageLocators.questionTwo.getText());
    }

    public void clickLoginAfterAnswering() {
        xeroLoginPageLocators.authsubmitanswersbutton.click();
    }

    public void clickNotNow() {
        xeroLoginPageLocators.notNow.click();
    }

    public void clickOnSubmit() {
        xeroLoginPageLocators.loginSubmitButton.click();
    }

    public void enterPassword(String password) {
        byte[] password1 = Base64.decodeBase64(password);

        // xeroLoginPageLocators.passwordField.sendKeys(new String(password1));
        xeroLoginPageLocators.passwordField.sendKeys(new String(password1));
    }

    public void enterUserName(String username) {
        xeroLoginPageLocators.loginField.sendKeys(username);
    }

    public void securityQuestions() {
        xeroLoginPageLocators.useSecurityQuestions.click();
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
