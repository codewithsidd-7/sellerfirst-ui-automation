package pageObjects;

import com.beust.ah.A;
import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import utils.ExplicitWaits;
import utils.FetchProperties;
import utils.csvReaderandUpdate;

public class OrderFlowPage extends BasePage{
    private Actions actions;
    private ExplicitWaits explicitWaits;
    public OrderFlowPage(WebDriver driver){

        super(driver);
        this.explicitWaits=new ExplicitWaits(driver);
        this.actions=new Actions(driver);
    }
    @FindBy(css="img[src*=orders]")
    private WebElement order_icon_loc;
    @FindBy(xpath = "//div[contains(text(),\" My Orders \")]")
    private WebElement myorder_loc;
    @FindBy(css = "input[placeholder=\"Order Number\"]")
    private WebElement search_order_loc;
    @FindBy(css="button[title=\"Upload Invoice\"]")
    private WebElement upload_button_loc;
    @FindBy(css = "input[formcontrolname=\"invoiceNumber\"]")
    private WebElement invoice_number_loc;
    @FindBy(css="input[type=\"file\"]")
    private WebElement file_upload_loc;
    @FindBy(css="button[type=\"submit\"]")
    private WebElement save_the_file_upload_loc;
    @FindBy(xpath = " //div[contains(text(),\"Schedule and Dispatch\")] ")
    private WebElement scheduled_dispatch_loc;
    @FindBy(css = "input[placeholder*=\"Search by App Order Id\"]")
    private WebElement search_order_scheduled_loc;
    @FindBy(css="button[title=\"Edit\"]")
    private WebElement edit_button_loc;
    @FindBy(css="mat-radio-button[value=\"Yes\"]")
    private WebElement dispatched_loc;
    @FindBy(css="input[formcontrolname=\"mobileNo\"]")
    private WebElement delivery_partner_loc;
    @FindBy(css="ng-select[placeholder=\"Select Transporter Type\"] input")
    private WebElement select_transport_loc;
    @FindBy(css="ng-select[placeholder=\"Select Mile\"] input")
    private WebElement select_mile_loc;
    @FindBy(css="input[formcontrolname=\"lrnumber\"]")
    private WebElement lrnumber_loc;
    @FindBy(css="input[formcontrolname=\"transporterName\"]")
    private WebElement vechical_number_loc;
    @FindBy(xpath="//span[text()=\"Upload Delivered Status\"]//parent::button")
    private WebElement delivery_upload_file_loc;
    @FindBy(css="div[class*=\"app-spinner\"]")
    private WebElement spinner_loader_loc;
    @FindBy(css = "button[title=\"Mark RFD\"]")
    private WebElement mark_for_RFD_loc;
    @FindBy(css = "div[class*=\"pop\"] button[class*=\"primary-button\"] ")
    private WebElement mark_RFD_yes_loc;
    @FindBy(css="delivery-schedule-import-modal button[class*=\"ng-star-inserted\"]")
    private WebElement import_delivery_file;
    @FindBy(css="upload-media input[type=\"file\"]")
    private WebElement upload_delivery_file_loc;
    //img[src*="edit"]

    public void myordersIcon(){
        explicitWaits.waitForElementToBeVisible(order_icon_loc);

        order_icon_loc.click();
        myorder_loc.click();
    }
    public void searchOrder(){
       // explicitWaits.waitForElementToDisappear(spinner_loader_loc);
        search_order_loc.sendKeys(properties.getProperty("order_id"));
        search_order_loc.sendKeys(Keys.ENTER);

    }
    public void uploadInvoiceFile(){
        upload_button_loc.click();
        invoice_number_loc.sendKeys(properties.getProperty("invoice_number"));
        file_upload_loc.sendKeys(FetchProperties.fetchAbsoluteFilePath(properties.getProperty("invoice_upload")));
        save_the_file_upload_loc.click();

    }
    public void markForRED(){
        explicitWaits.waitForElementToDisappear(spinner_loader_loc);
        mark_for_RFD_loc.click();
        mark_RFD_yes_loc.click();

    }
    public void goToScheduledandDispatch(){
        order_icon_loc.click();
        scheduled_dispatch_loc.click();

    }
    public void searchOrderDispatch(){
        search_order_scheduled_loc.sendKeys(properties.getProperty("order_id"));
        search_order_scheduled_loc.sendKeys(Keys.ENTER);

    }
    public void readyForDispatch(){
        edit_button_loc.click();

        delivery_partner_loc.sendKeys(properties.getProperty("Delivery_partner_number"));
        lrnumber_loc.sendKeys(properties.getProperty("lr_number"));
        vechical_number_loc.sendKeys(properties.getProperty("vechicle_number"));
        actions.click(select_transport_loc).sendKeys(properties.getProperty("transport_type"), Keys.ENTER).build().perform();
        actions.click(select_mile_loc).sendKeys(properties.getProperty("mile_Type"),Keys.ENTER).build().perform();
        save_the_file_upload_loc.click();


    }
    public void scheduledOrder(){
        explicitWaits.waitForElementToDisappear(spinner_loader_loc);
        edit_button_loc.click();

        dispatched_loc.click();
        save_the_file_upload_loc.click();
    }
    public void UploadDeliveryFile(){
        explicitWaits.waitForElementToDisappear(spinner_loader_loc);

        delivery_upload_file_loc.click();
        csvReaderandUpdate.orderDelivery(properties.getProperty("order_id"));

        upload_delivery_file_loc.sendKeys(FetchProperties.fetchAbsoluteFilePath(properties.getProperty("order_delivery_path")));
        import_delivery_file.click();
        explicitWaits.waitForElementToDisappear(spinner_loader_loc);


    }

}
