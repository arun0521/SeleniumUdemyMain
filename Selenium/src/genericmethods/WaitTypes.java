package genericmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitTypes {
	
	WebDriver driver;

	public WaitTypes(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public WebElement waitForElement(By locator,int timeOut){
		WebElement element = null;
		try{
			System.out.println("The element" +locator +"is found");
			WebDriverWait wait = new WebDriverWait(driver,timeOut);	
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		}
		catch (Exception e) {
			System.out.println("The element is not found" +locator);
		}
		
		return element;
	}
	

	public WebElement waitToBeClickable(By locator,int timeOut){
		WebElement element = null;
		try{
			System.out.println("The element" +locator +"is found is clickable");
			WebDriverWait wait = new WebDriverWait(driver,timeOut);
			element = wait.until(ExpectedConditions.elementToBeClickable(locator));		
			element.click();
		}
		catch (Exception e) {
			System.out.println("The element is not found" +locator);
		}
		
		return element;
	}
	
	
	

}
