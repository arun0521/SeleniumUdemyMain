package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Chrome {

	
	public static void main(String[] args){
		
		String baseUrl = "https://www.google.com";
		By googleSearch = By.name("q");
		By googleSearchButton = By.id("_fZl");
		By facebookLink = By.linkText("X-Cart Demo store company > Catalog");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arun\\workspace\\Selenium\\chromedriver.exe");
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		WebElement seachElement = driver.findElement(googleSearch);
		seachElement.sendKeys("demostore.x-cart.com");
		
		seachElement = driver.findElement(googleSearchButton);
		seachElement.click();
		
		try {
			Thread.sleep(5 * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(facebookLink).click();
		
		driver.quit();
		
	}
}
