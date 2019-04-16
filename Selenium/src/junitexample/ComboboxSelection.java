package junitexample;

import static org.junit.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ComboboxSelection {
     WebDriver driver;
     String baseURL;
     By selectCarsId = By.id("carselect");
	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseURL = "https://letskodeit.teachable.com/p/practice";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		driver.get(baseURL);
		
		WebElement ele_Select = driver.findElement(selectCarsId);
		
		Select select = new Select(ele_Select);
		
		select.selectByValue("bmw");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		select.selectByIndex(2);
	
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		select.selectByVisibleText("BMW");
		
		/*get all options and print*/
		List<WebElement> optionsElement = select.getOptions();
		
		for(int i = 0; i < optionsElement.size();i++){
			
			String name = optionsElement.get(i).getText();
			System.out.println(name);
		}
	}

}
