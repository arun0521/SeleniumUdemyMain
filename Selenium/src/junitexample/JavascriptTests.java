package junitexample;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavascriptTests {
private WebDriver driver;
String baseUrl;
private JavascriptExecutor js;
	
	
	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "https://letskodeit.teachable.com/p/practice";
		
		js = (JavascriptExecutor)driver;
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		//driver.get(baseUrl);
		
		js.executeScript("window.location = 'https://letskodeit.teachable.com/p/practice';");
	   
		//WebElement textBox = driver.findElement(By.id("name"));
		WebElement textBox = (WebElement)js.executeScript("return document.getElementById('name');");
	    textBox.sendKeys("Sura");
	
	}

}
