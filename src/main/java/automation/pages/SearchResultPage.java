package automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage {
	
	private WebDriver driver;
	
	public SearchResultPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Samsung Galaxy Tab 10.1")
	public static WebElement SearchResult;

	
	@FindBy(css="input[id='button-search']+h2+p")
	public static WebElement NoProductMatching;
	
	
	@FindBy(xpath="//span[text()='Add to Cart'][1]")
	public static WebElement FirstAddToCart;
	
	public static void AddFirstProductToCart() {
		  SearchResultPage.FirstAddToCart.click();
	}
}
