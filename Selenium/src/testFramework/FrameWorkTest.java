package testFramework;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameWorkTest {

	
	public static WebDriver driver;
	public static  String baseUrl;
	static SearchPageFactory searchPageFactory;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "https://www.expedia.com/";
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
		searchPageFactory = new SearchPageFactory(driver);
	}
	

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		searchPageFactory.clickFlightsTab();
		searchPageFactory.setOriginCity("New York");
		searchPageFactory.setDestinationCity("Chicago");
		
	}

}
