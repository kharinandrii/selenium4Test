package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PersonalInfoPage extends BaseClass {

    public PersonalInfoPage(WebDriver driver) {
        super(driver);
    }

    DataGenerator dataGenerator = new DataGenerator();
    Params params = new Params();

    By firstNameField = By.xpath("//*[@id='firstname']");
    By lastNameField = By.xpath("//*[@id='lastname']");
    By emailField = By.xpath("//*[@id='email']");
    By currentPasswordField = By.xpath("//*[@id='old_passwd']");
    By saveFormButton = By.xpath("//*[@name='submitIdentity']");


    public PersonalInfoPage checkDataInFirstNameField() {
        checkDataInField(firstNameField,dataGenerator.myMap.get("firstName"));
        return this;
    }
    public PersonalInfoPage checkDataInLastNameField() {
        checkDataInField(lastNameField, dataGenerator.myMap.get("lastName"));
        return this;
    }
    public PersonalInfoPage checkDataInEmailField() {
        checkDataInField(emailField, dataGenerator.myMap.get("email"));
        return this;
    }
    public PersonalInfoPage fillCurrentPassword() {
        fillDataInField(currentPasswordField, params.password);
        return this;
    }
    public PersonalInfoPage saveForm() {
        clickOnElement(saveFormButton);
        return this;
    }
}
