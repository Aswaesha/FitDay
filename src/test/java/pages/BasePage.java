package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

@Log4j2
public abstract class BasePage {
    WebDriver driver;
    WebDriverWait wait;

    public static final String BASE_URL = "https://www.fitday.com";
    public static final By FORGOT_LINK = By.xpath("//p[@class='links']//a[1]");
    public static final By CREATE_LINK = By.xpath("//p[@class='links']//a[2]");
    public static final By TITLE = By.xpath("//h1[text()='JOIN FITDAY']");
    public static final By TITLE_CATEGORIES = By.xpath("//h2[@id='page-title']");
    public static final By FORUMS_TITLE = By.xpath("//ul//li/a[text()='Forums']");
    public static final By FITNESS_BUTTON = By.xpath("//div[@class='main-cat']//a[text()='Fitness']");

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
    }

    public abstract boolean isPageOpen();

    protected boolean isExist(By locator) {
        try {
            return driver.findElement(locator).isDisplayed();

        } catch (NoSuchElementException ex) {
            log.error(">>> !!!" + ex.getMessage());
            return false;
        }

    }
}
