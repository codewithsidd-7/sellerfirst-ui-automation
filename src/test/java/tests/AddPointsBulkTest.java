package tests;

import baseTest.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageObjects.AddHolidayPage;
import pageObjects.AddPointsBulkPage;
import pageObjects.LoginPage;

import java.util.concurrent.TimeUnit;

@Listeners(listeners.TestListener.class)
public class AddPointsBulkTest extends BaseClass {
    AddPointsBulkPage apbp = new AddPointsBulkPage(driver);


    @Test(priority = 1)
    void openRewards() {
        apbp.clickRetailer();
        apbp.clickRewardPoints();
    }


    @Test(priority = 2)
    void uploadBulkFile() throws InterruptedException {
        Thread.sleep(2000);//Add explicit wait here until the element loads
        apbp.clickAddPointsInBulk();
        apbp.uploadRewardFile();
        apbp.clickImportReward();
    }
}
