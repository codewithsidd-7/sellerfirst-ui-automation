package tests;

import baseTest.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.SkuDiscountPage;

public class SkuDiscountTest extends BaseClass {
    SkuDiscountPage sdp = new SkuDiscountPage(driver);

    @Test(priority = 1)
    void openDiscounts() {
        sdp.clickPromotions();
        sdp.clickDiscounts();
    }

    @Test(priority = 2)
    void uploadSkuDiscountFile() {
        sdp.clickSkuDiscountImport();
        sdp.uploadSkuFileImport();
        sdp.clickImport();
    }

    @Test(priority = 3)
    void validatePopupConfirmation(){
        sdp.validatePopupMessage();

    }

    @Test(priority = 4)
    void searchingTheDiscount(){
        sdp.searchSkuDiscount();
    }

    @Test(priority = 5)
    void deletingTheDiscount(){
        sdp.deleteSkuDiscount();

    }










}


