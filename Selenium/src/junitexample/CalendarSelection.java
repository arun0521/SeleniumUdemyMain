package junitexample;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalendarSelection {
     WebDriver driver;
     //String baseUrl;
     String websiteLink = "https://www.expedia.co.in/";
     By flighstTab = By.id("tab-flight-tab"); 
	 By flightsDeparting = By.xpath("//span[contains(@class,'icon-calendar')][position()=1]");
	 By dateXpath = By.xpath("//div[@class='datepicker-cal-month'][position()=1]//button[text()='15']");
	 By firstMonthXpath = By.xpath("//div[@class='datepicker-cal-month'][position()=1]");
	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	

	@After
	public void tearDown() throws Exception {
	
	   Thread.sleep(3 * 1000);
		
		
		driver.quit();
		
	}

	@Test
	public void test() throws Exception {
		driver.get(websiteLink);
		
		WebDriverWait wait = new WebDriverWait(driver, 5000);
		
		driver.findElement(flighstTab).click();
		
	
       Thread.sleep(2 * 1000);
		
	     
	    WebElement cal = driver.findElement(flightsDeparting);
	    cal.click();
	   
	   WebElement calendar = driver.findElement(firstMonthXpath);
	   
	   
	   
	   List<WebElement> availableDates = calendar.findElements(By.className("datepicker-cal-date"));
	   
	   
	   for(WebElement date : availableDates){
		   if(date.getText().equals("20")){
			   date.click();
			   break;
		   }
	   }
	}

}
