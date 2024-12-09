package demoSite.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage  extends BasePage {

    private static final String HEADER_TEXT_SELECTOR = "#svelte > div.container-fluid > div.main.row > div.content > h1";
    private static final String HEADER_STATIC_TEXT = "Sign up";

    private static final String USERNAME_ID = "username";
    private static final String PASSWORD_ID = "password";
    private static final String CONFIRM_PASSWORD_ID = "password2";
    private static final String GENDER_ID = "Mr";
    private static final String FIRST_NAME_ID = "input-first-name";
    private static final String LAST_NAME_ID = "input-last-name";
    private static final String EMAIL_ID = "input-email";
    private static final String DATE_OF_BIRTH_ID = "input-dob";
    private static final String NATIONALITY_ID = "input-nationality";
    private static final String TERMS_ID = "terms";
    private static final String SUBMIT_SELECTOR = "#svelte > div.container-fluid > div.main.row > div.content > div > div > div > form > div:nth-child(13) > button";

    private static final String USERNAME_INVALID_SELECTOR = "#svelte > div.container-fluid > div.main.row > div.content > div > div > div > form > div:nth-child(2) > small.form-error";
    private static final String USERNAME_INVALID_TEXT = "Please choose a username";

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public String getHeaderText() {
        return driver.findElement(By.cssSelector(HEADER_TEXT_SELECTOR)).getText();
    }

    public String getHeaderStaticText() {
        return HEADER_STATIC_TEXT;
    }

    public String getUsernameInvalidSelector() {
        return driver.findElement(By.cssSelector(USERNAME_INVALID_SELECTOR)).getText();
    }

    public String getUsernameInvalidText() {
        return USERNAME_INVALID_TEXT;
    }

    public void register(String username, String password, String firstName, String lastName, String email, String dateOfBirth) {
        WebElement usernameField = driver.findElement(By.id(USERNAME_ID));
        WebElement passwordField = driver.findElement(By.id(PASSWORD_ID));
        WebElement confirmPasswordField = driver.findElement(By.id(CONFIRM_PASSWORD_ID));
        WebElement genderField = driver.findElement(By.id(GENDER_ID));
        WebElement firstNameField = driver.findElement(By.id(FIRST_NAME_ID));
        WebElement lastNameField = driver.findElement(By.id(LAST_NAME_ID));
        WebElement emailField = driver.findElement(By.id(EMAIL_ID));
        WebElement dateOfBirthField = driver.findElement(By.id(DATE_OF_BIRTH_ID));
        WebElement nationalityField = driver.findElement(By.id(NATIONALITY_ID));
        WebElement termsField = driver.findElement(By.id(TERMS_ID));
        WebElement submitField = driver.findElement(By.cssSelector(SUBMIT_SELECTOR));

        usernameField.clear();
        usernameField.sendKeys(username);

        passwordField.clear();
        passwordField.sendKeys(password);

        confirmPasswordField.clear();
        confirmPasswordField.sendKeys(password);

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", genderField);
        genderField.click();

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", firstNameField);
        firstNameField.clear();
        firstNameField.sendKeys(firstName);

        lastNameField.clear();
        lastNameField.sendKeys(lastName);

        emailField.clear();
        emailField.sendKeys(email);

        dateOfBirthField.clear();
        dateOfBirthField.sendKeys(dateOfBirth);

        Select selectNationality = new Select(nationalityField);
        selectNationality.selectByVisibleText("Romania");

        termsField.click();

        submitField.click();
    }

}
