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
    By firstNameField = By.xpath("//*[@id='customer_firstname']");
    By lastNameField = By.xpath("//*[@id='customer_lastname']");
    By emailField = By.xpath("//*[@id='email']");
    By passwordField = By.xpath("//*[@id='passwd']");
    By dayOfBirth = By.xpath("//*[@id='days']");
    By monthOfBirth = By.xpath("//*[@id='months']");
    By yearsOfBirth = By.xpath("//*[@id='years']");

    public RegistrationForm chooseManGender() {
        clickOnElement(genderMan);
        return this;
    }
    public RegistrationForm fillFirstNameField() {
        fillDataInField(firstNameField, dataGenerator.userFirstName());
        return this;
    }
    public RegistrationForm fillLastNameField() {
        fillDataInField(lastNameField, dataGenerator.myMap.get("lastName"));
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
            //selectByIndex(monthOfBirth, dataGenerator.getRandomIndexByMonth());
           // selectByIndex(yearsOfBirth ,dataGenerator.getRandomIndexByYears());
        }if(dataGenerator.getRandomValueByYears() / 4 != 0 && dataGenerator.getRandomIndexByMonth() == 2) {
            selectByIndex(dayOfBirth, dataGenerator.getRandomIndexBy28Days());
            //selectByIndex(monthOfBirth, dataGenerator.getRandomIndexByMonth());
            //selectByIndex(yearsOfBirth ,dataGenerator.getRandomIndexByYears());
        }if(dataGenerator.getRandomIndexByMonth() == 1 && dataGenerator.getRandomIndexByMonth() == 3 && dataGenerator.getRandomIndexByMonth() == 5
        && dataGenerator.getRandomIndexByMonth() == 7 && dataGenerator.getRandomIndexByMonth() == 8 && dataGenerator.getRandomIndexByMonth() == 10
        && dataGenerator.getRandomIndexByMonth() == 12) {
            selectByIndex(dayOfBirth, dataGenerator.getRandomIndexBy31Days());
            //selectByIndex(monthOfBirth, dataGenerator.getRandomIndexByMonth());
            //selectByIndex(yearsOfBirth ,dataGenerator.getRandomIndexByYears());
        }else{
            selectByIndex(dayOfBirth, dataGenerator.getRandomIndexBy30Days());
        }
        selectByIndex(monthOfBirth, dataGenerator.getRandomIndexByMonth());
        selectByValue(yearsOfBirth ,dataGenerator.myMap.get("randomYear"));
        return this;
    }

//TODO продолжить с заполнения формы
}
