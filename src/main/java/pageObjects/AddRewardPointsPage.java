package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddRewardPointsPage extends BasePage {
    public AddRewardPointsPage(WebDriver driver) {
        super(driver);
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
    @FindBy(xpath = "/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div[2]/add-points/div/div/div/mat-card/mat-card-content/form/div[2]/div[1]/div/div/ng-select")
    private WebElement drp_reasons_loc;
    @FindBy(xpath = "/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div[2]/add-points/div/div/div/mat-card/mat-card-content/form/div[2]/div[1]/div/div/ng-select/ng-dropdown-panel/div/div[2]/div[3]")
    private WebElement slt_offer_cashback_reason_loc;
    @FindBy(xpath = "/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div[2]/add-points/div/div/div/mat-card/mat-card-content/form/div[2]/div[3]/div[1]/mat-form-field/div/div[1]/div[1]/input")
    private WebElement fld_calender_startdate_loc;
    @FindBy(xpath = "/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div[2]/add-points/div/div/div/mat-card/mat-card-content/form/div[2]/div[3]/div[2]/mat-form-field/div/div[1]/div[1]/input")
    private WebElement fld_calender_enddate_loc;
    @FindBy(xpath = "/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div[2]/add-points/div/div/div/mat-card/mat-card-content/form/div[3]/div/mat-form-field/div/div[1]/div[3]/input")
    private WebElement fld_points_loc;
    @FindBy(xpath = "/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div[2]/add-points/div/div/div/mat-card/mat-card-content/form/div[4]/div/button[2]")
    private WebElement btn_confirm_loc;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/pop-up/div/mat-dialog-actions/div/button[2]")
    private WebElement btn_confirm_yes_loc;
    @FindBy(xpath = "/html/body/div[2]/div/div/snack-bar-container/div/div/simple-snack-bar/span")
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

    public void selectAddPoints() {
        drp_reasons_loc.click();
    }

    public void selectReasonToAddPoints() {
        slt_offer_cashback_reason_loc.click();
    }

    public void selectStartDate() {
        fld_calender_startdate_loc.sendKeys(properties.getProperty("reward_start_date"));
    }

    public void selectEndDate() {
        fld_calender_enddate_loc.sendKeys(properties.getProperty("reward_end_date"));
    }

    public void enterPoints() {
        fld_points_loc.sendKeys(properties.getProperty("add_points_value"));
    }

    public void clickConfirmButton() {
        btn_confirm_loc.click();
    }

    public void clickYesButton() {
        btn_confirm_yes_loc.click();
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
