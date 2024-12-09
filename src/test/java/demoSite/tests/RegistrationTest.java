package demoSite.tests;

import demoSite.pages.LoginPage;
import demoSite.pages.RegistrationPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class RegistrationTest extends BaseTest {

    @DataProvider(name = "RegistrationDataProvider")
    public Iterator<Object[]> registerDp() {
        Collection<Object[]> dp = new ArrayList<>();
        dp.add(new String[]{"alexandra", "ale1234", "Alexandra", "Pribagu", "ale_elena@gmail.com", "2000-06-14"});
        dp.add(new String[]{"user1", "user1234", "User", "Eins", "user_eins@gmail.com", "2000-01-01"});
        return dp.iterator();
    }

    @DataProvider(name = "InvalidRegistrationDataProvider")
    public Iterator<Object[]> registerInvalidDp() {
        Collection<Object[]> dp = new ArrayList<>();
        dp.add(new String[]{"ale", "ale1234", "Alexandra", "Pribagu", "ale_elena@gmail.com", "2000-06-14", "Please choose a longer username"});
        dp.add(new String[]{"", "user12345", "User", "Eins", "user_eins@gmail.com", "2000-01-01", "Please choose a username"});

        return dp.iterator();
    }

    @Test(dataProvider = "RegistrationDataProvider")
    public void registrationTest01(String username, String password, String firstName, String lastName, String email, String birthDay) {
//        driver.get(baseUrl +"/signin/");
//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.newUser();

        driver.get(baseUrl +"/signup/");

        RegistrationPage registrationPage = new RegistrationPage(driver);
        Assert.assertEquals(registrationPage.getHeaderText(), registrationPage.getHeaderStaticText());

        registrationPage.register(username, password, firstName, lastName, email, birthDay);
    }

    @Test(dataProvider = "RegistrationDataProvider")
    public void registrationTest02(String username, String password, String firstName, String lastName, String email, String birthDay) {
        driver.get(baseUrl +"/signup/");

        RegistrationPage registrationPage = new RegistrationPage(driver);
        Assert.assertEquals(registrationPage.getHeaderText(), registrationPage.getHeaderStaticText());

        registrationPage.register(username, password, firstName, lastName, email, birthDay);
    }

    @Test(dataProvider = "InvalidRegistrationDataProvider")
    public void registrationTestInvalid01(String username, String password, String firstName, String lastName, String email, String birthDay, String error) {
//        driver.get(baseUrl +"/signin/");
//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.newUser();

        driver.get(baseUrl +"/signup/");

        RegistrationPage registrationPage = new RegistrationPage(driver);
        Assert.assertEquals(registrationPage.getHeaderText(), registrationPage.getHeaderStaticText());

        registrationPage.register(username, password, firstName, lastName, email, birthDay);

        Assert.assertEquals(registrationPage.getUsernameInvalidSelector(), error);
    }
}
