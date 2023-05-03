package pl.grzegorzworek.pageobject.qwant_cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/cucumber/features/qwant.phrase.search.feature",
        plugin = {"pretty","html:out"})

public class QwantSearchCucumberTest {
}
