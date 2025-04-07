package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ExplicitWaits;

public class RemoveRewardPointsPage extends BasePage{
    private ExplicitWaits wait;
    public RemoveRewardPointsPage(WebDriver driver) {
        super(driver);
        this.wait=new ExplicitWaits(driver);
    }

    //Locators
    @FindBy(xpath = "/html/body/anms-root/div/mat-sidenav-container/mat-sidenav/div/mat-nav-list/app-menu-list-item/div[8]")
    private WebElement btn_retailers_loc;
    @FindBy(xpath = "//html/body/anms-root/div/mat-sidenav-container/mat-sidenav/div/mat-nav-list/app-menu-list-item/div[8]/div/a[5]")
    private WebElement btn_rewards_loc;
    @FindBy(xpath = "/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div[2]/reward-points/div/div/div/mat-card[1]/div/div/div/div/div/div/div[1]/input")
    private WebElement fld_search_retailer_loc;
    @FindBy(xpath = "/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div[2]/reward-points/div/div/div/mat-card[1]/div/div/div/div/div/div/div[2]/button")
    private WebElement btn_search_retailer_loc;
    @FindBy(xpath = "/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div[2]/reward-points/div/div/div/mat-card[2]/div/table/tbody/tr/td[4]/button")
    private WebElement btn_edit_retailer_loc;
    @FindBy(xpath = "/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div[2]/add-points/div/div/div/mat-card/mat-card-content/form/div[1]/div/mat-label/mat-radio-group/mat-radio-button[2]")
    private WebElement radio_remove_points_loc;
    @FindBy(xpath = "/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div[2]/add-points/div/div/div/mat-card/mat-card-content/form/div[2]/div[1]/div/div/ng-select")
    private WebElement slt_reasons_dropdownloc;
    @FindBy(xpath = "/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div[2]/add-points/div/div/div/mat-card/mat-card-content/form/div[2]/div[1]/div/div/ng-select/ng-dropdown-panel/div/div[2]/div[2]")
    private WebElement slt_reason_loc;
    @FindBy(xpath = "/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div[2]/add-points/div/div/div/mat-card/mat-card-content/form/div[3]/div/mat-form-field/div/div[1]/div[3]/input")
    private WebElement fld_points_remove_loc;
    @FindBy(xpath = "/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div[2]/add-points/div/div/div/mat-card/mat-card-content/form/div[4]/div/button[2]")
    private WebElement btn_confirm_loc;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/pop-up/div/mat-dialog-actions/div/button[2]")
    private WebElement btn_yes_confirm_loc;
    @FindBy(xpath = "/html/body/div[2]/div/div/snack-bar-container")
    private WebElement pop_up_confirmation_loc;



    //Action Methods
    public void clickRetailers() {
        btn_retailers_loc.click();
    }

    public void clickRewards() {
        btn_rewards_loc.click();
    }

    public void enterRetailerNumber() {
        fld_search_retailer_loc.sendKeys(properties.getProperty("reward_retailer_number"));
    }

    public void searchRetailer() {
        btn_search_retailer_loc.click();
    }

    public void clickEditRetailer() {
        btn_edit_retailer_loc.click();
    }

    public void selectRemovePoints() {
        //wait.waitForElementToBeVisible(radio_remove_points_loc);
        radio_remove_points_loc.click();
    }

    public void selectReasonDropdown(){
        slt_reasons_dropdownloc.click();
    }

    public void selectReason(){
        slt_reason_loc.click();
    }

    public void addPointsValue(){
        fld_points_remove_loc.sendKeys(properties.getProperty("remove_points_value"));
    }

    public void clickConfirmButton(){
        btn_confirm_loc.click();
    }

    public void clickYesButton(){
        btn_yes_confirm_loc.click();
    }



    public void validatePopupMessage() {
        if (pop_up_confirmation_loc.isDisplayed()){
            System.out.println("Pop-up is Displayed with following message : " +pop_up_confirmation_loc.getText());
        }
        else {
            System.out.println("Pop-up is not Displayed with following message : " +pop_up_confirmation_loc.getText());
        }
    }











}
