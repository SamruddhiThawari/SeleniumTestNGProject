package pageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	public WebDriver driver;// this is having no scope means null 
	
	private By username= By.xpath("//input[@name='username']");
	
	private By password= By.xpath("//input[@name='password']");
	
	private By login= By.xpath("//button[@type='submit']");
	
	private By errorMessage= By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']");
	
	public LoginPageObjects(WebDriver driver2) {
		this.driver=driver2;
	}
	
	
	public WebElement EnterUserName() {
		return driver.findElement(username);
		
	}
	public WebElement EnterPassword() {
		return driver.findElement(password);
	}
	
	public WebElement Login() {
		return driver.findElement(login);
		
	}
	public WebElement errorMessage() {
		return driver.findElement(errorMessage);
		
	}

}
