package baseTest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pageObjects.LoginPage;

import java.util.concurrent.TimeUnit;

import static pageObjects.BasePage.properties;

public class BaseClass {

    public WebDriver driver;
    public Logger logger;
    private LoginPage loginPage;

    public BaseClass() {
        initializeDriver();
    }

    public void initializeDriver() {
        String browser = properties.getProperty("browser", "chrome");
        boolean headless = Boolean.parseBoolean(properties.getProperty("run_headless", "false"));

        if (browser.equalsIgnoreCase("chrome")) {
            ChromeOptions options = new ChromeOptions();

            if (headless) {
                options.addArguments("--headless");
                options.addArguments("--disable-gpu");
                options.addArguments("--window-size=1920,1080");
                options.addArguments("--ignore-certificate-errors");
                options.addArguments("--silent");
                System.out.println("Running in HEADLESS mode");
            } else {
                System.out.println("Running in REGULAR mode");
            }

            driver = new ChromeDriver(options);
        } else {
            throw new RuntimeException("Browser not supported: " + browser);
        }
    }

    @BeforeClass
    public void setup() {
        logger = LogManager.getLogger(this.getClass());
        driver.get(properties.getProperty("base_url"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        loginPage = new LoginPage(driver);
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
