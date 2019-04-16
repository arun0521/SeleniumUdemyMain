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

public class navigation {
	WebDriver driver;
	String baseURl;
	By loginXpath = By.xpath("//div[contains(@class,'collapse')]//a[contains(text(),'Login')]");
	String title = "";
	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseURl = "https://letskodeit.teachable.com";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() throws Exception {
		
		driver.get(baseURl);
		
		Thread.sleep(5 * 1000);
		
		title = driver.getTitle();
		
		System.out.println(title);
		
		WebElement ele_login = driver.findElement(loginXpath);
		ele_login.click();
		
		Thread.sleep(5 * 1000);
       
		title = driver.getTitle();
		
		System.out.println(title);
		
		driver.navigate().back();
		
		Thread.sleep(5 * 1000);
        title = driver.getTitle();
		
		System.out.println(title);
		
		
		driver.navigate().forward();
		Thread.sleep(5 * 1000);
		 title = driver.getTitle();
			
	      System.out.println(title);
	}

	@Test
	public void test() {
		
	}

}
