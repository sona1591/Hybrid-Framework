package stepdefinitionfile;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import automation.base.Base;
import automation.pages.ForgotPasswordPage;
import automation.pages.HeaderSection;
import automation.pages.LoginPage;
import automation.pages.MyAccountPage;
import automation.reusableMethods.ElementUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	
	private WebDriver driver;
	private HeaderSection headerSection;
	private LoginPage loginpage;
	private MyAccountPage myaccountpage;
	private ForgotPasswordPage forgotpasswordpage;

	
	@Given("I navigate to login page")
	public void i_navigate_to_login_page() {
		driver = Base.launchSite();
		headerSection = new HeaderSection(driver);
		HeaderSection.e1.click();
		HeaderSection.e3.click();	
			
	    
	}
	
	@When("I will login into the application using valid Email {string} and password {string}")
	public void i_will_login_into_the_application_using_valid_email_and_password(String Email, String password) {
		loginpage=new LoginPage(driver);
	LoginPage.DoLogin(Email, password);
		
	}
	
	@Then("I should be able to login successfully")
	public void i_should_be_able_to_login_successfully() {
		myaccountpage =new MyAccountPage (driver);
		Assert.assertTrue(ElementUtils.displayStatusOfElement(MyAccountPage.MyAccount, 10));
   
}
	@Then("i should Logout")
	public void i_should_logout(){
		headerSection = new HeaderSection(driver);
		
		HeaderSection.e4.click();	
	    
	}
	@Then("I should see an error msg that the credentials are invalid")
	public void i_should_see_an_error_msg_that_the_credentials_are_invalid() {
		
	Assert.assertEquals("The warning msg matched","Warning: No match for E-Mail Address and/or Password.",LoginPage.Mainwarning.getText());
		
	    	}
	
	@When("I click on the forgotten password and given the email {string}")
	public void i_click_on_the_forgotten_password_and_given_the_email_address(String email) {
		loginpage=new LoginPage(driver);
		forgotpasswordpage=new ForgotPasswordPage (driver);
		LoginPage.ForgottennPwd.click();
		ElementUtils.typeTextIntoElement(ForgotPasswordPage.Emailfield, email, 10);
		ForgotPasswordPage.Continuebtn.click();
		
	}
	@Then("I should see an msg that the confirmation link has been sent to your email address.")
	public void i_should_see_an_msg_that_the_confirmation_link_has_been_sent_to_your_email_address() {
		Assert.assertEquals("The warning msg matched","An email with a confirmation link has been sent your email address.",LoginPage.Mainwarning.getText());
	}


}
