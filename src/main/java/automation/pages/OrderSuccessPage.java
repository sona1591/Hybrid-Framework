package automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderSuccessPage {

private WebDriver driver;
			
public OrderSuccessPage(WebDriver driver) {
				
this.driver=driver;
PageFactory.initElements(driver, this);
	
}
			
  @FindBy(linkText="Success")
  public static WebElement SuccessModule;

}
