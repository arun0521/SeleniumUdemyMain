package actionsclass;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
	WebDriver driver;
	String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "http://jqueryui.com/slider/";
		
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
		driver.get(baseUrl);
		Thread.sleep(2000);
		
		driver.switchTo().frame(0);
		
		WebElement sliderBtn = driver.findElement(By.xpath("//div[@id='slider']//span"));
		
		Actions action = new Actions(driver);
		action.dragAndDropBy(sliderBtn, 150, 0).perform();
	}

}
