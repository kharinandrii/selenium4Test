package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BaseClass{
    public MainPage(WebDriver driver) {
        super(driver);
    }

    private By loginLink = By.xpath("//a[@class = 'login']");
    private By logOut = By.xpath("//a[text()='Sign out']");

    public MainPage open() {
        driver.get(URL);
        return this;
    }
    public MainPage clickOnLogin() {
        clickOnElement(loginLink);
        return this;
    }
    public MainPage clickOnLogOut() {
        clickOnElement(logOut);
        return this;
    }


}
