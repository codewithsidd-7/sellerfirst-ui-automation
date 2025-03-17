package tests;

import baseTest.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.AddHolidayPage;
import pageObjects.AddPointsBulkPage;
import pageObjects.LoginPage;

import java.util.concurrent.TimeUnit;

public class AddPointsBulkTest extends BaseClass {


    @Test(priority = 1)
    void testLogin() {
        LoginPage lpo = new LoginPage(accesing());
        lpo.setPhoneNumber("9425790844");
        lpo.clickSendOtp();
        lpo.enterOtp("1000");
        lpo.clickLogin();
    }

    @Test(priority = 2)
    void openRewards() {
        AddPointsBulkPage apbp = new AddPointsBulkPage(accesing());
        apbp.clickRetailer();
        apbp.clickRewardPoints();

    }

    @Test(priority = 3)
    void uploadBulkFile() {
        AddPointsBulkPage apbp = new AddPointsBulkPage(accesing());
        apbp.clicAddPointsInBulk();
        apbp.clickImportReward();
    }










}