package tests;

import baseTest.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageObjects.AddHolidayPage;
import pageObjects.LoginPage;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

@Listeners(listeners.TestListener.class)
public class AddHolidayTest extends BaseClass {
    AddHolidayPage ahp = new AddHolidayPage(driver);

    @Test(priority = 1)
    void openHoliday() {
        ahp.clickProfile();
        ahp.clickHoliday();
    }
    @Test(priority = 2)
    void uploadHoliday() {

        ahp.clickUploadHoliday();
        ahp.uploadHolidayFile();
        ahp.clickImportHoliday();
    }

    @Test(priority = 3)
    void validateuploadedHoliday() throws InterruptedException {
        Thread.sleep(2000);
        ahp.printUploadedHoliday();
    }
}

