package junitexample;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import genericmethods.WaitTypes;

public class WaitExamples {
     WebDriver driver;
     String baseUrl = "";
     By login =  By.xpath("//div[contains(@class,'collapse')]//a[contains(text(),'Login')]");
     By newTab = By.id("opentab");
     WaitTypes wt;
	
     @Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "https://letskodeit.teachable.com/p/practice/";
		driver.manage().window().maximize();
		wt =  new WaitTypes(driver);
	}

	@After
	public void tearDown() throws Exception {
		
		
	}

	@Test
	public void test() {
		driver.get(baseUrl);
		
	    wt.waitToBeClickable(newTab, 3);
		
	}

}
