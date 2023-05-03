package pl.grzegorzworek.pageobject.qwant;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class QwantSearchTest {
    private WebDriver driver;

    @BeforeEach
    public void beforeEach() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
        this.driver.get("https://www.qwant.com/");
    }

    @Test
    public void successfulMainPagePhraseSearch() {
        String phraseToSearch = "Pogoda na majówkę";
        QwantMainPage mainPage = new QwantMainPage(driver);
    }
}
