package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.webdrivermanager.*;

public class SeleniumDriver
    {
    public final static int		TIMEOUT           = 30;
    public final static int		PAGE_LOAD_TIMEOUT = 50;
    private static SeleniumDriver	seleniumDriver;
    private static WebDriver		driver;
    private static WebDriverWait	waitDriver;

    private SeleniumDriver()
        {
        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();

        final ChromeOptions	chromeOptions  = new ChromeOptions();
        final FirefoxOptions	firefoxOptions = new FirefoxOptions();

        chromeOptions.setHeadless(true);
        firefoxOptions.setHeadless(true);

        // driver = new ChromeDriver(chromeOptions);
        driver = new FirefoxDriver(firefoxOptions);
        driver.manage().window().maximize();
        waitDriver = new WebDriverWait(driver, TIMEOUT);
        driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);

        String	window = driver.getWindowHandle();

        System.out.println("Window ->" + window);
        }

    public static void openPage(String url)
        {
        System.out.println(url);
        System.out.println(driver);
        driver.get(url);
        }

    public static void tearDown()
        {
        if (driver != null)
            {
            //driver.close();
            driver.quit();
            }

        seleniumDriver = null;
        }

    public static void waitForPageToLoad()
        {
        try
            {
            Thread.sleep(5000);
            }
        catch (InterruptedException e)
            {
            // TODO Auto-generated catch block
            e.printStackTrace();
            }
        }

    public static WebDriver getDriver()
        {
        return driver;
        }

    public static void setUpDriver()
        {
        if (seleniumDriver == null)
            {
            seleniumDriver = new SeleniumDriver();
            }
        }
    }


//~ Formatted by Jindent --- http://www.jindent.com
