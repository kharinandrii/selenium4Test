import org.testng.annotations.Test;

public class UserLoginTest extends BaseTest{
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
