package pl.grzegorzworek.pageobject.qwant_cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pl.grzegorzworek.pageobject.qwant.QwantMainPage;
import pl.grzegorzworek.pageobject.qwant.QwantSearchResultPage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

public class QwantSearchCucumberSteps {

    private WebDriver driver;

    @Given("Page {string} opened in browser")
    public void page_https_www_qwant_com_opened_in_browser(String pageUrl) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
        this.driver.get(pageUrl);
    }

    @When("^Phrase \"(.*)\" entered in search input box$") // use REGEX to match parameters
    // @When("Phrase {string} entered in search input box")
    public void phrase_entered_in_search_input_box(String searchPhrase) {
        QwantMainPage mainPage = new QwantMainPage(driver);
        mainPage.enterSearchPhrase(searchPhrase);
    }

    @When("Search button clicked")
    public void search_button_clicked() {
        QwantMainPage mainPage = new QwantMainPage(driver);
        mainPage.clickSearchButton();
    }

    @Then("First {int} results link texts contain phrase {string}")
    public void first_results_link_texts_contain_phrase(Integer count, String searchPhrase) {
        QwantSearchResultPage resultPage = new QwantSearchResultPage(driver);
        List<String> results = resultPage.getResultsLinkTexts();
        String phraseToContain = searchPhrase.toLowerCase();
        for (int i = 0; i < count; i++) {
            String resultText = results.get(i);
            if (!resultText.toLowerCase().contains(phraseToContain)) {
                Assertions.fail("Search result must contain (case insensitive): " + phraseToContain + ", but was: " + resultText);
            }
        }
    }
}
