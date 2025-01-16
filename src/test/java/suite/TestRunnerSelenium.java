package suite;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java",
		glue="stepdefinitions",
		//dryRun=true,
		tags="@loginSelenium",
		snippets = io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE,
		plugin= {"pretty","html:target/reportSelenium.html"})
public class TestRunnerSelenium {

}
