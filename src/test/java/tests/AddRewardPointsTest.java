package tests;

import baseTest.BaseClass;
import org.testng.annotations.Test;
import pageObjects.AddNewProductsPage;
import pageObjects.AddRewardPointsPage;
import pageObjects.LoginPage;

public class AddRewardPointsTest extends BaseClass {
    AddRewardPointsPage arpp = new AddRewardPointsPage(driver);

    @Test(priority = 1)
    void openRewards() {
        arpp.clickRetailers();
        arpp.clickRewards();
    }

    @Test(priority = 2)
    void searchRetailer() {
        arpp.enterRetailerNumber();
        arpp.searchRetailer();
        arpp.clickEditRetailer();
    }

    @Test(priority = 3)
    void addRewardPoints() {
        arpp.selectAddPoints();
        arpp.selectReasonToAddPoints();
        arpp.selectStartDate();
        arpp.selectEndDate();
        arpp.enterPoints();
        arpp.clickConfirmButton();
        arpp.clickYesButton();
    }

    @Test(priority = 4)
    void validateConfirmationMessage() {
        arpp.validatePopupMessage();
    }
}














