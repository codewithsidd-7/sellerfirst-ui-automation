package baseTest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pageObjects.LoginPage;

import java.util.concurrent.TimeUnit;

import static pageObjects.BasePage.properties;

public class BaseClass {

    public WebDriver driver;
    public Logger logger;
    private LoginPage loginPage;
    public BaseClass(){
        driver=new ChromeDriver();
    }



    @BeforeClass
    public void setup() {
        logger= LogManager.getLogger(this.getClass()); //log4j2
        String baseUrl = "https://stage.nurture.farm/reward-points";
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        loginPage=new LoginPage(driver);
        loginPage.setPhoneNumber(properties.getProperty("login_retailer_number"));
        loginPage.clickSendOtp();
        loginPage.enterOtp("1000");
        loginPage.clickLogin();


    }


    @AfterClass
    public void teardown() {

        if (driver != null) {
            driver.quit();
        }
    }
}

