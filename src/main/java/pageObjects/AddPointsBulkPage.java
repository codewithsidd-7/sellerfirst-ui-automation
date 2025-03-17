package pageObjects;

import baseTest.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddPointsBulkPage extends BasePage {
    public AddPointsBulkPage(WebDriver driver) {
        super(driver);
    }

    //Locators
    @FindBy(xpath = "/html/body/anms-root/div/mat-sidenav-container/mat-sidenav/div/mat-nav-list/app-menu-list-item/div[8]")
    private WebElement btn_retailer_loc;
    @FindBy(xpath = "/html/body/anms-root/div/mat-sidenav-container/mat-sidenav/div/mat-nav-list/app-menu-list-item/div[8]/div/a[5]")
    private WebElement btn_rewardspoints_loc;
    @FindBy(xpath = "/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div[2]/reward-points/div/div/div/mat-card[1]/div/div/button[2]")
    private WebElement btn_addpointsinbulk_loc;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/reward-points-import-modal/div/div[2]/div/div/upload-media/input")
    private WebElement btn_uploadfile_loc;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/reward-points-import-modal/div/div[2]/mat-dialog-actions/div/button[2]")
    private WebElement btn_import_loc;


    //Action methods
    public void clickRetailer() {
        btn_retailer_loc.click();
    }

    public void clickRewardPoints() {
        btn_rewardspoints_loc.click();
    }

    public void clickAddPointsInBulk() {
        btn_addpointsinbulk_loc.click();
    }

    public void uploadRewardFile() {
       String points_import = properties.getProperty("add_points_bulk_path");
        btn_uploadfile_loc.sendKeys(points_import);
    }

    public void clickImportReward() {
        btn_import_loc.click();
    }




}
