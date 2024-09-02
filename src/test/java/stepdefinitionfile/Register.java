package stepdefinitionfile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {
	
	
	@Given("I want to launch the application")
	public void i_want_to_launch_the_application() {
		
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://tutorialsninja.com/demo/");
	   
	}

	@And ("I navigate to account registration page")
	public void i_navigate_to_account_registration_page() {
	    
	}

	@When("I fill all the valid details")
	public void i_fill_all_the_valid_details(DataTable dataTable) {
	   
	}

	@And("I select the privacy policy")
	public void i_select_the_privacy_policy() {
	    
	}

	@Then("I click on continue button")
	public void i_click_on_continue_button() {
	    
	}

	@And("I should see that the user Account has successfully created")
	public void i_should_see_that_the_user_account_has_successfully_created() {
	    
	}
}
