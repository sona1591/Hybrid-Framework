package stepdefinitionfile;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import automation.base.Base;
import automation.config.ConfigReader;
import automation.pages.CheckOutPage;
import automation.pages.HeaderSection;
import automation.pages.LoginPage;
import automation.pages.OrderSuccessPage;
import automation.pages.SearchResultPage;
import automation.pages.ShoppingCartPage;
import automation.reusableMethods.ElementUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Orders {
	private WebDriver driver;
	private HeaderSection headerSection;
	private LoginPage loginpage;
	private ConfigReader configreader=  new ConfigReader();
	private SearchResultPage searchresultpage;
	private ShoppingCartPage shoppingcartpage;
	private CheckOutPage checkoutpage;
	private OrderSuccessPage ordersuccesspage;
	

	@Given("I want to login into the application")
	public void i_want_to_login_into_the_application() throws InterruptedException {
		
		
		 if (driver == null) {
	            // Initialize WebDriver if it's null
	            driver = new ChromeDriver();
	            driver.manage().window().maximize();
	        }

	        // Load the application URL from config
	      
	        String url = configreader.getProperty("url");
	        driver.get(url);
		
	        headerSection = new HeaderSection(driver);
			HeaderSection.NavigatetoLoginPage();
			loginpage=new LoginPage(driver);
		    LoginPage.DoLogin();
		    }
	
	@When("I add a product to bag and checkout")
	public void i_add_a_product_to_bag_and_checkout() {
	   searchresultpage = new SearchResultPage(driver);
	   HeaderSection.SearchProduct();
	   SearchResultPage.AddFirstProductToCart();
	   shoppingcartpage =new ShoppingCartPage(driver);
	   HeaderSection.ClickOnShoppingcart();
		ShoppingCartPage.ClickOnCheckoutButton();
     }
	@When("I place an order")
	public void i_place_an_order() {
		checkoutpage=new CheckOutPage(driver);
		CheckOutPage.placeAnOrder();
	}
	@Then("I should see that the oder is successfully placed")
	public void i_should_see_that_the_oder_is_successfully_placed() {
		ordersuccesspage=new OrderSuccessPage(driver);
		Assert.assertTrue(ElementUtils.displayStatusOfElement(OrderSuccessPage.SuccessModule, 10));
	}

}
