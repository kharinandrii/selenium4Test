import org.testng.annotations.Test;

public class UserCreateTest extends BaseTest {
    @Test
    public void userCreateTest() {
        mainPage
                .open()
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
    }

}
