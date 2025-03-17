package tests;

import baseTest.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.AddHolidayPage;
import pageObjects.LoginPage;

import java.util.concurrent.TimeUnit;

public class AddHolidayTest extends BaseClass {




    @Test(priority = 1)
    void testLogin() {
        LoginPage lpo = new LoginPage(accesing());
        lpo.setPhoneNumber("9425790844");
        lpo.clickSendOtp();
        lpo.enterOtp("1000");
        lpo.clickLogin();
    }

    @Test(priority = 2)
    void openHoliday() {
        AddHolidayPage ahp = new AddHolidayPage(accesing());
        ahp.clickProfile();
        ahp.clickHoliday();
    }

    @Test(priority = 3)
    void uploadHoliday() {
        AddHolidayPage ahp = new AddHolidayPage(accesing());
        ahp.clickUploadHoliday();
        ahp.uploadHolidayFile();
        ahp.clickImportHoliday();
    }



}

