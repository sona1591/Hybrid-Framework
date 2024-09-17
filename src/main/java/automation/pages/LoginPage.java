package automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="input[id='input-email']")
	public static WebElement Emailfield;
	
	@FindBy(css="input[id='input-password']")
	public static WebElement Passwordfield;
	
	
	@FindBy(css="input[type='submit'][value='Login']")
	public static WebElement Loginbtn;
	
	@FindBy(css="div[class$='alert-dismissible']")
	public static WebElement Mainwarning;
	
	@FindBy(linkText="Forgotten Password")
	public static WebElement ForgottennPwd;

	
	
	public static void DoLogin(String Email, String password)
	{
		LoginPage.Emailfield.sendKeys(Email);
		LoginPage.Passwordfield.sendKeys(password);
		LoginPage.Loginbtn.click();
	}
	
	
}
