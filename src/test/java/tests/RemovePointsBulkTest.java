package tests;

import baseTest.BaseClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageObjects.AddPointsBulkPage;
import pageObjects.LoginPage;
import pageObjects.RemovePointsBulkPage;

@Listeners(listeners.TestListener.class)
public class RemovePointsBulkTest extends BaseClass {
    RemovePointsBulkPage rpbp = new RemovePointsBulkPage(driver);

    @Test(priority = 1)
    void openRewards() {
        rpbp.clickRetailer();
        rpbp.clickRewardPoints();

    }

    @Test(priority = 2)
    void uploadBulkFile() throws InterruptedException {
        Thread.sleep(2000);//Add explicit wait here until the element loads
        rpbp.clickRemovePointsInBulk();
        rpbp.uploadRewardFile();
        rpbp.clickImportReward();
    }

}
