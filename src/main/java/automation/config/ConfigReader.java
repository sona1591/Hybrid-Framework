package automation.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	    private Properties properties;

	    public ConfigReader() {
	        try {
	            // Path to your properties file
	            FileInputStream fis = new FileInputStream("src/main/resources/config.properties");
	            
	            // Create a Properties object
	            properties = new Properties();
	            
	            // Load properties from the file
	            properties.load(fis);
	            
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    // Method to read property by key
	    public String getProperty(String key) {
	        return properties.getProperty(key);
	    }
	}


