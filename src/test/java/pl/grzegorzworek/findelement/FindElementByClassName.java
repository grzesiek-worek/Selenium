package pl.grzegorzworek.findelement;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FindElementByClassName {
    @Test
    public void SearchNewsInInteria() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));

        driver.get("https://www.interia.pl/");

        WebElement searchInput = driver.findElement(By.className("search-field"));
        assertNotNull(searchInput);
        searchInput.sendKeys("world news");

        WebElement searchButton = driver.findElement(By.className("search-button"));
        searchButton.click();

        driver.quit();
    }
}

