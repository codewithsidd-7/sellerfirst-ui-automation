package pageObjects;

import baseTest.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

//Global Constructor
public class BasePage {

    public BasePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

}
