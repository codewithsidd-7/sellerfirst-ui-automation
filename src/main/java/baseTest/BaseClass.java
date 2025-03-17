package baseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pageObjects.BasePage;

import java.util.concurrent.TimeUnit;

public class BaseClass {
     public WebDriver driver;




    @BeforeMethod
    public void setup() {
        driver=new ChromeDriver();
        String baseUrl = "https://stage.nurture.farm/reward-points";
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();


    }
    public WebDriver accessing(){
        return driver;
    }

    @AfterMethod
    public void teardown() {
        // Quit WebDriver
        if (driver != null) {
            driver.quit();
        }
    }
}

