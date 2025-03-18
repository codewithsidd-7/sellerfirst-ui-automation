package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ExplicitWaits;
import utils.FetchProperties;

public class RemovePointsBulkPage extends BasePage {
    public RemovePointsBulkPage (WebDriver driver) {
        super(driver);
    }

    //Locators
    @FindBy(css = "img[src*=\"customer\"]")
    private WebElement btn_retailer_loc;
    @FindBy(xpath = "//div[contains(text(), \" Reward Points \")]")
    private WebElement btn_rewardspoints_loc;
    @FindBy(xpath = "//span[text()=\"Remove Points in Bulk\"]/parent::button")
    private WebElement btn_removepointsinbulk_loc;
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

    public void clickRemovePointsInBulk() {
        btn_removepointsinbulk_loc.click();
    }

    public void uploadRewardFile() {
        String relative_path = properties.getProperty("remove_points_bulk_path");
        String points_import= FetchProperties.fetchAbsoluteFilePath(relative_path);


        btn_uploadfile_loc.sendKeys(points_import);
    }

    public void clickImportReward() {

        btn_import_loc.click();
    }

}
