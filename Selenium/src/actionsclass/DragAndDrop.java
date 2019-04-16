package actionsclass;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class DragAndDrop {
	WebDriver driver;
	String baseUrl;
	
	ExtentReports extenReports;
    ExtentTest test;
	
	@Before
	public void setUp() throws Exception {
		extenReports = new ExtentReports("C:\\Users\\Arun\\workspace\\Selenium\\test-output\\logintest.html");
		test = extenReports.startTest("logintest");
		driver = new ChromeDriver();
		baseUrl = "http://jqueryui.com/droppable/";
		
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
		
		WebElement dragEle = driver.findElement(By.id("draggable"));
		WebElement dropEle = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		//actions drag and drop
		action.dragAndDrop(dragEle, dropEle).build().perform();
		
	
		
		//actions click and hold,move to drop point,release
		
		action.clickAndHold(dragEle).moveToElement(dropEle).release().build().perform();
		
		
	}

}
