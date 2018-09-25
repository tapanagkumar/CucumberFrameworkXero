package steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.assertthat.selenium_shutterbug.utils.web.ScrollStrategy;

import cucumber.api.Scenario;
import cucumber.api.java.After;

import utils.SeleniumDriver;

public class AfterActions
    {
    @After
    public static void tearDown(Scenario scenario)
        {
        WebDriver	driver = SeleniumDriver.getDriver();

        System.out.println(scenario.isFailed());

        if (scenario.isFailed())
            {
            // https://github.com/assertthat/selenium-shutterbug/wiki/Examples-of-usage
            Shutterbug.shootPage(driver, ScrollStrategy.BOTH_DIRECTIONS).save();

            /*
             *       byte[]  screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
             *
             *       scenario.embed(screenshotBytes, "image/png");
             */
            }

        SeleniumDriver.tearDown();
        }
    }


//~ Formatted by Jindent --- http://www.jindent.com
