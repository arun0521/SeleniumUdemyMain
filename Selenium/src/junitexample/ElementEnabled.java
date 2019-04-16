package junitexample;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementEnabled {

	WebDriver driver;
	String baseURL = "";
	By searchGoogleId = By.id("lst-ib");
	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseURL = "https://google.com";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() throws Exception {
		
		
	}

	@Test
	public void test() {
        driver.get(baseURL);
		
		WebElement ele = driver.findElement(searchGoogleId);
		System.out.println("IS the element enabled? " +ele.isEnabled());
		
		driver.close();
	}

}
