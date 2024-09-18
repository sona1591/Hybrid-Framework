package stepdefinitionfile;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import automation.base.Base;
import automation.pages.ForgotPasswordPage;
import automation.pages.HeaderSection;
import automation.pages.LoginPage;
import automation.pages.SearchResultPage;
import automation.reusableMethods.ElementUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {
	
	private WebDriver driver;
	private HeaderSection headerSection;
	private SearchResultPage searchresultpage;
	
	@When("^I search for a product \"([^\"]*)\"$")
	public void i_search_for_a_product(String product) {
		driver = Base.launchSite();
		headerSection = new HeaderSection(driver);
	  searchresultpage = new SearchResultPage(driver);
	 // ElementUtils.typeTextIntoElement(HeaderSection.SearchField,product, 10);
	HeaderSection.SearchField.sendKeys(product);
    HeaderSection.SearchBtn.click();
    HeaderSection.SearchField.clear();
	}
	@Then("^I should see the product in search result$")
	public void i_should_see_the_product_in_search_result() {
	    
		Assert.assertTrue(ElementUtils.displayStatusOfElement(SearchResultPage.SearchResult, 0));
	}
	@Then("I should get the msg informing {string}")
	public void i_should_get_the_msg_informing(String msg) {
		Assert.assertEquals("The warning msg matched",msg,SearchResultPage.NoProductMatching.getText());
	    
	}

	
}
