package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
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

    @BeforeMethod(alwaysRun = true)
    public void setUp(ITestContext context) {
        log.info("start test");
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
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
