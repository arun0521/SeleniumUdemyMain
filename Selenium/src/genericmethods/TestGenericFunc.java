package genericmethods;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.steadystate.css.parser.selectors.SyntheticElementSelectorImpl;

public class TestGenericFunc {
	WebDriver driver;
	public String baseUrl;
	GenericMethod gm;
	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "https://letskodeit.teachable.com/p/practice";
		gm = new GenericMethod(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void test() {
		driver.get(baseUrl);
		
		WebElement ele = gm.getElement("//input[@id='name']", "xpath");
		System.out.println(ele.isEnabled());
		
		boolean isPresent = gm.isElementPresent("//input[@id='name']", "xpath");
		System.out.println("the element is found: " +isPresent);
	}

}
