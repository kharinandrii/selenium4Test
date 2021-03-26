package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BaseClass{
    private By createAccountFormHeader = By.xpath("//*[@id = 'create-account_form']/h3");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage checkAccountFormHeaderText(String text) {
            checkText(createAccountFormHeader, text);
            return this;
        }
}
