package pl.grzegorzworek.findelement;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FindElementByCssSelector {
    @Test
    public void createAccountInModivo() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));

        driver.get("https://modivo.pl/register");

        // cookie out
        WebElement cookieChangeBtn = driver.findElement(By.cssSelector("button.button.base-button.tertiary.normal"));
        cookieChangeBtn.click();
        WebElement cookieOutBtn = driver.findElement(By.cssSelector("button.button.base-button.primary.normal"));
        cookieOutBtn.click();

        //create account
        WebElement firstNameInput = driver.findElement(By.cssSelector("#firstname-register"));
        assertNotNull(firstNameInput);
        firstNameInput.sendKeys("Username");

        WebElement emailInput = driver.findElement(By.cssSelector("#email-register"));
        assertNotNull(emailInput);
        String randomEmail = UUID.randomUUID().toString() + "@mail.pl";
        emailInput.sendKeys(randomEmail);

        WebElement passwordInput = driver.findElement(By.cssSelector("#password-register"));
        assertNotNull(passwordInput);
        passwordInput.sendKeys("Admin123");

        WebElement createAccountButton = driver.findElement(By.cssSelector("button.submit.base-button.primary.normal"));
        createAccountButton.click();

        driver.quit();
    }
}


