package automation.pages;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import automation.base.Base;
import automation.reusableMethods.ElementUtils;
import io.cucumber.datatable.DataTable;

public class RegisterPage {
	
	private WebDriver driver;
	
	public RegisterPage(WebDriver driver) {
		this.driver = driver;
	PageFactory.initElements(driver, this);
	
	}
			
	
	@FindBy(id="input-firstname")
	public static WebElement firstName;
	
	@FindBy(id="input-lastname")
	public static WebElement LastName;
	
	@FindBy(id="input-email")
	public static WebElement Email;
	
	@FindBy(id="input-telephone")
	public static WebElement Telephone;
	
	@FindBy(id="input-password")
	public static WebElement Password;
	
	@FindBy(id="input-confirm")
	public static WebElement ConfirmPassword;
	
	
	@FindBy(css="input[name='newsletter'][value='1']")
	public static WebElement Subscribed;
	
	
	@FindBy(name="agree")
	public static WebElement PrivacyPolicy;
	
	@FindBy(css="input[type='submit'][value='Continue']")
	public static WebElement ContinueButton;
	
	@FindBy(linkText="Register")
	public static WebElement Register;
	
	@FindBy( css="[id='input-firstname']+div")
	public static WebElement FirstNamewarning;
	
	@FindBy( css="[id='input-lastname']+div")
	public static WebElement LastNamewarning;
	
	@FindBy( css="[id='input-email']+div")
	public static WebElement Emailwarning;
	
	@FindBy( css="[id='input-telephone']+div")
	public static WebElement Telephonewarning;
	

	@FindBy( css="[id='input-password']+div")
	public static WebElement passwordwarning;
	
	@FindBy(css="div[class$='alert-dismissible']")
	public static WebElement mainwarning;
	
	public static void enterAllDetails(DataTable  dataTable,String detailsType) {
		Map<String,String> map=dataTable.asMap(String.class,String.class);
		ElementUtils.typeTextIntoElement(RegisterPage.firstName,map.get("FirstName"),10);
		ElementUtils.typeTextIntoElement(RegisterPage.LastName,map.get("LastName"),10);
		ElementUtils.typeTextIntoElement(RegisterPage.Telephone,map.get("Telephone"),10);
		ElementUtils.typeTextIntoElement(RegisterPage.Password,map.get("Password"),10);
		ElementUtils.typeTextIntoElement(RegisterPage.ConfirmPassword,map.get("Password"),10);
		
		if(detailsType.equalsIgnoreCase("duplicate"))
			ElementUtils.typeTextIntoElement(RegisterPage.Email, map.get("Email"), 10);
		else
			ElementUtils.typeTextIntoElement(RegisterPage.Email,System.currentTimeMillis()+map.get("Email"),10);	
	}
}
