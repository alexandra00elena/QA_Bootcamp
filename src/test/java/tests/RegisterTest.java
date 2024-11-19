package tests;

import juiceShop.frameworkUtils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {

    @Test
    public void validRegistrationTest() {
        driver.get(baseUrl);

        // Navigare la pagina de înregistrare
        driver.findElement(By.cssSelector("a[href='/#/register']")).click();

        // Așteptare pentru a asigura că formularul de înregistrare este disponibil
        Utils.waitForElement(driver, 5, By.id("register-email"));

        // Completează formularul de înregistrare
        driver.findElement(By.id("username")).sendKeys("Alexandra24");
        driver.findElement(By.id("password")).sendKeys("TestPassword123");
        driver.findElement(By.id("password2")).sendKeys("TestPassword123");
        driver.findElement(By.id("Ms")).click();

        driver.findElement(By.id("input-first-name")).sendKeys("Alexandra");
        driver.findElement(By.id("input-last-name")).sendKeys("Elena");
        driver.findElement(By.id("input-email")).sendKeys("ale16elena@gmail.com");

        // Setează ziua
        driver.findElement(By.cssSelector("[aria-label='day']")).sendKeys("14");
        // Setează luna
        driver.findElement(By.cssSelector("[aria-label='month']")).sendKeys("06");
        // Setează anul
        driver.findElement(By.cssSelector("[aria-label='year']")).sendKeys("2000");

        driver.findElement(By.id("input-nationality")).sendKeys("Romania");
        driver.findElement(By.id("terms")).click();

        // Apasă butonul de înregistrare
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();

        // Verifică dacă utilizatorul este redirecționat corespunzător (ex. spre pagina principală)
        WebElement h1 = driver.findElement(By.tagName("h1"));
        Assert.assertEquals(h1.getText(), "Welcome to web-stubs, Alexandra24!", "User not registered!");
    }

    @Test
    public void invalidEmailRegistrationTest() {
        driver.get(baseUrl);

        // Navigare la pagina de înregistrare
        driver.findElement(By.cssSelector("a[href='/#/register']")).click();

        // Așteptare pentru a asigura că formularul de înregistrare este disponibil
        Utils.waitForElement(driver, 5, By.id("register-email"));

        // Completează formularul de înregistrare cu un email invalid
        driver.findElement(By.id("register-email")).sendKeys("invalid-email");
        driver.findElement(By.id("register-password")).sendKeys("TestPassword123");
        driver.findElement(By.id("register-confirm-password")).sendKeys("TestPassword123");
        driver.findElement(By.id("register-name")).sendKeys("Test User");

        // Apasă butonul de înregistrare
        driver.findElement(By.id("register-submit")).click();

        // Verifică dacă apare un mesaj de eroare
        WebElement errorMessage = driver.findElement(By.cssSelector(".error-message"));
        Assert.assertTrue(errorMessage.isDisplayed(), "Mesajul de eroare nu a fost afișat pentru email invalid.");
    }
}