package automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {
private WebDriver driver;
	
	public CheckOutPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="button-payment-address")
	public static WebElement ContinueButtonofBillingDetailSection;
	
	
	@FindBy(id="button-shipping-address")
	public static WebElement ContinueButtonofDeliveryDetailSection;
	
	@FindBy(id="button-shipping-method")
	public static WebElement ContinueButtonofDeliveryMethodSection;
	
	@FindBy(name="agree")
	public static WebElement termsAndconditionCheckBox ;
	
	
	@FindBy(id="button-payment-method")
	public static WebElement ContinueButtonofPaymentMethodsSection;
	
	
	@FindBy(id="button-confirm")
	public static WebElement ConfirmOrderButton;
	
	public static void placeAnOrder() {
		CheckOutPage.ContinueButtonofBillingDetailSection.click();
		CheckOutPage.ContinueButtonofDeliveryDetailSection.click();
		CheckOutPage.ContinueButtonofDeliveryMethodSection.click();
		CheckOutPage.termsAndconditionCheckBox.click();
		CheckOutPage.ContinueButtonofPaymentMethodsSection.click();
		CheckOutPage.ConfirmOrderButton.click();

	}
	


}
