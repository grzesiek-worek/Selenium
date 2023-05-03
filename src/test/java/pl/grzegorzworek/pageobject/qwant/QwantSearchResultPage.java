package pl.grzegorzworek.pageobject.qwant;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class QwantSearchResultPage {
    @FindBy(css = "a.external._2-LMx._3LFrt.Ks7KS._34qCe")
    private List<WebElement> results;

    public QwantSearchResultPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public List<String> getResultsLinkTexts() {
        List<String> result = new ArrayList<>();

        for(WebElement elem : this.results) {
            result.add(elem.getText());
        }

        return result;
    }
}