package stepdefinitionfile;

import org.testng.log4testng.Logger;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.ObjectIdGenerators.PropertyGenerator;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	private static Logger log= Logger.getLogger(Hooks.class);
	 @Before
	 public void setUp(Scenario scenario) {
		 
	 }

}
