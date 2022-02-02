package pages;

import elements.Input;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import models.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@Log4j2
public class SingUpModalPage extends BasePage {

    public static final By ROBOT_CHECKBOX = By.xpath("//span[@id='recaptcha-anchor']//div");
    public static final By CHECKBOX = By.id("Agree");
    public static final By SIGNUP_BUTTON = By.xpath("//input[@value='Sign Up']");
    public static final By TITLE = By.xpath("//h1[text()='JOIN FITDAY']");

    public SingUpModalPage(WebDriver driver) {
        super(driver);
    }

    public SingUpPage create(Account account) {
        new Input(driver, "Username").write(account.getUserName());
        new Input(driver, "Password").write(account.getPassword());
        new Input(driver, "Confirm Password").write(account.getPassword());
        new Input(driver, "Email").write(account.getEmail());
        clickRobot();
        clickCheckBox();
        return clickSingUp();
    }

    public SingUpPage createWithInvalidPassword(Account account) {
        new Input(driver, "Username").write(account.getUserName());
        new Input(driver, "Password").write("123");
        new Input(driver, "Confirm Password").write("123");
        new Input(driver, "Email").write(account.getEmail());
        return clickSingUp();
    }

    public SingUpPage createWithDifferentPassword(Account account) {
        new Input(driver, "Username").write(account.getUserName());
        new Input(driver, "Password").write("123");
        new Input(driver, "Confirm Password").write("12345");
        new Input(driver, "Email").write(account.getEmail());
        return clickSingUp();
    }

    public SingUpPage createWithInvalidName(Account account) {
        new Input(driver, "Username").write("Ann");
        new Input(driver, "Password").write(account.getPassword());
        new Input(driver, "Confirm Password").write(account.getPassword());
        new Input(driver, "Email").write(account.getEmail());
        clickCheckBox();
        return clickSingUp();
    }

    public SingUpPage createWithInvalidEmail(Account account) {
        new Input(driver, "Username").write(account.getUserName());
        new Input(driver, "Password").write(account.getPassword());
        new Input(driver, "Confirm Password").write(account.getPassword());
        new Input(driver, "Email").write("peteyeononnigmail.com");
        clickCheckBox();
        return clickSingUp();
    }

    @Step("Click on button Sing up")
    public SingUpPage clickRobot() {
        WebElement iFrame = driver.findElement(By.xpath("//iframe"));
        driver.switchTo().frame(iFrame);
        WebElement iFrame_checkbox = driver.findElement(By.xpath("//span[@id='recaptcha-anchor']"));
        iFrame_checkbox.click();
        log.info("click on Sing up button");
        return new SingUpPage(driver);
    }

    @Step("Click on button Sing up")
    public SingUpPage clickCheckBox() {
        driver.findElement(CHECKBOX).click();
        log.info("click on Sing up button");
        return new SingUpPage(driver);
    }

    @Step("Click on button Sing up")
    public SingUpPage clickSingUp() {
        driver.findElement(SIGNUP_BUTTON).click();
        log.info("click on Sing up button");
        return new SingUpPage(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(TITLE);
    }

}
