package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPageLoc;

import java.util.concurrent.TimeUnit;

public class LoginTest {

    WebDriver driver;

    @BeforeClass
    void setup() {
        driver = new ChromeDriver();
        String baseUrl = "https://stage.nurture.farm/reward-points";
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @Test
    void testLogin()
    {
        LoginPageLoc lpo = new LoginPageLoc(driver);
        lpo.setPhoneNumber("9425790844");
        lpo.clickSendOtp();
        lpo.enterOtp("1000");
        lpo.clickLogin();
    }

    @AfterClass
    void teardown(){
        driver.quit();
    }
}

