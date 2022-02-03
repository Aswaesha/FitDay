package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class MainPage extends BasePage {
    public static final By LEARN_MORE_BUTTON = By.xpath("//ul[@class='dropdown']//li");
    public static final By NUTRITION_LINK = By.xpath("//ul[@class='dropdown']//ul[@class='sub_menu']//li//a[text()='Nutrition']");
    public static final By NUTRITION_BUTTON = By.xpath("//div[@class='main-cat']//a[text()='Nutrition']");
    public static final By TITLE = By.xpath("//h2[@id='page-title']");
    public static final By FITNESS_LINK = By.xpath("//ul[@class='dropdown']//ul[@class='sub_menu']//li//a[text()='Fitness']");
    public static final By FORUMS_LINK = By.xpath("//ul[@class='dropdown']//ul[@class='sub_menu']//li//a[text()='Forums']");

    @Step("click on nutrition button")
    public void listClickOnNutritionButton() {
        driver.findElement(NUTRITION_BUTTON).click();
        log.info("click on nutrition button at all categories");
    }

    @Step("click on fitness button")
    public void listClickOnFitnessButton() {
        driver.findElement(FITNESS_BUTTON).click();
        log.info("click on fitness button at all categories");
    }


    @Step("click on learn more button")
    public void listClickOnLearnMore() {
        driver.findElement(LEARN_MORE_BUTTON).click();
        log.info("click on learn more button");
    }

    @Step("click on nutrition at learn more")
    public void listClickOnNutrition() {
        driver.findElement(NUTRITION_LINK).click();
        log.info("click on nutrition");
    }

    @Step("click on fitness  at learn more")
    public void listClickOnFitness() {
        driver.findElement(FITNESS_LINK).click();
        log.info("click on fitness");
    }

    @Step("click on forums  at learn more")
    public void listClickOnForums() {
        driver.findElement(FORUMS_LINK).click();
        log.info("click on forums");
    }

    @Step("Get error massage")
    public String getTextTitleOfPage() {
        log.info("get error massage for titles");
        return driver.findElement(TITLE).getText();
    }

    @Step("Get error massage")
    public String getTextTitleOfForums() {
        log.info("get error massage for forum title");
        return driver.findElement(FORUMS_TITLE).getText();
    }

    public MainPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(LEARN_MORE_BUTTON);
    }
}
