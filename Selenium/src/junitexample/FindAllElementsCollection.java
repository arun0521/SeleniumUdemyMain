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

public class FindAllElementsCollection {
	WebDriver driver;
	String baseURl;
	By radioButtonsXpath = By.xpath("//input[contains(@type,'radio') and contains(@name,'cars')]");
	
	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseURl = "https://letskodeit.teachable.com/p/practice";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() throws Exception {
		//driver.close();
	}

	@Test
	public void test() throws Exception {
		driver.get(baseURl);
		List<WebElement> radioButtons = driver.findElements(radioButtonsXpath);
		boolean flag = false;
		for(int i = 0 ; i < radioButtons.size();i++){
			 flag = radioButtons.get(i).isSelected();
			 
			 if(!flag){
				 radioButtons.get(i).click();
				}
			 }
		}
	}


