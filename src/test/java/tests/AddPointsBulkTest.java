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
    void openRewards() {
        AddPointsBulkPage apbp = new AddPointsBulkPage(driver);
        apbp.clickRetailer();
        apbp.clickRewardPoints();
    }


    @Test(priority = 2)
    void uploadBulkFile() throws InterruptedException {
        Thread.sleep(2000);//Add explicit wait here until the element loads
        AddPointsBulkPage apbp = new AddPointsBulkPage(driver);
        apbp.clickAddPointsInBulk();
        apbp.uploadRewardFile();
        apbp.clickImportReward();
    }
}
