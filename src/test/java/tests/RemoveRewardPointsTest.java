package tests;

import baseTest.BaseClass;
import org.testng.annotations.Test;
import pageObjects.AddRewardPointsPage;
import pageObjects.LoginPage;
import pageObjects.RemoveRewardPointsPage;

public class RemoveRewardPointsTest extends BaseClass {
    RemoveRewardPointsPage rrpp = new RemoveRewardPointsPage(driver);

    @Test(priority = 1)
    void openRewards() {
        rrpp.clickRetailers();
        rrpp.clickRewards();
    }

    @Test(priority = 2)
    void searchRetailer() {
        rrpp.enterRetailerNumber();
        rrpp.searchRetailer();
        rrpp.clickEditRetailer();
    }
    @Test(priority = 3)
    void removeRewardPoints() {
        rrpp.selectRemovePoints();
        rrpp.selectReasonDropdown();
        rrpp.selectReason();
        rrpp.addPointsValue();
        rrpp.clickConfirmButton();
        rrpp.clickYesButton();
    }
    @Test(priority = 4)
    void validateConfirmationMessage() {
        rrpp.validatePopupMessage();
    }
}

