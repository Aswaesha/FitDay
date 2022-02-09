package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static pages.NavbarPage.MAIN_ITEM_NAVBAR;


@Log4j2
public class LoginPage extends BasePage {

    public static final By USERNAME_INPUT = By.id("username");
    public static final By USER_INPUT = By.id("Username");
    public static final By PASSWORD_INPUT = By.xpath("//input[@type='password']");
    public static final By LOGIN_BUTTON = By.xpath("//input[@name='login']");
    public static final By SING_UP_BUTTON = By.xpath("//input[@value='Sign Up']");
    public static final By ERROR_MASSAGE_NAME = By.xpath("//p[text()='Username is required.']");
    public static final By ERROR_MASSAGE_PASSWORD = By.xpath("//p[text()='Password is required.']");
    public static final By PC_BUTTON = By.xpath("//li[@class='last']/a//span");
    public static final By PREMIUM_BUTTON = By.xpath("//li[@class='first']/a//span");
    public static final By PRODUCTS_TITLE = By.xpath("//div[@class='Holder']//h1");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Step("Open login page")
    public LoginPage open() {
        driver.get(BASE_URL + "/fitness/Login.html");
        log.info("open page login");
        return this;
    }

    //    @Step("Login process")
//    public void login(String userName, String password) throws InterruptedException {
//        for(int turn= 0;turn<5;turn++){
//            driver.findElement(USERNAME_INPUT).sendKeys(userName);
//            log.info("Enter user name ");
//            driver.findElement(PASSWORD_INPUT).sendKeys(password);
//            log.info("Enter password");
//            Thread.sleep(5000);
//            //driver.findElement(By.id("rememberme")).click();
//            driver.findElement(LOGIN_BUTTON).click();
//            log.info("Click on login button");
//            driver.findElement( By.id("header-menu")).isDisplayed();
//        }}
    //private int count;

    @Step("Login process")
    public HomePage login(String userName, String password) throws InterruptedException {
        driver.findElement(USERNAME_INPUT).sendKeys(userName);
        log.info("Enter user name ");
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        log.info("Enter password");
        Thread.sleep(5000);
        //driver.findElement(By.id("rememberme")).click();
        driver.findElement(LOGIN_BUTTON).click();
        log.info("Click on login button");
        Thread.sleep(3000);
//        if (!isExist(By.xpath(String.format(MAIN_ITEM_NAVBAR, "ARTICLES"))) && count < 10) {
//            count++;
//            log.info("###### attempt number: " + count);
//            login(userName, password);
//        }
        return new HomePage(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(USERNAME_INPUT);
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

    @Step("Click on  FitDay Premium")
    public void clickFitDayPremium() {
        driver.findElement(PREMIUM_BUTTON).click();
        log.info("click on FitDay Premium ");
    }

    @Step("Click on  FitDay PC")
    public void clickFitDayPC() {
        driver.findElement(PC_BUTTON).click();
        log.info("click on FitDay PC");
    }

    @Step("Check title on products pages")
    public String checkoutTitleAtProductPage() {
        return driver.findElement(PRODUCTS_TITLE).getText();
    }

    @Step("Check input after click on I Forgot My Password")
    public boolean checkoutInputAtPage() {
        return driver.findElement(USER_INPUT).isDisplayed();
    }

    @Step("Check button sing up after click on Create My Free FitDay Account")
    public boolean checkoutButtonSingUp() {
        return driver.findElement(SING_UP_BUTTON).isDisplayed();
    }
}
