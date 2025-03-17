package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.FetchProperties;
import java.util.Properties;

//Global Constructor
public class BasePage {
    static Properties properties;
    static {
        properties = FetchProperties.fetchConfigValues();
    }
    WebDriver driver;
    public BasePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

}
