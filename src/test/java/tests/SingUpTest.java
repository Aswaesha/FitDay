package tests;

import lombok.extern.log4j.Log4j2;
import models.Account;
import models.AccountFactory;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

@Log4j2
public class SingUpTest extends BaseTest {
    @Test(description = "Input invalid user name")
    public void createMyFreeAccountWithInvalidName() {
        log.info("Start create my free account with invalid name test");
        loginPage.open()
                .clickCreateFreeAccountLink();

        Account account = AccountFactory.get();

        singUpModalPage.createWithInvalidName(account);

        assertEquals(singUpPage.getErrorMessageName(), "Username must be at least 4 characters.", "Error not found");
    }

    @Test(description = "Input invalid password")
    public void createMyFreeAccountWithInvalidPassword() {
        log.info("Start create my free account with invalid password test");
        loginPage.open()
                .clickCreateFreeAccountLink();

        Account account = AccountFactory.get();

        singUpModalPage.createWithInvalidPassword(account);

        assertEquals(singUpPage.getErrorMessagePassword(), "Password must be at least 6 characters.", "Error not found");
    }

    @Test(description = "Input different password")
    public void createMyFreeAccountWithDifferentPassword() {
        log.info("Start create my free account with different password test");
        loginPage.open()
                .clickCreateFreeAccountLink();

        Account account = AccountFactory.get();

        singUpModalPage.createWithDifferentPassword(account);

        assertEquals(singUpPage.getErrorMessageDifferentPassword(), "The passwords you've entered do not match.", "Enter the same password");
    }

    @Test(description = "Input invalid email")
    public void createMyFreeAccountWithInvalidEmail() {
        log.info("Start create my free account with invalid email test");
        loginPage.open()
                .clickCreateFreeAccountLink();

        Account account = AccountFactory.get();

        singUpModalPage.createWithInvalidEmail(account);

        assertEquals(singUpPage.getErrorMessageInvalidEmail(), "Please enter a valid email address.", "Enter valid email");
    }


}
