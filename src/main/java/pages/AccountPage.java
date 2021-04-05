package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Locale;

public class AccountPage extends BaseClass {
    public AccountPage(WebDriver driver) {
        super(driver);
    }

    Params params = new Params();

    By h1Account = By.xpath("//*[@id='center_column']/h1");
    By personalInformationLink = By.xpath("//*[text()='My personal information']");
    By successMessage = By.xpath("//*[contains(@class, 'alert-success')]");

    public AccountPage getH1Text() {
        getElementText(h1Account, params.h1AccountPage.toUpperCase());
        return this;
    }

    public AccountPage openPersonalInfoPage() {
        clickOnElement(personalInformationLink);
        return this;
    }
    public AccountPage checkSuccessMessage() {
        getElementText(successMessage, params.successMassage1);
        return this;
    }
}
