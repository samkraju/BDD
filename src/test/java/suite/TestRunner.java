//package suite;
////tags="@tagF will run all the test scenarios present inside that specific feature
////tags="not @tag1" will run all tests except tag1
////tags="@tag1 or @tag2" will run either tag1 or tag2
////tags="@tag1 and @tag2 will run only if both the tag names are present 
////dryrun checks the statements and wont run the program
//
//import org.junit.runner.RunWith;
//
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
//
//@RunWith(Cucumber.class)
//@CucumberOptions(
//		features="src/test/java",
//		glue="stepdefinitions",
//		//dryRun=true,
//		snippets = io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE,
//		//tags="@tagF",
//		tags="@login8",
//		plugin= {"pretty","html:target/report.html"})
//
//public class TestRunner {
//
//}
