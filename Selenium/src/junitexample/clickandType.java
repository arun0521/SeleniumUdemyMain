package junitexample;



import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clickandType {
	WebDriver driver;
	String baseURl;
	By loginXpath = By.xpath("//div[contains(@class,'collapse')]//a[contains(text(),'Login')]");
    By userNameId = By.id("user_email");
	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseURl = "https://letskodeit.teachable.com";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void test() {
		driver.get(baseURl);
		WebElement login = driver.findElement(loginXpath);
		login.click();
		WebElement userName = driver.findElement(userNameId);
		//userName.clear();
		userName.sendKeys("fuckyouRadha@fucker.com");
		
	}
	
	@After
	public void tearDown() throws Exception {
	}

}
