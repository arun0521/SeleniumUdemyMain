package junitexample;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlertHandling {
	String baseUrl = "https://letskodeit.teachable.com/p/practice";
	WebDriver driver;
	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

	@Test
	public void test2() throws Exception {
		
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("Arun");
		driver.findElement(By.id("alertbtn")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		
		
	}

	
	@Test
	public void test1() throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("Arun");
		driver.findElement(By.id("confirmbtn")).click();
		Alert alert = driver.switchTo().alert();
		//alert.dismiss();
		alert.accept();
		
	}

}
