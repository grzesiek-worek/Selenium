package pl.grzegorzworek.findelement;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FindElementByXPath {
    @Test
    public void createAccountInModivo() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));

        driver.get("https://modivo.pl/register");

        // cookie out
        WebElement cookieChangeBtn = driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[3]/div/div[2]/div/div/div/div/div[2]/div/div[2]/button[2]"));
        cookieChangeBtn.click();
        WebElement cookieOutBtn = driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[3]/div/div[2]/div/div/div/div/div/div[3]/button"));
        cookieOutBtn.click();

        //create account
        WebElement firstNameInput = driver.findElement(By.xpath("//*[@id=\"firstname-register\"]"));
        assertNotNull(firstNameInput);
        firstNameInput.sendKeys("Username");

        WebElement emailInput = driver.findElement(By.xpath("//*[@id=\"email-register\"]"));
        assertNotNull(emailInput);
        String randomEmail = UUID.randomUUID().toString() + "@mail.pl";
        emailInput.sendKeys(randomEmail);

        WebElement passwordInput = driver.findElement(By.xpath("//*[@id=\"password-register\"]"));
        assertNotNull(passwordInput);
        passwordInput.sendKeys("Admin123");

        WebElement createAccountButton = driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/main/div/div[1]/div[1]/div/div[2]/div/div[1]/form/button"));
        createAccountButton.click();

        driver.quit();
    }
}

