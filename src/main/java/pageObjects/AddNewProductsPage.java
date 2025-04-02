package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.FetchProperties;

public class AddNewProductsPage extends BasePage {
    public AddNewProductsPage (WebDriver driver){
    super(driver);
    }

    //Locators
    @FindBy(xpath = "/html/body/anms-root/div/mat-sidenav-container/mat-sidenav/div/mat-nav-list/app-menu-list-item/div[3]")
    private WebElement btn_cat_loc;
    @FindBy(xpath = "/html/body/anms-root/div/mat-sidenav-container/mat-sidenav/div/mat-nav-list/app-menu-list-item/div[3]/div/a[1]/span/div")
    private WebElement btn_mastercat_loc;
    @FindBy(xpath = "/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div[2]/master-catalogue/div/div/div/mat-card[2]/div[2]/button")
    private WebElement btn_showall_loc;
    @FindBy(xpath = "/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div[2]/master-catalogue/div/div/div/mat-card[1]/div[2]/button[3]")
    private WebElement btn_catimport_loc;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/master-catalogue-import-modal/div/div[2]/form/div/div/upload-media/input")
    private WebElement btn_uploadcatfile_loc;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/master-catalogue-import-modal/div/div[2]/form/mat-dialog-actions/div/button[2]")
    private WebElement btn_importcatfile_loc;
    @FindBy(xpath = "/html/body/div[2]/div/div/snack-bar-container/div/div/simple-snack-bar/span")
    private WebElement popup_confirmation_loc;
    @FindBy(xpath = "/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div[2]/master-catalogue/div/div/div/mat-card[1]/div[1]/div/div/div/div/div[1]/input")
    private WebElement fld_search_loc;
    @FindBy(xpath = "/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div[2]/master-catalogue/div/div/div/mat-card[1]/div[1]/div/div/div/div/div[2]/button")
    private WebElement btn_search_loc;
    @FindBy(xpath = "/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div[2]/master-catalogue/div/div/div/mat-card[2]/div/table/tbody/tr/td[1]/mat-checkbox/label")
    private WebElement cbx_checkbox_loc;
    @FindBy(xpath = "/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div[2]/master-catalogue/div/div/div/mat-card[1]/div[2]/button[1]")
    private WebElement btn_addtomycat_loc;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/add-product-catalogue-modal/section/div/section/form/div/div/div/div/ng-select[1]/div/div/div[2]/input")
    private WebElement slt_enterprise_loc;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/add-product-catalogue-modal/section/div/section/form/div/div/div/div/ng-select[2]/div/div/div[2]/input")
    private WebElement slt_plant_loc;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/add-product-catalogue-modal/section/div/mat-dialog-actions/div/button[2]")
    private WebElement btn_addproduct_loc;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/add-product-catalogue-modal/section/div/div")
    private WebElement div_outclick_loc;
    @FindBy(xpath = "/html/body/div[2]/div/div/snack-bar-container/div/div/simple-snack-bar/span")
    private WebElement popup_addentandplant_loc;
    @FindBy(xpath = "/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div[2]/my-product-catalogue/div/div/div/div/mat-card[1]/div[2]/button[2]")
    private WebElement btn_uploadproductdetails_loc;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/catalogue-import-modal/div/div[2]/div/div[1]/div[2]/upload-media/input")
    private WebElement btn_uploadprice_loc;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/catalogue-import-modal/div/div[2]/div/div[2]/div[2]/upload-media/input")
    private WebElement btn_uploadinventory_loc;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/catalogue-import-modal/div/div[2]/form/div/ng-select/div/div/div[2]/input")
    private WebElement slt_enterprisemycat_loc;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/catalogue-import-modal/div/div[2]/div/mat-dialog-actions/div/button[2]")
    private WebElement btn_importmycat_loc;





    //Action methods
    public void clickCatalogue() {
        btn_cat_loc.click();
    }

    public void clickMasterCatalogue() {
        btn_mastercat_loc.click();
    }

    public void clickShowAll() {
        btn_showall_loc.click();
    }

    public void clickCatalogueImport() {
        btn_catimport_loc.click();
    }

    public void uploadMasterCatalogueFile() {
        String relative_path = properties.getProperty("crop_protect_master_catalogue_path");
        String catalogue_import= FetchProperties.fetchAbsoluteFilePath(relative_path);


        btn_uploadcatfile_loc.sendKeys(catalogue_import);
    }

    public void clickUploadCatalogueImport() {
        btn_importcatfile_loc.click();
    }

    public void popupConfirmation(){

        if (popup_confirmation_loc.isDisplayed()){
            System.out.println("Pop-up is displayed with the following : " + popup_confirmation_loc.getText());
        }
        else {
            System.out.println("Pop-up is not displayed with the following : " + popup_confirmation_loc.getText());
        }

    }

    public void enterProductInSearch(){
        fld_search_loc.sendKeys("Shelby");
    }

    public void clickSearchButton() {
        btn_search_loc.click();
    }

    public void clickTickBox() {
        cbx_checkbox_loc.click();
    }

    public void clickAddProductsToMyCatalogue() {
        btn_addtomycat_loc.click();
    }

    public void selectEnterprise(){
        slt_enterprise_loc.sendKeys("Godrej Agrovet Limited");
        slt_enterprise_loc.sendKeys(Keys.ENTER);
    }

    public void selectPlant()  {
        slt_plant_loc.sendKeys("G002");
        slt_plant_loc.sendKeys(Keys.ENTER);

    }

    public void clickAddProducts() {
        div_outclick_loc.click();
        btn_addproduct_loc.click();
    }
    public void addEnterpriseAndPlantConfirmation(){

        if(popup_addentandplant_loc.isDisplayed()){
            System.out.println("Pop-up is Displayed with the following : " + popup_addentandplant_loc.getText());
        }
        else{
            System.out.println("Pop-up is Displayed with the following : " + popup_addentandplant_loc.getText());
        }
    }

    public void clickUploadProductsDetails () {
        btn_uploadproductdetails_loc.click();
    }

    public void uploadPriceFile() {
        String relative_path = properties.getProperty("price_inventory_path");
        String price_import = FetchProperties.fetchAbsoluteFilePath(relative_path);

        btn_uploadprice_loc.sendKeys(price_import);
    }

    public void uploadInventoryFile() {
        String relative_path = properties.getProperty("inventory_import_path");
        String inventory_import = FetchProperties.fetchAbsoluteFilePath(relative_path);

        btn_uploadinventory_loc.sendKeys(inventory_import);
    }

    public void selectEnterpriseForMyCat(){
        slt_enterprisemycat_loc.sendKeys("Godrej Agrovet Limited");
        slt_enterprisemycat_loc.sendKeys(Keys.ENTER);
    }

    public void clickImportProductDetails () {
        btn_importmycat_loc.click();
    }


}
