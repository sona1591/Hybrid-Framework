package automation.config;



public class PropertyFileReader {

  public static void main(String[] args) {
	        // Create instance of ConfigReader
	        ConfigReader configReader = new ConfigReader();

	        // Access values from the properties file
	        String url = configReader.getProperty("url");
	        String browser = configReader.getProperty("browser");

	        // Use the values
	        System.out.println("URL: " + url);
	        System.out.println("Browser: " + browser);
	    }
	}
