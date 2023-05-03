package pl.grzegorzworek.pageobject.qwant;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QwantMainPage {
    @FindBy(name = "q")
    private WebElement searchInput;

    public QwantMainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void enterSearchPhrase(String phraseToSearch) {
        searchInput.sendKeys(phraseToSearch);
    }
}
