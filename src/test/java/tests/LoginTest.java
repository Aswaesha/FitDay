package tests;

import org.testng.annotations.Test;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {
    @Test(description = "Check positive login process")
    public void positiveLogin() throws InterruptedException {
        boolean isHomePageOpened = loginPage
                .open()
                .login(username, password)
                .isPageOpen();

        assertTrue(isHomePageOpened, "Страница HomePage не открылась");
    }
    
    @Test(description = "Check login without user name")
    public void negativeLoginWithoutUsername() throws InterruptedException {
        loginPage.open()
                .login("", password)
                .isPageOpen();

        assertEquals(loginPage.getErrorMassageUsername(), "Username is required.", "Massage is not found");
    }

    @Test(description = "Check login without user password")
    public void negativeLoginWithoutPassword() throws InterruptedException {
        loginPage.open()
                .login(username, "")
                .isPageOpen();

        assertEquals(loginPage.getErrorMassagePassword(), "Password is required.", "Massage is not found");
    }

    @Test(description = "Check click on link I Forgot My Password")
    public void forgetPasswordClick() {
        loginPage.open()
                .clickForgotLink();

        assertTrue(loginPage.checkoutInputAtPage(), "Страница HomePage не открылась");
    }

    @Test(description = "Check click on link Create My Free FitDay Account")
    public void createMyFreeAccountClick() {
        loginPage.open()
                .clickCreateFreeAccountLink();

        assertTrue(loginPage.checkoutButtonSingUp(), "Страница Sing up не открылась");
    }

    @Test(description = "Check title after click on FitDay premium")
    public void checkTitleClickPremium(){
        loginPage.open();
        loginPage.clickFitDayPremium();

        assertEquals(loginPage.checkoutTitleAtProductPage(), "Premium $4.16 / month", "Title is not found");
    }
    @Test(description = "Check Check title after click on FitDay pc")
    public void checkTitleClickPc() {
        loginPage.open();
        loginPage.clickFitDayPC();

        assertEquals(loginPage.checkoutTitleAtProductPage(), "PC $29.95 (was $39.95)", "Title is not found");
    }
}
