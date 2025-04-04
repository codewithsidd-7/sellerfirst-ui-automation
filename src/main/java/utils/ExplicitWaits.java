package utils;

import baseTest.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaits {
    private WebDriver driver;
    private WebDriverWait wait;

    public ExplicitWaits(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Default timeout of 10 seconds
    }

    // Wait for an element to be visible
    public void waitForElementToBeVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    // Wait for an element to be clickable
    public void waitForElementToBeClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    // Wait for an element to be present in the DOM
    public void waitForElementToBePresent(WebElement element) {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(element.getAttribute("id"))));
    }

    // Wait for an element to disappear
    public void waitForElementToDisappear(WebElement element) {
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    // Wait for an element to be selected (checkbox, radio button)
    public void waitForElementToBeSelected(WebElement element) {
        wait.until(ExpectedConditions.elementToBeSelected(element));
    }

}
