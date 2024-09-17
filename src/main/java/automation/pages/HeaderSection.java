package automation.pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderSection {
	private WebDriver driver;
	
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
	

}
