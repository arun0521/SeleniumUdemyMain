package junitexample;

import static org.junit.Assert.*;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindow {
	
	WebDriver driver;
	String baseUrl = "https://letskodeit.teachable.com/p/practice";
	By openWnd = By.id("openwindow");
	By searchCourse = By.id("search-courses");

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
	public void test() throws Exception {
		driver.get(baseUrl);
		
		String parentWnd = driver.getWindowHandle();
		System.out.println("The parent handle is " +parentWnd);
		
		driver.findElement(openWnd).click();
		
		Set<String> handles = driver.getWindowHandles();
		
		for(String handle : handles)
		{
			System.out.println(handle);
			if(!handle.equals(parentWnd)){
				driver.switchTo().window(handle);
				Thread.sleep(2 * 1000);
				driver.findElement(searchCourse).sendKeys("Python");
				driver.close();
				break;
				
			}
		}
		
		driver.switchTo().window(parentWnd);
		driver.findElement(By.id("name")).sendKeys("Test Sucessful");
	}

}
