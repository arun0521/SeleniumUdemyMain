package junitexample;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeSwitch {
	String baseUrl = "https://letskodeit.teachable.com/p/practice";
	WebDriver driver;
	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() throws Exception {
		
		Thread.sleep(2 * 1000);
	}

	@Test
	public void test() throws Exception{
		driver.get(baseUrl);
		driver.switchTo().frame("courses-iframe");
		
		driver.findElement(By.id("search-courses")).sendKeys("sucess!! iframe");
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(2 * 1000);
		
		driver.findElement(By.id("name")).sendKeys("sucess! coming out of iframe");
		
	}

}
