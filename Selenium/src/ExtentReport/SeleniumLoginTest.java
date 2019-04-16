package ExtentReport;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SeleniumLoginTest {
	ExtentReports report;
	ExtentTest test;
	private WebDriver driver;
	private String baseUrl;
	By loginXpath = By.xpath("//div[contains(@class,'collapse')]//a[contains(text(),'Login')]");
	String title = "";
	@BeforeClass
	public void beforeClass() {
		baseUrl = "https://letskodeit.teachable.com";
		driver = new ChromeDriver();
		report = new ExtentReports("C:\\Users\\Arun\\workspace\\Selenium\\test-output\\logintest.html");
		test = report.startTest("Verify Welcome Text");
		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		test.log(LogStatus.INFO, "Browser Started...");
		driver.get(baseUrl);
	}
	
	@Test
	public void test1_validLoginTest() throws Exception {
       
		
		Thread.sleep(5 * 1000);
		test.log(LogStatus.INFO, "Clicked on signup link");
		title = driver.getTitle();
		test.log(LogStatus.INFO, "Got Title");
		System.out.println(title);
		test.log(LogStatus.INFO, "print Title");
		WebElement ele_login = driver.findElement(loginXpath);
		ele_login.click();
	}
	
	@AfterClass
	public void afterClass() {
		driver.quit();
		report.endTest(test);
		report.flush();
	}
}