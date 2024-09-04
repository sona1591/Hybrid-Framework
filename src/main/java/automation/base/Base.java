package automation.base;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import javax.swing.text.Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Base {
	
	public static WebDriver driver;
	
		public Properties prop;
		public Properties dataProp;
			
		public Base() {
			driver=null;
		}
			
		/*
		 * prop = new Properties(); File propFile = new
		 * File(System.getProperty("user.dir")+
		 * "\\src\\main\\java\\com\\tutorialsninja\\qa\\config\\config.properties");
		 * 
		 * dataProp = new Properties(); File dataPropFile = new
		 * File(System.getProperty("user.dir")+
		 * "\\src\\main\\java\\com\\tutorialsninja\\qa\\testdata\\testdata.properties");
		 * 
		 * try { FileInputStream dataFis = new FileInputStream(dataPropFile);
		 * dataProp.load(dataFis); }catch(Throwable e) { e.printStackTrace(); }
		 * 
		 * try { FileInputStream fis = new FileInputStream(propFile); prop.load(fis);
		 * }catch(Throwable e) { e.printStackTrace(); }
		 * }
		 */

		
		public WebDriver initializeBrowserAndOpenApplicationURL(String browserName) {
				
			if(browserName.equalsIgnoreCase("chrome")) {
				
				driver = new ChromeDriver();
				
			}else if(browserName.equalsIgnoreCase("firefox")) {
				
				driver = new FirefoxDriver();
				
			}else if(browserName.equalsIgnoreCase("edge")) {
				
				driver = new EdgeDriver();
				
			}else if(browserName.equalsIgnoreCase("safari")) {
				
				driver = new SafariDriver();
				
			}
			return driver;
		}
		public static WebDriver launchSite()
		{
			   if (driver == null) {
		            driver = new ChromeDriver();
		            driver.manage().window().maximize();
		            driver.get("https://tutorialsninja.com/demo/"); // Navigate to the initial page
		            driver.manage().window().maximize();
		        }
		        return driver;
		     
		}
		public static void quitDriver() {
	        if (driver != null) {
	            driver.quit();
	            driver = null;
	        }
			/*driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	*/
			
		}
}
			
			



