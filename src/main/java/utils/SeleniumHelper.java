package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.utils.Writer;

import waiter.Waiter;

public class SeleniumHelper
    {
    private static WebDriver	driver;
    private Waiter		waiter = new Waiter();

    public static boolean isElementEnabled(WebElement webElement)
        {
        try
            {
            boolean	isEnabled = webElement.isEnabled();

            return isEnabled;
            }
        catch (NoSuchElementException e)
            {
            return false;
            }
        }

    public static boolean isElementPresent(WebElement webElement)
        {
        try
            {
            boolean	isPresent = webElement.isDisplayed();

            return isPresent;
            }
        catch (NoSuchElementException e)
            {
            return false;
            }
        }

    public static boolean isVisableAndClickable(WebElement webElement)
        {
        try
            {
            WebDriverWait	wait = new WebDriverWait(driver, 10);

            wait.until(ExpectedConditions.visibilityOf(webElement));
            wait.until(ExpectedConditions.elementToBeClickable(webElement));

            return true;
            }
        catch (Exception e)
            {
            return false;
            }
        }
    }


//~ Formatted by Jindent --- http://www.jindent.com
