package actionsclass;

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
import org.openqa.selenium.interactions.*;
public class MouseHover {
	WebDriver driver;
	String baseUrl;
	JavascriptExecutor exe;

	@Before
	public void setUp() throws Exception {
		baseUrl = "https://letskodeit.teachable.com/p/practice";
		
		driver = new ChromeDriver();
		exe = (JavascriptExecutor)driver;
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

	@Test
	public void test() throws Exception {
		
	
		exe.executeScript("window.scrollBy(0,600)");
		Thread.sleep(2000);
		
		WebElement mousehoverElement = driver.findElement(By.id("mousehover"));
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.moveToElement(mousehoverElement).perform();
		Thread.sleep(2000);
		Thread.sleep(2000);
		WebElement ElementFirst = driver.findElement(By.xpath("//div[@class='mouse-hover-content']//a[text()='Top']"));
		action.moveToElement(ElementFirst).click().perform();
		
		
		
	}

}
