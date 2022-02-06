package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {
//    @Test(description = "Check positive login process")
//    public void positiveLogin() {
//        boolean isHomePageOpened = loginPage
//                .open()
//                .login(username, password)
//                .isPageOpen();
//
//        assertTrue(isHomePageOpened, "Страница HomePage не открылась");
//    }
    @Test(description = "Check positive login process")
    public void positiveLogin() {
         loginPage
                .open()
                .login(username, password);

         driver.findElement(By.id("header-menu"));
    }

//    @Test(description = "Check login without user name")
//    public void negativeLoginWithoutUsername() {
//        loginPage.open()
//                .login("", password)
//                .isPageOpen();
//
//        assertEquals(loginPage.getErrorMassageUsername(), "Username is required.", "Massage is not found");
//    }
//
//    @Test(description = "Check login without user password")
//    public void negativeLoginWithoutPassword() {
//        loginPage.open()
//                .login(username, "")
//                .isPageOpen();
//
//        assertEquals(loginPage.getErrorMassagePassword(), "Password is required.", "Massage is not found");
//    }
//
//    @Test(description = "Check click on link I Forgot My Password")
//    public void forgetPasswordClick() {
//        loginPage.open()
//                .clickForgotLink();
//
//        assertTrue(loginPage.checkoutInputAtPage(), "Страница HomePage не открылась");
//    }
//
//    @Test(description = "Check click on link Create My Free FitDay Account")
//    public void createMyFreeAccountClick() {
//        loginPage.open()
//                .clickCreateFreeAccountLink();
//
//        assertTrue(loginPage.checkoutButtonSingUp(), "Страница Sing up не открылась");
//    }
}
