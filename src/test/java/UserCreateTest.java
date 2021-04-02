import org.testng.annotations.Test;

public class UserCreateTest extends BaseTest {
    @Test
    public void userCreateTest() {
        mainPage
                .clickOnLogin();
        loginPage
                .checkAccountFormHeaderText(params.loginFormHeaderValue)
                .fillEmailField()
                .clickOnSubmitCreate();
        createAccount
                .chooseManGender()
                .fillFirstNameCustomerField()
                .fillLastNameCustomerField()
                .fillEmailField()
                .fillPasswordField()
                .chooseDateOfBirths()
                .fillFirstNameField()
                .fillLastNameField()
                .fillCityField()
                .fillAddressField()
                .chooseStateSelect()
                .fillPostcodeField()
                .fillMobilePhone()
                .clickOnRegisterButton();
        mainPage
                .clickOnLogOut();
        loginPage
                .fillEmailLoginForm(dataGenerator.myMap.get("email"))
                .fillPasswordLoginForm(params.password)
                .clickSubmitButton();

    }

    @Test
    public void userAuth() {
        mainPage
                .clickOnLogin();
        loginPage
                .fillEmailLoginForm(params.login)
                .fillPasswordLoginForm(params.password)
                .clickSubmitButton();

    }

}
