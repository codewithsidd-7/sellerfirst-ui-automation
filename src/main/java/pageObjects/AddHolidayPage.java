package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.FetchProperties;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class AddHolidayPage extends BasePage {

    public AddHolidayPage(WebDriver driver){
        super(driver);
    }

    //Locators
    @FindBy(css = "img[src*=\"profile\"]")
    private WebElement btn_profile_loc;
    @FindBy(xpath = "//div[contains(text(), 'Holidays')]")
    private WebElement btn_holiday_loc;
    @FindBy(css="button[class*=\"mat-stroked-button\"] ")
    private WebElement btn_uploadholiday_loc;
    @FindBy(css = "input[type=\"file\"]")
    private WebElement btn_addholiday_loc;
    @FindBy(css="button[class*=primary-button]")
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
        String holiday_import = properties.getProperty("holiday_import_path");
        String absolutePath=FetchProperties.fetchAbsoluteFilePath(holiday_import);

        btn_addholiday_loc.sendKeys(absolutePath);
    }


    public void clickImportHoliday() {
        btn_importholiday_loc.click();
    }
    public void printUploadedHoliday(){
        for (int i=1; i<=rowsize;i++){
            for (int j = 1; j<colsize; j++){
                System.out.println(driver.findElement(By.xpath("/html/body/anms-root/div/mat-sidenav-container/mat-sidenav-content/div/div/div[2]/edd-holidays/div/div/div/mat-card[2]/div/table/tbody/tr["+ i +"]/td["+ j +"]")).getText());
            }
        }
    }
}

