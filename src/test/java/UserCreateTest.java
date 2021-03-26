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
                .chooseManGender();
    }

}
