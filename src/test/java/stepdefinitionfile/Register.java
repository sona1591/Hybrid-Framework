package stepdefinitionfile;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import automation.base.Base;
import automation.pages.HeaderSection;
import automation.pages.RegisterPage;
import automation.pages.SuccessAccountPage;
import automation.reusableMethods.ElementUtils;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Register {
	
	private WebDriver driver;
	private HeaderSection headerSection;
	private RegisterPage registerpage;
	private SuccessAccountPage successaccountpage;
	

	
	@Given("I want to launch the application")
	public void i_want_to_launch_the_application() {
		
		driver = Base.launchSite();
	   driver.manage().window().maximize();
	  
	}

	@Given ("I navigate to account registration page")
	public void i_navigate_to_account_registration_page() {
		//System.out.println("HeaderSection: " + headersection);
		//System.out.println("MyAccountLink: " + headersection.myAccountLink());
		//System.out.println(driver);
		
		headerSection = new HeaderSection(driver);
		HeaderSection.e1.click();
		HeaderSection.e2.click();
		
	}

	@When("I fill all the valid details")
	public void i_fill_all_the_valid_details(DataTable dataTable) {
		registerpage=new RegisterPage(driver);
		RegisterPage.enterAllDetails(dataTable,"Unique");
		}

	@And("I select the privacy policy")
	public void i_select_the_privacy_policy() {
	   RegisterPage.PrivacyPolicy.click();
	}

	@And("I click on continue button")
	public void i_click_on_continue_button() {
		registerpage=new RegisterPage(driver);
	RegisterPage.ContinueButton.click();
	}
	
	@And("I should subscribe to newsletter")
	public void I_should_subscribe_to_newsletter() {
		RegisterPage.Subscribed.click();
	}
	
	

	@Then("I should see that the user Account has successfully created")
	public void i_should_see_that_the_user_account_has_successfully_created() {
		successaccountpage=new SuccessAccountPage(driver);
		Assert.assertTrue(ElementUtils.displayStatusOfElement(SuccessAccountPage.successMsg, 10));
		//Base.quitDriver();
          headerSection = new HeaderSection(driver);
		
		HeaderSection.e4.click();	
	}
	
	@Then("I should see that the user Account is not created")
	public void I_should_see_that_the_user_Account_is_not_created() {
	Assert.assertTrue(ElementUtils.displayStatusOfElement(RegisterPage.Register, 10));
	
	}

	@Then("I should see the error msgs informing the user to fill the mandatory fields")
	public void I_should_see_the_error_msgs_informing_the_user_to_fill_the_mandatory_fields() {
		Assert.assertTrue(ElementUtils.displayStatusOfElement(RegisterPage.FirstNamewarning, 10));
		Assert.assertTrue(ElementUtils.displayStatusOfElement(RegisterPage.LastNamewarning, 10));
		Assert.assertTrue(ElementUtils.displayStatusOfElement(RegisterPage.Emailwarning,10));
		Assert.assertTrue(ElementUtils.displayStatusOfElement(RegisterPage.Telephonewarning, 10));
		Assert.assertTrue(ElementUtils.displayStatusOfElement(RegisterPage.passwordwarning, 10));
		Assert.assertTrue(ElementUtils.displayStatusOfElement(RegisterPage.mainwarning,10));
		
		
	}
	
	 @When ("I fill the below duplicate details")
	 public void I_fill_the_below_duplicate_details(DataTable dataTable) {
		 
		registerpage=new RegisterPage(driver);
		RegisterPage.enterAllDetails(dataTable, "Duplicate");
	 }
	 
	 @Then ("I should see that Email id already registered")
	 public void Then_I_should_see_that_Email_id_already_registered() {
		 
		 Assert.assertEquals("The warning msg matched","Warning: E-Mail Address is already registered!",RegisterPage.mainwarning.getText());
	 }
	
}
