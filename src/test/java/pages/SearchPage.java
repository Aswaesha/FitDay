package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class SearchPage extends BasePage{
    public static final By SEARCH_INPUT = By.xpath("//form[@id='cse-search-box']//input[@name='q']");
    public static final By SEARCH_BUTTON = By.xpath("//form[@id='cse-search-box']//input[@value='Search']");
    public static final By SEARCH_RESULT_LINK = By.xpath("//button[@class='gsc-search-button gsc-search-button-v2']");

    public void searchInput(String text){
        driver.findElement(SEARCH_INPUT).sendKeys(text);
        driver.findElement(SEARCH_BUTTON).click();
    }

    @Step("Open main page")
    public SearchPage open() {
        driver.get(BASE_URL);
        log.info("open main page");
        return this;
    }
    public SearchPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(SEARCH_RESULT_LINK);
    }



}
