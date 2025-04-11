package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ExplicitWaits;
import utils.FetchProperties;

public class SkuDiscountPage extends BasePage{
    private ExplicitWaits explicitWaits;

    public SkuDiscountPage(WebDriver driver) {
        super(driver);
        this.explicitWaits=new ExplicitWaits(driver);

    }

    //Locators
    @FindBy(xpath = "/html/body/anms-root/div/mat-sidenav-container/mat-sidenav/div/mat-nav-list/app-menu-list-item/div[7]")
    private WebElement btn_promotions_loc;
    @FindBy(xpath = "/html/body/anms-root/div/mat-sidenav-container/mat-sidenav/div/mat-nav-list/app-menu-list-item/div[7]/div/a[2]/span/div")
    private WebElement btn_discounts_loc;
    @FindBy(xpath = "/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div[2]/discounts/mat-tab-group/div/mat-tab-body[1]/div/sku-discount/div/div/div/mat-card[1]/div[1]/div/button[2]")
    private WebElement btn_sku_discount_import_loc;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/sku-discount-import-modal/div/div[2]/form/div/div/upload-media/input")
    private WebElement btn_sku_file_import_loc;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/sku-discount-import-modal/div/div[2]/form/mat-dialog-actions/div/button[2]")
    private WebElement btn_import_sku_loc;
    @FindBy(xpath = "/html/body/div[2]/div/div/snack-bar-container/div/div/simple-snack-bar/span")
    private WebElement pop_discounts_confirm_loc;
    @FindBy(xpath = "/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div[2]/discounts/mat-tab-group/div/mat-tab-body[1]/div/sku-discount/div/div/div/mat-card[1]/div[1]/div/div/div/div/div/div[1]/input")
    private WebElement fld_search_discount_loc;
    @FindBy(xpath = "/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div[2]/discounts/mat-tab-group/div/mat-tab-body[1]/div/sku-discount/div/div/div/mat-card[1]/div[1]/div/div/div/div/div/div[2]/button")
    private WebElement btn_search_loc;
    @FindBy(xpath = "/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div[2]/discounts/mat-tab-group/div/mat-tab-body[1]/div/sku-discount/div/div/div/mat-card[2]/div/table/tbody/tr/td[13]/button[2]")
    private WebElement btn_delete_sku_loc;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/pop-up/div/mat-dialog-actions/div/button[2]")
    private WebElement btn_yes_loc;
    @FindBy(xpath = "/html/body/div[2]/div/div/snack-bar-container/div/div/simple-snack-bar/span")
    private WebElement pop_dlt_loc;


    //Action Methods
    public void clickPromotions() {
        btn_promotions_loc.click();
    }

    public void clickDiscounts() {
        btn_discounts_loc.click();
    }

    public void clickSkuDiscountImport() {
        btn_sku_discount_import_loc.click();
    }
    public void uploadSkuFileImport() {
        btn_sku_file_import_loc.sendKeys(FetchProperties.fetchAbsoluteFilePath(properties.getProperty("sku_discount_import")));
    }
    public void clickImport() {
        btn_import_sku_loc.click();
    }
    public void validatePopupMessage() {
        if (pop_discounts_confirm_loc.isDisplayed()){
            System.out.println("Pop-up is Displayed with following message : " +pop_discounts_confirm_loc.getText());
        }
        else {
            System.out.println("Pop-up is not Displayed with following message : " +pop_discounts_confirm_loc.getText());
        }
    }

    public void searchSkuDiscount() {
        fld_search_discount_loc.sendKeys("6309000");
        btn_search_loc.click();
    }

    public void deleteSkuDiscount() {
        explicitWaits.waitForElementToBeClickable(btn_delete_sku_loc);
        btn_delete_sku_loc.click();
        btn_yes_loc.click();

        if (pop_dlt_loc.isDisplayed()){
            System.out.println("Pop-up is Displayed with following message : " +pop_dlt_loc.getText());
        }
        else {
            System.out.println("Pop-up is not Displayed with following message : " +pop_dlt_loc.getText());
        }
    }










}
