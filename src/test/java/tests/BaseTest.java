package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.testng.ITestContext;
import org.testng.annotations.*;
import pages.*;

import java.util.concurrent.TimeUnit;

@Log4j2
@Listeners(TestListener.class)
public abstract class BaseTest {
    WebDriver driver;
    String username, password;

    LoginPage loginPage;
    SingUpPage singUpPage;
    SingUpModalPage singUpModalPage;
    MainPage mainPage;
    NavbarPage navbarPage;
    LogNavbarPage logNavbarPage;
    PremiumPackagePage premiumPackagePage;

    @Parameters({"browser"})
    @BeforeMethod(alwaysRun = true)
    public void setUp(ITestContext context,@Optional("chrome") String browser) {
        log.info("start test");
        log.info(browser);

        if (browser.contains("chrome")) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");
            options.addArguments("--disable-popup-blocking");
            driver = new ChromeDriver(options);

        } else if (browser.contains("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            FirefoxOptions options=new FirefoxOptions();
            options.addArguments("--start-maximized");
            options.addArguments("--disable-popup-blocking");
            driver = new FirefoxDriver();

        } else if (browser.contains("opera")) {
            WebDriverManager.operadriver().setup();
            OperaOptions options = new OperaOptions();
            options.addArguments("--start-maximized");
            options.addArguments("--disable-popup-blocking");
            driver = new OperaDriver(options);

        } else if (browser.contains("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        context.setAttribute("driver", driver);
        username = System.getenv().getOrDefault("QASE_USERNAME", utils.PropertyReader.getProperty("fitDay.username"));
        password = System.getenv().getOrDefault("QASE_PASSWORD", utils.PropertyReader.getProperty("fitDay.password"));

        loginPage = new LoginPage(driver);
        singUpPage = new SingUpPage(driver);
        singUpModalPage = new SingUpModalPage(driver);
        mainPage = new MainPage(driver);
        navbarPage = new NavbarPage(driver);
        logNavbarPage = new LogNavbarPage(driver);
        premiumPackagePage = new PremiumPackagePage(driver);

    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        log.info("finish test");
        driver.quit();
    }
}
