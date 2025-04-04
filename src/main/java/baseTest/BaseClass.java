package baseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pageObjects.LoginPage;

import java.util.concurrent.TimeUnit;

public class BaseClass {

    public WebDriver driver;
    private LoginPage loginPage;




    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        String baseUrl = "https://stage.nurture.farm/reward-points";
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        loginPage=new LoginPage(driver);
        loginPage.setPhoneNumber("9425790844");
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

