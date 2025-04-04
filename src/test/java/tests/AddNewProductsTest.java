package tests;

import baseTest.BaseClass;
import org.testng.annotations.Test;
import pageObjects.AddNewProductsPage;
import pageObjects.LoginPage;
import utils.ExplicitWaits;

public class AddNewProductsTest extends BaseClass {

    @Test(priority = 1)
    void login() {
        LoginPage lpo = new LoginPage(accesing());
        lpo.setPhoneNumber("9425790844");
        lpo.clickSendOtp();
        lpo.enterOtp("1000");
        lpo.clickLogin();
    }

    @Test(priority = 2)
    void openMasterCatalogue() throws InterruptedException {
        AddNewProductsPage anpp = new AddNewProductsPage(accesing());
        anpp.clickCatalogue();
        anpp.clickMasterCatalogue();
        anpp.clickShowAll();
    }

    @Test(priority = 3)
    void uploadMasterCatalogueFile() {
        AddNewProductsPage anpp = new AddNewProductsPage(accesing());
        anpp.clickCatalogueImport();
        anpp.uploadMasterCatalogueFile();
        anpp.clickUploadCatalogueImport();
        anpp.popupConfirmation();
    }


    @Test(priority = 4)
    void searchingAddedProduct() throws InterruptedException {
        AddNewProductsPage anpp = new AddNewProductsPage(accesing());
        anpp.enterProductInSearch();
        anpp.clickSearchButton();
       // Thread.sleep(2000);
    }

    @Test(priority = 5)
    void addingProductToMyCatalogue() throws InterruptedException {
        AddNewProductsPage anpp = new AddNewProductsPage(accesing());
        anpp.clickTickBox();
        anpp.clickAddProductsToMyCatalogue();
        anpp.selectEnterprise();
        Thread.sleep(2000);
        anpp.selectPlant();
        anpp.clickAddProducts();
        anpp.addEnterpriseAndPlantConfirmation();
    }

    @Test(priority = 6)
    void openMyCatalogue() throws InterruptedException {
        driver.get("https://stage.nurture.farm/my-catalogue");

    }

    @Test(priority = 7)
    void openUploadProductDetails() throws InterruptedException {
        AddNewProductsPage anpp = new AddNewProductsPage(accesing());
        anpp.clickUploadProductsDetails();

        Thread.sleep(2000);
        anpp.selectEnterpriseForMyCat();
        anpp.uploadPriceFile();
        anpp.uploadInventoryFile();

        anpp.clickImportProductDetails();
    }
























}


