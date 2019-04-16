package testNGPractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id = "user_email")
	WebElement userName;
	
	@FindBy(id = "user_password")
	WebElement passWord;
	
	@FindBy(xpath = "//input[@value='Log In']")
	WebElement loginButton;
	
	public void logInToWebsite(String UserName,String Password) {
		userName.sendKeys(UserName);
		passWord.sendKeys(Password);
		loginButton.click();
	}
}
