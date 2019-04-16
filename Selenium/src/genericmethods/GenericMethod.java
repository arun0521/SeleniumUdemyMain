package genericmethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GenericMethod {

	public WebDriver driver;
	
	public GenericMethod(WebDriver driver) {
		this.driver = driver;
		
	}

	public WebElement getElement(String locator,String type){
		
		type = type.toLowerCase();
		if(type.contains("id")){
			System.out.println("The element found of type:" +type);
			return this.driver.findElement(By.id(locator));
		}
		else if(type.contains("xpath")){
			System.out.println("The element found of type:" +type);
			return this.driver.findElement(By.xpath(locator));
		}
		else{
			System.out.println("not supported type given");
			return null;
		}
		
	}
	
public List<WebElement> getElementList(String locator,String type){
		
		type = type.toLowerCase();
		if(type.contains("id")){
			System.out.println("The element found of type:" +type);
			return this.driver.findElements(By.id(locator));
		}
		else if(type.contains("xpath")){
			System.out.println("The element found of type:" +type);
			return this.driver.findElements(By.xpath(locator));
		}
		else{
			System.out.println("not supported type given");
			return null;
		}
		
	}

public boolean isElementPresent(String locator,String type){
	
	List<WebElement> list = getElementList(locator, type);
	
	if(list.size() >0){
		return true;
	}
	else{
	   return false;
	}
}


}
