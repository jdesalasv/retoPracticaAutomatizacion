package pruebaAutomatizacion.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/pruebaAutomatizacion.feature",
        tags="@stories",
        glue="pruebaAutomatizacion.stepdefinitions",
        snippets= SnippetType.CAMELCASE)

public class RunnerTags {
}
