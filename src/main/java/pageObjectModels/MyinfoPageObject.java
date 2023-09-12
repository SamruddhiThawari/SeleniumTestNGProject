package pageObjectModels;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyinfoPageObject {
	
	public WebDriver driver;
	
	private By myinfo= By.xpath("//span[normalize-space()='My Info']");
	
	private By EmployeeName= By.xpath("//input[@placeholder='First Name']");
	
	private By EmployeeMiddleName= By.xpath("//input[@name='middleName']");
	
	private By EmployeeLastName= By.xpath("//input[@name='lastName']");
	
	private By Nickname= By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	
	private By EmployeeId= By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]");
	
	private By NationalityDropdown= By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]");
	
	private By NationalityOptions= By.xpath("//div[@class='oxd-select-option']");
	 
	private By MaritalStatus= By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]");
	
	private By BloodGroup= By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[3]");
	
	
	
	public MyinfoPageObject(WebDriver driver2) {
	this.driver=driver2;
	}
	public WebElement ClickOnMyinfo() {
		return driver.findElement(myinfo);
	}
	public WebElement EmployeeName() {
		return driver.findElement(EmployeeName);
	}
	public WebElement EmployeeMiddleName() {
		return driver.findElement(EmployeeMiddleName);
	}
	
	public WebElement EmployeeLastName() {
		return driver.findElement(EmployeeLastName);
	}
	
	public WebElement Nickname() {
		return driver.findElement(Nickname);
	}
	public WebElement EmployeeId() {
		return driver.findElement(EmployeeId);
	}
	
	
	public WebElement NationalityDropdown() {
		return driver.findElement(NationalityDropdown);
	}
	public List<WebElement> NationalityOptions () {
		return driver.findElements(NationalityOptions);
	}
	public List<WebElement> MaritalStatus(){
		return driver.findElements(MaritalStatus);
	}
	public List<WebElement> BloodGroup(){
		return driver.findElements(BloodGroup);
	}
	
}
