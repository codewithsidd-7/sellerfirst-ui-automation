package tests;

import baseTest.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.AddHolidayPage;
import pageObjects.LoginPage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class AddHolidayTest extends BaseClass {

    @Test(priority = 1)
    void openHoliday() {
        AddHolidayPage ahp = new AddHolidayPage(driver);
        ahp.clickProfile();
        ahp.clickHoliday();
    }

    @Test(priority = 2)
    void uploadHoliday() {
        AddHolidayPage ahp = new AddHolidayPage(driver);
        ahp.clickUploadHoliday();
        ahp.uploadHolidayFile();
        ahp.clickImportHoliday();
    }

    @Test(priority = 3)
    void validateuploadedHoliday() throws InterruptedException {
        Thread.sleep(2000);
        AddHolidayPage ahp = new AddHolidayPage(driver);
        ahp.printUploadedHoliday();
    }
}

