import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;
import pages.CreateAccountForm;
import pages.LoginPage;
import pages.MainPage;
import pages.Params;


public class BaseTest {
    WebDriver driver;
    MainPage mainPage;
    LoginPage loginPage;
    Params params;
    CreateAccountForm createAccount;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        mainPage = PageFactory.initElements(driver, MainPage.class);
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        params = PageFactory.initElements(driver, Params.class);
        createAccount = PageFactory.initElements(driver, CreateAccountForm.class);
    }

    @AfterClass
    public void closeDriver() {
        driver.quit();
    }

}
