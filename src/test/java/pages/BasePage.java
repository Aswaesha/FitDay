package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

@Log4j2
public abstract class BasePage {
    WebDriver driver;
    WebDriverWait wait;

    public static final By HEADER_MENU = By.id("header-menu");
    public static final String BASE_URL = "https://www.fitday.com";
    public static final By TITLE = By.xpath("//h1[text()='JOIN FITDAY']");
    public static final By TITLE_DISCUSSION_BOARDS = By.xpath("//h1//strong");
    public static final By EDIT_BUTTON = By.xpath("//a[@class='edit button']");
    public static final By FORGOT_LINK = By.xpath("//p[@class='links']//a[1]");
    public static final By CREATE_LINK = By.xpath("//p[@class='links']//a[2]");
    public static final By SAVE_BUTTON = By.xpath("//a[@class='save button']");
    public static final By PAGES_ITEM_TITLE = By.xpath("//div[@id='main']//h1");
    public static final By TITLE_CATEGORIES = By.xpath("//h2[@id='page-title']");
    public static final By REPORTS_ITEM_TITLE = By.xpath("//div[@id='main-full']//h1");
    public static final By FITNESS_BUTTON = By.xpath("//div[@class='main-cat']//a[text()='Fitness']");
    public static final By PLUS_BUTTON = By.xpath("//div[@id='food-search-all']//div[@class='fd-search-results']//table//tbody//tr[1]//td[@class='actions']//a");

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
