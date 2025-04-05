package tests;

import baseTest.BaseClass;
import org.testng.annotations.Test;
import pageObjects.AddRewardPointsPage;
import pageObjects.LoginPage;
import pageObjects.RemoveRewardPointsPage;

public class RemoveRewardPointsTest extends BaseClass {
    @Test(priority = 1)
    void login() {
        LoginPage lpo = new LoginPage(accesing());
        lpo.setPhoneNumber("9425790844");
        lpo.clickSendOtp();
        lpo.enterOtp("1000");
        lpo.clickLogin();
    }

    @Test(priority = 2)
    void openRewards() {
        RemoveRewardPointsPage rrpp = new RemoveRewardPointsPage(accesing());
        rrpp.clickRetailers();
        rrpp.clickRewards();
    }

    @Test(priority = 3)
    void searchRetailer() {
        RemoveRewardPointsPage rrpp = new RemoveRewardPointsPage(accesing());
        rrpp.enterRetailerNumber();
        rrpp.searchRetailer();
        rrpp.clickEditRetailer();
    }
    @Test(priority = 3)
    void removeRewardPoints() {
        RemoveRewardPointsPage rrpp = new RemoveRewardPointsPage(accesing());
        rrpp.selectRemovePoints();
    }
}
