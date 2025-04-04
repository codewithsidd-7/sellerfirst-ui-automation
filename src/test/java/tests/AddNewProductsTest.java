package tests;

import baseTest.BaseClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.AddNewProductsPage;
import pageObjects.LoginPage;
import utils.ExplicitWaits;

public class AddNewProductsTest extends BaseClass {
    AddNewProductsPage anpp= new AddNewProductsPage(driver);

    @Test(priority = 1)
    void openMasterCatalogue() throws InterruptedException {
        anpp.clickCatalogue();
        anpp.clickMasterCatalogue();
        anpp.clickShowAll();
    }

    @Test(priority = 2)
    void uploadMasterCatalogueFile() {
        anpp.clickCatalogueImport();
        anpp.uploadMasterCatalogueFile();
        anpp.clickUploadCatalogueImport();
        anpp.popupConfirmation();
    }


    @Test(priority = 3)
    void searchingAddedProduct() throws InterruptedException {
        anpp.enterProductInSearch();
        anpp.clickSearchButton();
       // Thread.sleep(2000);
    }

    @Test(priority = 4)
    void addingProductToMyCatalogue() throws InterruptedException {
        anpp.clickTickBox();
        anpp.clickAddProductsToMyCatalogue();
        anpp.selectEnterprise();
        Thread.sleep(2000);
        anpp.selectPlant();
        anpp.clickAddProducts();
        anpp.addEnterpriseAndPlantConfirmation();
    }

    @Test(priority = 5)
    void openMyCatalogue() throws InterruptedException {
        driver.get("https://stage.nurture.farm/my-catalogue");

    }

    @Test(priority = 6)
    void openUploadProductDetails() throws InterruptedException {
        anpp.clickUploadProductsDetails();
        Thread.sleep(2000);
        anpp.selectEnterpriseForMyCat();
        anpp.uploadPriceFile();
        anpp.uploadInventoryFile();
        anpp.clickImportProductDetails();
    }
























}


