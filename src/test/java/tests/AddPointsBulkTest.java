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
    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        String baseUrl = "https://stage.nurture.farm/reward-points";
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    void testLogin() {
        LoginPage lpo = new LoginPage(driver);
        lpo.setPhoneNumber("9425790844");
        lpo.clickSendOtp();
        lpo.enterOtp("1000");
        lpo.clickLogin();
    }

    @Test(priority = 2)
    void openRewards() {
        AddPointsBulkPage apbp = new AddPointsBulkPage(driver);
        apbp.clickRetailer();
        apbp.clickRewardPoints();

    }

    @Test(priority = 3)
    void uploadBulkFile() {
        AddPointsBulkPage apbp = new AddPointsBulkPage(driver);
        apbp.clicAddPointsInBulk();
        apbp.clickImportReward();
    }






    @AfterClass
    public void teardown() {
        // Quit WebDriver
        if (driver != null) {
            driver.quit();
        }


    }
}