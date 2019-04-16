package testNGPractise;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterClass;

public class PractiseTest {
	WebDriver driver;
	String baseURL;
    HomePage homePage;
    LoginPage loginPage;
	@BeforeMethod
	public void beforeMethod() {
	}

	@AfterMethod
	public void afterMethod() {
	}

	@BeforeClass
	@Parameters({"browserName"})
	public void beforeClass(String browserName) {
		switch (browserName) {
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "chrome":
			driver = new ChromeDriver();
			break;
		default:
			driver = new ChromeDriver();
		}
		
		baseURL = "https://letskodeit.teachable.com";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseURL);
		
		homePage = new HomePage(driver);
		loginPage = new LoginPage(driver);
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	@Test
	public void testRun() {
       homePage.loginButton.click();
       
       loginPage.logInToWebsite("Sura", "Sura");
       
       
	}

}
