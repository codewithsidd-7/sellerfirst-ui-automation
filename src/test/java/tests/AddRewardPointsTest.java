package tests;

import baseTest.BaseClass;
import org.testng.annotations.Test;
import pageObjects.AddNewProductsPage;
import pageObjects.AddRewardPointsPage;
import pageObjects.LoginPage;

public class AddRewardPointsTest extends BaseClass {

    @Test(priority = 1)
    void openRewards() {
        AddRewardPointsPage arpp = new AddRewardPointsPage(driver);
        arpp.clickRetailers();
        arpp.clickRewards();
    }

    @Test(priority = 2)
    void searchRetailer() {
        AddRewardPointsPage arpp = new AddRewardPointsPage(driver);
        arpp.enterRetailerNumber();
        arpp.searchRetailer();
        arpp.clickEditRetailer();
    }

    @Test(priority = 3)
    void addRewardPoints() {
        AddRewardPointsPage arpp = new AddRewardPointsPage(driver);
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
        AddRewardPointsPage arpp = new AddRewardPointsPage(driver);
        arpp.validatePopupMessage();
    }








}














