package Testcases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.net.URISyntaxException;
import java.util.List;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Stroke;
import java.awt.event.KeyEvent;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

import Resources.CommonMethod;
import Resources.baseclass;
import pageObjectModels.LoginPageObjects;
import pageObjectModels.MyinfoPageObject;

public class MyinfoTestCase extends baseclass{
	

		
	 @Test
	 public void fillPersonalDetails() throws IOException, InterruptedException, AWTException {
		  
	driver.manage().window().maximize();
		
	Thread.sleep(2000);
	//valid login testcase
 LoginPageObjects lpo= new LoginPageObjects(driver);
 lpo.EnterUserName().sendKeys("Admin");
 lpo.EnterPassword().sendKeys("admin123");
 lpo.Login().click();

 
	MyinfoPageObject mpo= new MyinfoPageObject(driver);
	mpo.ClickOnMyinfo().click();

	Thread.sleep(3000);

	Thread.sleep(2000);
	mpo.NationalityDropdown().click();

	Thread.sleep(3000);

	CommonMethod.handleDropdown(mpo.NationalityOptions(), "Indian");
    CommonMethod.handleDropdown(mpo.MaritalStatus(),"Unmarried");
    CommonMethod.handleDropdown(mpo.BloodGroup(), "O+");
	
	
	
	
	
	
	
	
	
	
	
	//first name middle name last name
	 driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
	 driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys( "Sasha");
	 driver.findElement(By.xpath("//input[@placeholder='Middle Name']")).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
	 driver.findElement(By.xpath("//input[@placeholder='Middle Name']")).sendKeys("Ak");
	 driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
	 driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Sharma");
	 //Nickname
	 driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Nitin");
	 Thread.sleep(5000);
	 //Employee ID
	 driver.findElement(By.xpath("(//div[@data-v-957b4417='']/input)[5]")).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE)); Thread.sleep(5000);
	 driver.findElement(By.xpath("(//div[@data-v-957b4417='']/input)[5]")).sendKeys("004");
	 Thread.sleep(2000); 
	
	 driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[5]")).sendKeys("A678B67");
	 driver.findElement(By.xpath("(//span[@class='oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input'])[2]")).click();
	 driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]")).sendKeys("23");
			  Thread.sleep(5000);
	driver.findElement(By.xpath("(//label[@data-v-7ef819fd=''])[2]")).click();
	driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--text']")).click(); 
	 Thread.sleep(5000);
	 
	/*driver.findElement(By.xpath("//div[text()='Browse']")).click();
	   Thread.sleep(2000); //click on ‘Choose file’ to upload the desired file //
	   browse.sendKeys("C:\\Users\\samru\\OneDrive\\Pictures.jpeg");
	   
	   setClipboardData("C:\\Users\\samru\\OneDrive\\Pictures.jpeg"); //native key
	   stroke for CTRL, V and ENTER keys Robot robot = new Robot();
	 robot.keyPress(KeyEvent.VK_CONTROL); robot.keyPress(KeyEvent.VK_V);
	 robot.keyRelease(KeyEvent.VK_V); robot.keyRelease(KeyEvent.VK_CONTROL);
	 robot.keyPress(KeyEvent.VK_ENTER); robot.keyRelease(KeyEvent.VK_ENTER);
	 
	 public static void setClipboardData(String string) {
		 StringSelection
		   stringSelection = new StringSelection(string);
		   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null); 
		   }*/
	
	
	
	
	
	
	
	
	
	
	
	}
	

}
	

	

