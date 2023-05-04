package pl.grzegorzworek.findelement;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FindElementById {
    @Test
    public void searchMyBookingHotel() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));

        driver.get("https://www.hotelstok.pl/kontakt/hotel-stok-wisla");

        // Fill contact form, but don't send spam message to the hotel inbox
        WebElement firstnameContactInput = driver.findElement(By.id("Contact-FirstName"));
        assertNotNull(firstnameContactInput);
        firstnameContactInput.sendKeys("Jack");

        WebElement lastnameContactInput = driver.findElement(By.id("Contact-LastName"));
        assertNotNull(lastnameContactInput);
        lastnameContactInput.sendKeys("Strong");

        WebElement emailContactInput = driver.findElement(By.id("Contact-Email"));
        assertNotNull(emailContactInput);
        emailContactInput.sendKeys("contact@test.pl");

        WebElement phoneContactInput = driver.findElement(By.id("Contact-Phone")); // optional field
        phoneContactInput.sendKeys("123456789");

        WebElement MessageContactTextArea = driver.findElement(By.id("Contact-SubmitMessage"));
        assertNotNull(MessageContactTextArea);
        MessageContactTextArea.sendKeys("Room reservation");

        driver.quit();
    }
}
