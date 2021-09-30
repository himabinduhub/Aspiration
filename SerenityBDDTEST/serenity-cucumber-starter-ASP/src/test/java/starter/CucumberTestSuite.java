package starter;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = {"src/test/resources/features/Aspiration/Aspiration.feature","src/test/resources/features/Swapi/Swapi.feature"},
        glue = { "aspiration.stepdefinitions","swapi.stepdefinitions"}
)
public class CucumberTestSuite {
}