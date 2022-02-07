package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

@Log4j2
public class NavbarPage extends BasePage {
    public static final String MAIN_ITEM_NAVBAR = "//a[span[text()='%s']]";
    public static final String SIDE_ITEM_BUTTON_NAVBAR = "//ul[not(contains(@style, 'none'))]/li//a[text()='%s']";
    //public static final By LINK = By.xpath("//ul[@class='dropdown']//ul[@class='sub_menu']//li//a[text()='Forums']");

    @Step("Click on items navbar")
    public void selectMenuOption(String firstMenuOption) throws InterruptedException {
        log.info("click start");
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath(String.format(MAIN_ITEM_NAVBAR, firstMenuOption)));
        action.moveToElement(we).build().perform();
        Thread.sleep(5000);
    }
    @Step("Click on items navbar")
    public void selectSecondMenuOption(String secondMenuOption) throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath(String.format(SIDE_ITEM_BUTTON_NAVBAR, secondMenuOption))).click();
        Thread.sleep(5000);
        log.info("click on item articles navbar");
    }

    @Step("Click on item navbar")
    public void clickOnNavbar(String menuOption) {
        driver.findElement(By.xpath(String.format(MAIN_ITEM_NAVBAR, menuOption))).click();
        log.info("click on articles navbar");

    }

    public NavbarPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        log.info("cheaclgfnc ");
        return isExist(TITLE_CATEGORIES);
    }

}
