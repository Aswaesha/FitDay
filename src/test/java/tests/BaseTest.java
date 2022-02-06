package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import pages.*;


import java.util.concurrent.TimeUnit;

@Listeners(TestListener.class)
public class BaseTest {
    WebDriver driver;
    String username, password;

    LoginPage loginPage;
    SingUpPage singUpPage;
    SingUpModalPage singUpModalPage;
    LogoPage logoPage;
    HomePage homePage;
    SearchPage searchPage;
    MainPage mainPage;
    NavbarPage navbarPage;
    DietitianNavbarPage dietitianNavbarPage;
    ForumsNavbarPage forumsNavbarPage;
    ArticlesNavbarPage articlesNavbarPage;
    HomeNavbarPage homeNavbarPage;
    LogNavbarPage logNavbarPage;
    ReportsNavbarPage reportsNavbarPage;

    @BeforeMethod(alwaysRun = true)
    public void setUp(ITestContext context) {
        WebDriverManager.chromedriver().setup();
       // System.setProperty("webdriver.chrome.driver", "//chrome path in system//");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        options.addArguments("incognito");
        options.addArguments("--disable-popup-blocking");
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
//        driver = new ChromeDriver(capabilities);

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        context.setAttribute("driver", driver);
        username = System.getenv().getOrDefault("QASE_USERNAME", utils.PropertyReader.getProperty("fitDay.username"));
        password = System.getenv().getOrDefault("QASE_PASSWORD", utils.PropertyReader.getProperty("fitDay.password"));

        loginPage = new LoginPage(driver);
        singUpPage = new SingUpPage(driver);
        singUpModalPage = new SingUpModalPage(driver);
        logoPage = new LogoPage(driver);
        homePage = new HomePage(driver);
        searchPage = new SearchPage(driver);
        mainPage = new MainPage(driver);
        navbarPage = new NavbarPage(driver);
        dietitianNavbarPage = new DietitianNavbarPage(driver);
        forumsNavbarPage = new ForumsNavbarPage(driver);
        articlesNavbarPage = new ArticlesNavbarPage(driver);
        homeNavbarPage = new HomeNavbarPage(driver);
        logNavbarPage = new LogNavbarPage(driver);
        reportsNavbarPage = new ReportsNavbarPage(driver);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }
}
