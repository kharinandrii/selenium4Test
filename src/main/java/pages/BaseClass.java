package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.Assert;

import java.time.Duration;
import java.util.HashMap;
import java.util.Locale;


public class BaseClass {

    public WebDriver driver;
    public WebDriverWait wait;



    public BaseClass(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    String URL = "http://automationpractice.com/index.php";

    public void waitVisibility(By elementBy) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }

    public void clickOnElement(By elementBy) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).click();
    }
    public void checkText(By elementBy, String expectedText) {
        waitVisibility(elementBy);
        String actualText = driver.findElement(elementBy).getText().toLowerCase();
        Assert.assertEquals(expectedText, actualText);
    }
    public void fillDataInField(By elementBy, String text) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).sendKeys(text);
    }
}
//TODO для апи тестов https://restful-booker.herokuapp.com/apidoc/index.html#api-Auth-CreateToken