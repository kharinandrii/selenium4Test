package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BaseClass{

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    DataGenerator dataGenerator = new DataGenerator();

    private By createAccountFormHeader = By.xpath("//*[@id = 'create-account_form']/h3");
    private By emailForCreateForm = By.xpath("//*[@id='email_create']");
    private By submitCreate = By.xpath("//*[@id='SubmitCreate']");


    public LoginPage checkAccountFormHeaderText(String text) {
            checkText(createAccountFormHeader, text);
            return this;
        }
    public LoginPage fillEmailField() {
        fillDataInField(emailForCreateForm, dataGenerator.email());
        return this;
    }
    public LoginPage clickOnSubmitCreate() {
        clickOnElement(submitCreate);
        return this;
    }

}
