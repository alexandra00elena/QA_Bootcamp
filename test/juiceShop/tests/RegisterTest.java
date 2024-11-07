package juiceShop.tests;

import juiceShop.frameworkUtils.Utils;
import juiceShop.pages.LoginPage;
import juiceShop.pages.RegistrationPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class RegisterTest extends BaseTest {

    @DataProvider(name = "RegistrationDataProvider")
    public Iterator<Object[]> registerDp() {
        Collection<Object[]> dp = new ArrayList<>();
        dp.add(new String[]{"alex@alex.com", "Alex98876%", "alex"});
        return dp.iterator();
    }

    @Test(dataProvider = "RegistrationDataProvider")
    public void loginRegister2(String username, String password, String securityAns) {
        driver.get(baseUrl + "/#/login");
        LoginPage lp = new LoginPage(driver);
        lp.awaitDismissModal();
        lp.newUser();
        RegistrationPage rp = new RegistrationPage(driver);
        Assert.assertEquals(rp.getRegisterHeader(), rp.getRegisterPageStatic());
        rp.register(username, password, securityAns);
    }

    // Homework 5 - Registration

    @DataProvider(name = "NegativeRegistrationDataProvider")
    public Object[][] negativeRegistrationData() {
        return new Object[][]{
                // Email invalid
                {"invalidemail@", "ValidPass123!", "alex", "Email address is not valid.", "#mat-error-7"},
                // Parola prea scurtă
                {"validemail@example.com", "123", "alex", "Password must be 5-40 characters long.", "#mat-error-8"},
                // Confirmarea parolei incorectă
                {"validemail@example.com", "ValidPass123!", "alex", "Passwords do not match", "#mat-error-9"},
                // Fără răspuns la întrebarea de securitate
                {"validemail@example.com", "ValidPass123!", "", "Please provide an answer to your security question.", "#mat-error-6"},
                // Email lipsă
                {"", "ValidPass123!", "alex", "Please provide an email address.", "#mat-error-13"}
        };
    }


    @Test(dataProvider = "NegativeRegistrationDataProvider")
    public void registerNegativeTest(String email, String password, String securityAns, String expectedError, String errorElementId) {
        driver.get(baseUrl + "/#/");
        driver.get(baseUrl + "/#/login");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.awaitDismissModal();
        loginPage.newUser();

        RegistrationPage registrationPage = new RegistrationPage(driver);

        // Assert the header
        Assert.assertEquals(registrationPage.getRegisterHeader(), registrationPage.getRegisterPageStatic());

        // Perform registration with invalid data
        WebElement emailField = driver.findElement(By.id("emailControl"));
        WebElement passwordField = driver.findElement(By.id("passwordControl"));
        WebElement passwordConfirm = driver.findElement(By.id("repeatPasswordControl"));

        emailField.clear();
        emailField.sendKeys(email);
        passwordField.clear();
        passwordField.sendKeys(password);
        passwordConfirm.clear();
        passwordConfirm.sendKeys(password);

        WebElement securityQuestionDropDown = Utils.waitForElement(driver, 10, By.name("securityQuestion"));
        securityQuestionDropDown.click();
        WebElement securityQ1 = Utils.waitForElement(driver, 5, By.cssSelector("#mat-option-0 > span"));
        securityQ1.click();
        WebElement securityAnswerField = driver.findElement(By.id("securityAnswerControl"));
        securityAnswerField.clear();
        securityAnswerField.sendKeys(securityAns);

        // Locate the error message element and validate it
        WebElement errorMessageElement = driver.findElement(By.id(errorElementId));
        String actualError = errorMessageElement.getText();

        // Assert that the actual error message matches the expected error
        Assert.assertEquals(actualError, expectedError, "Error message does not match for field.");
    }
}