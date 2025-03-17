package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
<<<<<<< Updated upstream
import pages.LoginPageLoc;
=======
import pageObjects.BasePage;
import pageObjects.LoginPage;
>>>>>>> Stashed changes

import java.util.concurrent.TimeUnit;

public class LoginTest {

<<<<<<< Updated upstream
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
=======


    @Test
    void testLogin()
    {

        LoginPage lpo = new LoginPage(accessing());
>>>>>>> Stashed changes
        lpo.setPhoneNumber("9425790844");
        lpo.clickSendOtp();
        lpo.enterOtp("1000");
        lpo.clickLogin();
    }

<<<<<<< Updated upstream
    @AfterClass
    void teardown(){
        driver.quit();
    }
=======

>>>>>>> Stashed changes
}

