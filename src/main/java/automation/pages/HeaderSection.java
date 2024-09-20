package automation.pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import automation.config.ConfigReader;

public class HeaderSection {
	private WebDriver driver;
	private static ConfigReader configreader=  new ConfigReader();
	
	//constructor method 
	public HeaderSection(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
    }
	
	@FindBy(xpath="//span[text()='My Account']")
	public static WebElement e1;
	

	@FindBy(linkText="Register")
	public static WebElement e2;
	
	
	@FindBy(linkText="Login")
	public static WebElement e3;
	
	@FindBy(linkText="Logout")
	public static WebElement e4;
	
	@FindBy(xpath="//input[@placeholder=\'Search\']")
	public static WebElement SearchField;
	
	@FindBy(css="button[class$='btn-lg']")
	public static WebElement SearchBtn;
	
	@FindBy(xpath="//span[text()='Shopping Cart']")
	public static WebElement ShoppingCart;
	
	
	public static void NavigatetoLoginPage()
	{
	  e1.click();
	  e3.click();
	}
	public static void SearchProduct()
	{
		String product =configreader.getProperty("product");
		HeaderSection.SearchField.sendKeys(product);
		HeaderSection.SearchBtn.click();
	}
	public static void ClickOnShoppingcart()
	{
		HeaderSection.ShoppingCart.click();
	}
	
}
