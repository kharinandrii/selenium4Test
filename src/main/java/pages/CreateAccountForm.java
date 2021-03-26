package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccountForm extends BaseClass {

    public CreateAccountForm(WebDriver driver) {
        super(driver);
    }

    By genderMan = By.xpath("//*[@id='id_gender1']");

    public CreateAccountForm chooseManGender() {
        clickOnElement(genderMan);
        return this;
    }


}
