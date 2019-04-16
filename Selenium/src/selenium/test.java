package selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
public class test {

	private static String urlName = "http://www.google.com";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Arun\\workspace\\Selenium\\geckodriver.exe");
		System.setProperty("webdriver.firefox.marionette","C:\\Users\\Arun\\workspace\\Selenium\\geckodriver.exe");
		WebDriver driver;
		driver = new FirefoxDriver();
		
		ProfilesIni profile = new ProfilesIni();    
		FirefoxProfile myprofile = profile.getProfile("C:\\NewFirefoxProfile");//location of your new firefox profile 
	    driver = new FirefoxDriver(myprofile);	
		driver.get(urlName);
	}

}
