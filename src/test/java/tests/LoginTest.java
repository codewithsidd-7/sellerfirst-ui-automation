package tests;

import baseTest.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import utils.ScreenshotUtil;

import java.util.concurrent.TimeUnit;
@Listeners(listeners.TestListener.class)

public class LoginTest extends BaseClass {



    @Test (priority = 2)
    void testScreenshot()
    {
        ScreenshotUtil.captureScreenshot(driver, "Test");
    }


}

