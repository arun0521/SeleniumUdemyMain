package junitexample;

import static org.junit.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocomplete {
     WebDriver driver;
     String baseUrl;
     String partialText = "new york";
     By departureId = By.id("air-city-departure");
     //By textFirst = By.xpath("New York (LaGuardia), NY - LGA");
     By listContainer = By.id("air-city-departure-menu");
    
	
	
	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "https://www.southwest.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3 * 1000);
		driver.quit();
	}

	@Test
	public void test() throws Exception {
		driver.get(baseUrl);
		driver.findElement(departureId).sendKeys(partialText);
		
		WebElement container =  driver.findElement(listContainer);
		
		
		
		
		List<WebElement> allLists = container.findElements(By.xpath("*"));
		
		Thread.sleep(2000);
		
		for(WebElement ele : allLists){
			System.out.println(ele.getText());
			}
		
		
		for(WebElement ele : allLists){
			if(ele.getText().equals("New York (LaGuardia), NY - LGA")){
				ele.click();
			}
			
		}
		
		
		
		
	}

}
