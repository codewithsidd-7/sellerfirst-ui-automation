package pageObjects;

import baseTest.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ExplicitWaits;
import utils.FetchProperties;

public class AddPointsBulkPage extends BasePage {
    public AddPointsBulkPage(WebDriver driver) {
        super(driver);
    }

    //Locators
    @FindBy(css = "img[src*=\"customer\"]")
    private WebElement btn_retailer_loc;
    @FindBy(xpath = "//div[contains(text(), \" Reward Points \")]")
    private WebElement btn_rewardspoints_loc;
    @FindBy(xpath = "//span[text()=\"Add Points in Bulk\"]/parent::button")
    private WebElement btn_addpointsinbulk_loc;
    @FindBy(css = "input[type=\"file\"]")
    private WebElement btn_uploadfile_loc;
    @FindBy(xpath = "//span[contains(text(),\"Import\")]")
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
       String relative_path = properties.getProperty("add_points_bulk_path");
       String points_import= FetchProperties.fetchAbsoluteFilePath(relative_path);
        btn_uploadfile_loc.sendKeys(points_import);
    }

    public void clickImportReward() {
        btn_import_loc.click();

    }

}
