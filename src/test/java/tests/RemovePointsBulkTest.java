package tests;

import baseTest.BaseClass;
import org.testng.annotations.Test;
import pageObjects.AddPointsBulkPage;
import pageObjects.LoginPage;
import pageObjects.RemovePointsBulkPage;

public class RemovePointsBulkTest extends BaseClass {
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
        RemovePointsBulkPage rpbp = new RemovePointsBulkPage(accesing());
        rpbp.clickRetailer();
        rpbp.clickRewardPoints();

    }

    @Test(priority = 3)
    void uploadBulkFile() throws InterruptedException {
        //Thread.sleep(2000);//Add explicit wait here until the element loads
        RemovePointsBulkPage rpbp = new RemovePointsBulkPage(accesing());
        rpbp.clickRemovePointsInBulk();
        rpbp.uploadRewardFile();
        rpbp.clickImportReward();
    }

}
