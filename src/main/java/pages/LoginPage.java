package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v85.log.Log;

public class LoginPage extends BaseClass{

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    DataGenerator dataGenerator = new DataGenerator();

    private By createAccountFormHeader = By.xpath("//*[@id = 'create-account_form']/h3");
    private By emailForCreateForm = By.xpath("//*[@id='create-account_form']//*[@id='email_create']");
    private By submitCreate = By.xpath("//*[@id='create-account_form']//*[@id='SubmitCreate']");
    private By emailLoginForm = By.xpath("//*[@id='login_form']//*[@id='email']");
    private By passwordLoginForm = By.xpath("//*[@id='login_form']//*[@id='passwd']");
    private By submitButton = By.xpath("//*[@id='login_form']//*[@id='SubmitLogin']");


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

    public LoginPage fillEmailLoginForm(String login) {
        fillDataInField(emailLoginForm, login);
        return this;
    }
    public LoginPage fillPasswordLoginForm(String password) {
        fillDataInField(passwordLoginForm, password);
        return this;
    }
    public LoginPage clickSubmitButton() {
        clickOnElement(submitButton);
        return this;
    }

}
