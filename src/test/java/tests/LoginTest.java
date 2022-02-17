package tests;

import org.testng.annotations.Test;
import utils.AllureUtils;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {
    @Test(description = "Check positive login process")
    public void positiveLogin(){
        loginPage
                .open()
                .login(username, password);

        assertEquals(navbarPage.checkoutTitles(), "Dashboard","HomePage not open");
        AllureUtils.takeScreenshot(driver);
    }

    @Test(description = "Check login without user name")
    public void negativeLoginWithoutUsername(){
        loginPage.open()
                .loginError("", password);

        assertEquals(loginPage.getErrorMassageUsername(), "Username is required.", "Massage not found");
    }

    @Test(description = "Check login without user password")
    public void negativeLoginWithoutPassword(){
        loginPage.open()
                .loginError(username, "");

        assertEquals(loginPage.getErrorMassagePassword(), "Password is required.", "Massage not found");
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
}
