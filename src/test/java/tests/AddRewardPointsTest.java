package tests;

import baseTest.BaseClass;
import org.testng.annotations.Test;
import pageObjects.AddNewProductsPage;
import pageObjects.AddRewardPointsPage;
import pageObjects.LoginPage;

public class AddRewardPointsTest extends BaseClass {

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
        AddRewardPointsPage arpp = new AddRewardPointsPage(accesing());
        arpp.clickRetailers();
        arpp.clickRewards();
    }

    @Test(priority = 3)
    void searchRetailer() {
        AddRewardPointsPage arpp = new AddRewardPointsPage(accesing());
        arpp.enterRetailerNumber();
        arpp.searchRetailer();
        arpp.clickEditRetailer();
    }

    @Test(priority = 4)
    void addRewardPoints() {
        AddRewardPointsPage arpp = new AddRewardPointsPage(accesing());
        arpp.selectAddPoints();
        arpp.selectReasonToAddPoints();
        arpp.selectStartDate();
        arpp.selectEndDate();
        arpp.enterPoints();
        arpp.clickConfirmButton();
        arpp.clickYesButton();
    }

    @Test(priority = 5)
    void validateConfirmationMessage() {
        AddRewardPointsPage arpp = new AddRewardPointsPage(accesing());
        arpp.validatePopupMessage();
    }








}














