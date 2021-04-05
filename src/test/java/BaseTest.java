import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;
import pages.*;


public class BaseTest {
    WebDriver driver;
    MainPage mainPage;
    LoginPage loginPage;
    Params params;
    RegistrationForm createAccount;
    DataGenerator dataGenerator;
    AccountPage accountPage;
    PersonalInfoPage personalInfoPage;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        mainPage = PageFactory.initElements(driver, MainPage.class);
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        params = PageFactory.initElements(driver, Params.class);
        createAccount = PageFactory.initElements(driver, RegistrationForm.class);
        dataGenerator = PageFactory.initElements(driver, DataGenerator.class);
        accountPage = PageFactory.initElements(driver, AccountPage.class);
        personalInfoPage = PageFactory.initElements(driver, PersonalInfoPage.class);
        mainPage.open();
    }
    @BeforeTest
    public void openPage() {

    }

    @AfterClass
    public void closeDriver() {
        driver.quit();
    }

}
