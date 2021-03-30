package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationForm extends BaseClass {

    public RegistrationForm(WebDriver driver) {
        super(driver);
    }

    DataGenerator dataGenerator = new DataGenerator();
    Params params = new Params();

    By genderMan = By.xpath("//*[@id='id_gender1']");
    By firstNameCustomerField = By.xpath("//*[@id='customer_firstname']");
    By lastNameCustomerField = By.xpath("//*[@id='customer_lastname']");
    By emailField = By.xpath("//*[@id='email']");
    By passwordField = By.xpath("//*[@id='passwd']");
    By dayOfBirth = By.xpath("//*[@id='days']");
    By monthOfBirth = By.xpath("//*[@id='months']");
    By yearsOfBirth = By.xpath("//*[@id='years']");
    By firstNameField = By.xpath("//*[@id='firstname']");
    By lastNameField = By.xpath("//*[@id='lastname']");
    By cityField = By.xpath("//*[@id='city']");
    By stateSelect = By.xpath("//*[@id='id_state']");
    By postCodeField = By.xpath("//*[@id='postcode']");
    By mobilePhoneField = By.xpath("//*[@id='phone_mobile']");
    By registerButton = By.xpath("//*[text()='Register']");
    By addressField = By.xpath("//*[@id='address1']");

    public RegistrationForm chooseManGender() {
        clickOnElement(genderMan);
        return this;
    }
    public RegistrationForm fillFirstNameCustomerField() {
        fillDataInField(firstNameCustomerField, dataGenerator.userFirstName());
        return this;
    }
    public RegistrationForm fillLastNameCustomerField() {
        fillDataInField(lastNameCustomerField, dataGenerator.myMap.get("lastName"));
        return this;
    }
    public RegistrationForm fillEmailField() {
        checkDataInField(emailField, dataGenerator.myMap.get("email"));
        return this;
    }
    public RegistrationForm fillPasswordField() {
        fillDataInField(passwordField, params.password);
        return this;
    }
    public RegistrationForm chooseDateOfBirths() {
        if(dataGenerator.getRandomValueByYears() / 4 == 0 && dataGenerator.getRandomIndexByMonth() == 2) {
            selectByIndex(dayOfBirth, dataGenerator.getRandomIndexBy29Days());
        }if(dataGenerator.getRandomValueByYears() / 4 != 0 && dataGenerator.getRandomIndexByMonth() == 2) {
            selectByIndex(dayOfBirth, dataGenerator.getRandomIndexBy28Days());
        }if(dataGenerator.getRandomIndexByMonth() == 1 && dataGenerator.getRandomIndexByMonth() == 3 && dataGenerator.getRandomIndexByMonth() == 5
        && dataGenerator.getRandomIndexByMonth() == 7 && dataGenerator.getRandomIndexByMonth() == 8 && dataGenerator.getRandomIndexByMonth() == 10
        && dataGenerator.getRandomIndexByMonth() == 12) {
            selectByIndex(dayOfBirth, dataGenerator.getRandomIndexBy31Days());
        }else{
            selectByIndex(dayOfBirth, dataGenerator.getRandomIndexBy30Days());
        }
        selectByIndex(monthOfBirth, dataGenerator.getRandomIndexByMonth());
        selectByValue(yearsOfBirth ,dataGenerator.myMap.get("randomYear"));
        return this;
    }
    public RegistrationForm fillFirstNameField() {
        fillDataInField(firstNameField, dataGenerator.myMap.get("firstName"));
        return this;
    }
    public RegistrationForm fillLastNameField() {
        fillDataInField(lastNameField, dataGenerator.myMap.get("lastName"));
        return this;
    }
    public RegistrationForm fillCityField() {
        fillDataInField(cityField, dataGenerator.getRandomCity());
        return this;
    }
    public RegistrationForm fillAddressField() {
        fillDataInField(addressField, dataGenerator.getRandomAddress());
        return this;
    }
    public RegistrationForm chooseStateSelect() {
        selectByValue(stateSelect, "1");
        return this;
    }
    public RegistrationForm fillPostcodeField() {
        fillDataInField(postCodeField,"12345");
        return this;
    }
    public RegistrationForm fillMobilePhone() {
        fillDataInField(mobilePhoneField, dataGenerator.getRandomPhone());
        return this;
    }
    public RegistrationForm clickOnRegisterButton() {
        clickOnElement(registerButton);
        return this;
    }

//TODO продолжить с заполнения формы
}
