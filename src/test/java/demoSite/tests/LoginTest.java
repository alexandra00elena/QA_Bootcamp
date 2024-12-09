package demoSite.tests;

import demoSite.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testLogin01() {
        driver.get(baseUrl +"/signin/");
        LoginPage loginPage = new LoginPage(driver);

        Assert.assertEquals(loginPage.getHeaderText(), loginPage.getHeaderStaticText());
        loginPage.login("zebra", "zebrapassword");

        Assert.assertEquals(loginPage.getHeaderText(), "Welcome to web-stubs, zebra!");
    }

    @Test
    public void testLogin02() {
        driver.get(baseUrl +"/signin/");
        LoginPage loginPage = new LoginPage(driver);

        Assert.assertEquals(loginPage.getHeaderText(), loginPage.getHeaderStaticText());
        loginPage.login("dingo", "dingopassword");

        Assert.assertEquals(loginPage.getHeaderText(), "Welcome to web-stubs, dingo!");
    }

    @Test
    public void testLogin03() {
        driver.get(baseUrl +"/signin/");
        LoginPage loginPage = new LoginPage(driver);

        Assert.assertEquals(loginPage.getHeaderText(), loginPage.getHeaderStaticText());
        loginPage.login("camel", "camelpassword");

        Assert.assertEquals(loginPage.getHeaderText(), "Welcome to web-stubs, camel!");
    }

    @Test
    public void testLoginInvalid01() {
        driver.get(baseUrl +"/signin/");
        LoginPage loginPage = new LoginPage(driver);

        Assert.assertEquals(loginPage.getHeaderText(), loginPage.getHeaderStaticText());
        loginPage.login("ale", "newpassword");

        Assert.assertEquals(loginPage.getUsernameFieldValue(), "", "Username field is not cleared!");
        Assert.assertEquals(loginPage.getPasswordFieldValue(), "", "Password field is not cleared!");

        String errorMessage = loginPage.getErrorMessage();
        Assert.assertEquals(errorMessage, "Invalid username or password!", "Error message does not match!");
    }
}
