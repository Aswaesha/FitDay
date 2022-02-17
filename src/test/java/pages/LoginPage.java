package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static pages.NavbarPage.MAIN_ITEM_NAVBAR;


@Log4j2
public class LoginPage extends BasePage {
    public static final By USER_INPUT = By.id("Username");
    public static final By USERNAME_INPUT = By.id("username");
    public static final By PASSWORD_INPUT = By.xpath("//input[@type='password']");
    public static final By SING_UP_BUTTON = By.xpath("//input[@value='Sign Up']");
    public static final By ERROR_MASSAGE_NAME = By.xpath("//p[text()='Username is required.']");
    public static final By ERROR_MASSAGE_PASSWORD = By.xpath("//p[text()='Password is required.']");

    @Step("Open login page")
    public LoginPage open() {
        driver.get(BASE_URL + "/fitness/Login.html");
        log.info("open page login");
        return this;
    }
    private int count;
    @Step("Login process")
    public MainPage login(String userName, String password) {
        driver.findElement(USERNAME_INPUT).sendKeys(userName);
        log.info("Enter user name ");
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        log.info("Enter password");
        driver.findElement(LOGIN_BUTTON).click();
        log.info("Click on login button");
        if (!isExist(By.xpath(String.format(MAIN_ITEM_NAVBAR, "ARTICLES"))) && count < 10){
            count++;
            log.info("###### attempt number: " + count);
            login(userName, password);
        }
        return new MainPage(driver);
    }

    @Step("Login process")
    public MainPage loginError(String userName, String password) {
        driver.findElement(USERNAME_INPUT).sendKeys(userName);
        log.info("Enter user name ");
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        log.info("Enter password");
        driver.findElement(LOGIN_BUTTON).click();
        log.info("Click on login button");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return new MainPage(driver);
    }

    @Step("Get error massage")
    public String getErrorMassageUsername() {
        log.info("get error massage for user name");
        return driver.findElement(ERROR_MASSAGE_NAME).getText();
    }

    @Step("Get error massage")
    public String getErrorMassagePassword() {
        log.info("get error massage for password");
        return driver.findElement(ERROR_MASSAGE_PASSWORD).getText();
    }

    @Step("Click on links - I Forgot My Password")
    public void clickForgotLink() {
        driver.findElement(FORGOT_LINK).click();
        log.info("click on forgot link");
    }

    @Step("Click on links - Create My Free FitDay Account")
    public void clickCreateFreeAccountLink() {
        driver.findElement(CREATE_LINK).click();
        log.info("click on Create free account link");
    }

    @Step("Check input after click on I Forgot My Password")
    public boolean checkoutInputAtPage() {
        return driver.findElement(USER_INPUT).isDisplayed();
    }

    @Step("Check button sing up after click on Create My Free FitDay Account")
    public boolean checkoutButtonSingUp() {
        return driver.findElement(SING_UP_BUTTON).isDisplayed();
    }

    @Override
    public boolean isPageOpen() {
        return isExist(USERNAME_INPUT);
    }

    public LoginPage(WebDriver driver) {
        super(driver);
    }

}
