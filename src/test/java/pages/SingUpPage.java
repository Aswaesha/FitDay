package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class SingUpPage extends BasePage {
    public static final By ERROR_MESSAGE_PASSWORD = By.xpath("//p[@for='Password1']");
    public static final By ERROR_MESSAGE_DIFFERENT_PASSWORD = By.xpath("//p[@for='Password2']");
    public static final By ERROR_MESSAGE_INVALID_EMAIL = By.xpath("//p[@for='Email']");
    public static final By ERROR_MESSAGE_NAME = By.xpath("//p[@for='Username']");
    public static final By LOGIN_LINKS = By.xpath("//a[text()='Log in to FitDay']");

    @Override
    public boolean isPageOpen() {
        return isExist(LOGIN_LINKS);
    }



    public SingUpPage(WebDriver driver) {
        super(driver);
    }

    @Step("Get error message for password")
    public String getErrorMessagePassword() {
        return driver.findElement(ERROR_MESSAGE_PASSWORD).getText();
    }

    @Step("Get error message for user name")
    public String getErrorMessageName() {
        return driver.findElement(ERROR_MESSAGE_NAME).getText();
    }

    @Step("Get error message for different password")
    public String getErrorMessageDifferentPassword() {
        return driver.findElement(ERROR_MESSAGE_DIFFERENT_PASSWORD).getText();
    }

    @Step("Get error message for invalid password")
    public String getErrorMessageInvalidEmail() {
        return driver.findElement(ERROR_MESSAGE_INVALID_EMAIL).getText();
    }
}
