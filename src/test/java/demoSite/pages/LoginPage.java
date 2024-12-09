package demoSite.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.lang.invoke.StringConcatFactory;

public class LoginPage extends BasePage {
    private static final String USERNAME_ID = "user";
    private static final String PASSWORD_ID = "pass";
    private static final String REMEMBER_ID = "remember";
    private static final String SIGNIN_BUTTON_SELECTOR = "#svelte > div.container-fluid > div.main.row > div.content > div > div > div > form > button";

    private static final String HEADER_TEXT_SELECTOR = "#svelte > div.container-fluid > div.main.row > div.content > h1";
    private static final String HEADER_STATIC_TEXT = "Sign in";

    private static final String ERROR_MESSAGE_SELECTOR = "#svelte > div.container-fluid > div.main.row > div.content > div > div > div > form > small";

    private static final String NOT_REGISTERED_SELECTOR = "a[href='/signup']";

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String username, String password) {
        WebElement usernameField = driver.findElement(By.id(USERNAME_ID));
        WebElement passwordField = driver.findElement(By.id(PASSWORD_ID));
        WebElement rememberButton = driver.findElement(By.id(REMEMBER_ID));

        usernameField.clear();
        usernameField.sendKeys(username);

        passwordField.clear();
        passwordField.sendKeys(password);

        rememberButton.click();

        WebElement signinButton = driver.findElement(By.cssSelector(SIGNIN_BUTTON_SELECTOR));
        signinButton.click();
    }

    public String getHeaderText() {
        return driver.findElement(By.cssSelector(HEADER_TEXT_SELECTOR)).getText();
    }

    public String getHeaderStaticText() {
        return HEADER_STATIC_TEXT;
    }

    public String getUsernameFieldValue() {
        return driver.findElement(By.id(USERNAME_ID)).getAttribute("value");
    }

    public String getPasswordFieldValue() {
        return driver.findElement(By.id(PASSWORD_ID)).getAttribute("value");
    }

    public String getErrorMessage() {
        WebElement errorMessage = driver.findElement(By.cssSelector(ERROR_MESSAGE_SELECTOR));
        return errorMessage.getText();
    }

    public void newUser() {
        WebElement newUserLink = driver.findElement(By.xpath(NOT_REGISTERED_SELECTOR));
        newUserLink.click();
    }
}
