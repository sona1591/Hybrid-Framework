package automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import automation.base.Base;

public class SuccessAccountPage {
	private WebDriver driver;
	
	public SuccessAccountPage (WebDriver driver) {
		this.driver = driver;
	PageFactory.initElements(driver,this);
			}
	
	@FindBy(linkText="Success")
	public static WebElement successMsg;
	
}
