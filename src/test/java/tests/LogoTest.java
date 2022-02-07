package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LogoTest extends BaseTest {
    @Test(description = "Logo is open on main page")
    public void logoTest() throws InterruptedException{
        loginPage.open()
                .login(username, password)
                .isPageOpen();

        boolean logoIsHere = logoPage
                .isPageOpen();

        assertTrue(logoIsHere, "Logo not show");
    }

}
