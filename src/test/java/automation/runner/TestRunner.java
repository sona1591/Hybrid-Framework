package automation.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features= {
				"src/test/resources/featurefiles/Search.feature",
				"src/test/resources/featurefiles/Login.feature",
				"src/test/resources/featurefiles/Register.feature"
				},
		        glue= {"stepdefinitionfile"},
		plugin = {"pretty", "html:target/cucumber/report.html"},
		monochrome = true,                                        // Console output readability
		dryRun = false                                          // False to execute the tests
		 
		)
		
public class TestRunner {
	

}
