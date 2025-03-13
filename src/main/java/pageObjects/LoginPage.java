package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class LoginPage extends BasePage{

     WebDriver driver;


    //Constructor usigg BasePage
    public LoginPage(WebDriver driver) {
       super(driver);
    }
    //Locators
    @FindBy(css = "input[type=\"text\"]")
    private WebElement txt_phn_loc;
    @FindBy(css = "button[type=\"submit\"]")
    private WebElement sendotp_btn_loc;
    @FindBy (css = "input[class*=\"otp-input\"]")
    private List<WebElement> elements;
    @FindBy(css = "button[type=\"submit\"]")
    private WebElement login_btn_loc;


    public void setPhoneNumber(String number)
    {
        txt_phn_loc.sendKeys(number);
    }

    public void clickSendOtp ()
    {
        sendotp_btn_loc.click();
    }

    public void enterOtp (String number)
    {

        for(int i=0;i<elements.size();i++){
            char c=number.charAt(i);
            String word="";
            word+=c;
            elements.get(i).sendKeys(word);
            word="";
        }
    }


    public void clickLogin (){
        login_btn_loc.click();
    }

}
