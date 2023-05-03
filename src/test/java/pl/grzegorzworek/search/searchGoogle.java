package pl.grzegorzworek.search;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class searchGoogle {
    @Test
    public void searchGoogle() {
        //System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));

        driver.get("https://google.pl/");
        //driver.get("https://duckduckgo.com/");

        // google reject cookies
        WebElement cookiesButton = driver.findElement(By.id("W0wltc"));
        cookiesButton.click();

        WebElement searchTextArea = driver.findElement(By.name("q"));
        assertNotNull(searchTextArea);
        searchTextArea.sendKeys("Lucy");
        WebElement searchButton = driver.findElement(By.name("btnK")); // in google
        //WebElement searchButton = driver.findElement(By.id("search_button_homepage")); // in duckduckgo
        searchButton.submit();

        driver.quit();
    }

}

