package automation.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features= "src/test/resources/featurefiles",
		glue= {"stepdefinitionfile"},
		plugin = {"pretty", "html:target/cucumber/report.html"},
		tags="@Four"
		)
		
public class TestRunner {
	

}
