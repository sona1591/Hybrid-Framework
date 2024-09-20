package automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
	private WebDriver driver;
	
	public ShoppingCartPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Checkout")
	public static WebElement CheckoutButton;
	
	public static void ClickOnCheckoutButton() {
		 ShoppingCartPage.CheckoutButton.click();
		
	}
	

}
