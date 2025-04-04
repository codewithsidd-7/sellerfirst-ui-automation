package tests;

import baseTest.BaseClass;
import org.testng.annotations.Test;
import pageObjects.AddPointsBulkPage;
import pageObjects.LoginPage;
import pageObjects.RemovePointsBulkPage;

public class RemovePointsBulkTest extends BaseClass {

    @Test(priority = 1)
    void openRewards() {
        RemovePointsBulkPage rpbp = new RemovePointsBulkPage(driver);
        rpbp.clickRetailer();
        rpbp.clickRewardPoints();

    }

    @Test(priority = 2)
    void uploadBulkFile() throws InterruptedException {
        Thread.sleep(2000);//Add explicit wait here until the element loads
        RemovePointsBulkPage rpbp = new RemovePointsBulkPage(driver);
        rpbp.clickRemovePointsInBulk();
        rpbp.uploadRewardFile();
        rpbp.clickImportReward();
    }

}
