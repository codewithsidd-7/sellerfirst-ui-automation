package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AddHolidayPage extends BasePage {

    WebDriver driver;

    public AddHolidayPage(WebDriver driver) {
        super(driver);
    }

    //Locators
    @FindBy(xpath = "/html/body/anms-root/div/mat-sidenav-container/mat-sidenav/div/mat-nav-list/app-menu-list-item/div[10]/mat-list-item")
    private WebElement btn_profile_loc;
    @FindBy(xpath = "/html/body/anms-root/div/mat-sidenav-container/mat-sidenav/div/mat-nav-list/app-menu-list-item/div[10]/div/a[3]/span/div")
    private WebElement btn_holiday_loc;
    @FindBy(xpath = "/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div[2]/edd-holidays/div/div/div/mat-card[1]/div/button")
    private WebElement btn_uploadholiday_loc;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/holiday-import-modal/div/div[2]/div/div/upload-media/input")
    private WebElement btn_addholiday_loc;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/holiday-import-modal/div/div[2]/div/div/mat-dialog-actions/div/button[2]")
    private WebElement btn_importholiday_loc;
    @FindBy(xpath = "/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div[2]/edd-holidays/div/div/div/mat-card[2]/div/table/tbody/tr")
    private List<WebElement> rows;

    int rowsize = rows.size();
    @FindBy(xpath = "/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div[2]/edd-holidays/div/div/div/mat-card[2]/div/table/tbody/tr/td")
    private List<WebElement> cols;
    int colsize = cols.size();






    //Action methods
    public void clickProfile() {
        btn_profile_loc.click();
    }

    public void clickHoliday() {
        btn_holiday_loc.click();
    }

    public void clickUploadHoliday() {
        btn_uploadholiday_loc.click();
    }

    public void uploadHolidayFile() {
        btn_addholiday_loc.sendKeys("/home/neebal/Downloads/holiday import selenium test.csv");
    }

    public void clickImportHoliday() {
        btn_importholiday_loc.click();
    }
    public void checkCorrectData(){
        for (int i=1; i<=rowsize;i++){
            for (int j = 1; j<colsize; j++){
                System.out.println(driver.findElement(By.xpath("/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div[2]/edd-holidays/div/div/div/mat-card[2]/div/table/tbody/tr["+ i +"]/td["+ j +"]")).getText());
            }
        }
    }
}

