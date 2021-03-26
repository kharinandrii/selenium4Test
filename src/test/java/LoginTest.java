import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test
    public void loginTest() {
        mainPage
                .open()
                .clickOnLogin();
        loginPage
                .checkAccountFormHeaderText(params.loginFormHeaderValue);
    }

}
