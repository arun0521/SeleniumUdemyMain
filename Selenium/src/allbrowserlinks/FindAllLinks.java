package allbrowserlinks;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAllLinks {

   public static WebDriver driver;
	public static String baseUrl = "https://www.expedia.com";
	@BeforeClass
	public static  void  setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		List<WebElement> allLinks = findAllElements(driver);
		for (WebElement e : allLinks) {
			String href = e.getAttribute("href");
			try {
				System.out.println("URL " +href + " returned " + linkConnection(new URL(href)));
			}
			catch(Exception e1) {
				System.out.println(e1.getMessage());
			}
		}
		
		
		
	}
	
	public static List<WebElement> findAllElements(WebDriver driver){
		List<WebElement> elementToClick = new ArrayList<WebElement>();
		
		List<WebElement> allElements = driver.findElements(By.tagName("a"));
		allElements.addAll(driver.findElements(By.tagName("img")));
		
		for(WebElement e : allElements) {
			if(e.getAttribute("href") != null) {
				elementToClick.add(e);
			}
		}
		
		return elementToClick;
	}
	
	public static String linkConnection(URL url)
	{
		HttpURLConnection httpConnection;
		String responseMessage;
		try{
			httpConnection = (HttpURLConnection)url.openConnection();
			httpConnection.connect();
		    responseMessage = httpConnection.getResponseMessage();
			httpConnection.disconnect();
		}
		catch (Exception e) {
			return e.getMessage();
		}
		
		return responseMessage;
	}
}
