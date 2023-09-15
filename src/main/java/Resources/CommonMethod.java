
package Resources;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class CommonMethod {
	
	public static void handleAssertion(String Actual, String Expected) {
		
		SoftAssert sa= new SoftAssert();
		String ActualText= Actual;
		String ExpectedText= Expected;
		
		sa.assertEquals(ActualText, ExpectedText);
		
		sa.assertAll();
	}
	
	public static void handleDropdown(List<WebElement> a, String text) {
		List<WebElement> obj=a;
		for(WebElement k:obj) {
			if(k.getText().equalsIgnoreCase(text)) {
				k.click();
				break;
			}
		}
	}
	
		
		public static void expWait(WebDriver driver,WebElement xpath, int timeout) {

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));

			wait.until(ExpectedConditions.elementToBeClickable(xpath));
		
		
	}

}
