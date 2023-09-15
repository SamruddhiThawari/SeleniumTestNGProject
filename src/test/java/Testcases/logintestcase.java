package Testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Resources.CommonMethod;
import Resources.Constants;
import Resources.baseclass;
import pageObjectModels.LoginPageObjects;

public class logintestcase extends baseclass {
	

		@Test(priority = 0)
		public void verifyValidLogin() throws IOException, InterruptedException {

			Thread.sleep(2000);

			LoginPageObjects lpo = new LoginPageObjects(driver);
			lpo.EnterUserName().sendKeys(Constants.Validusername);
			lpo.EnterPassword().sendKeys(Constants.ValidPassword);
			lpo.Login();

			CommonMethod.handleAssertion(driver.getCurrentUrl(), Constants.dashboardUrl);



		}

		@Test(priority = 1)
		public void verifyInvalidValidLogin() throws IOException, InterruptedException {

			Thread.sleep(2000);

			LoginPageObjects lpo = new LoginPageObjects(driver);
			lpo.EnterUserName().sendKeys(Constants.Invalidusername);
			lpo.EnterPassword().sendKeys(Constants.InvalidPassword);
			lpo.Login().click();

			Thread.sleep(5000);

			CommonMethod.handleAssertion(lpo.errorMessage().getText(), Constants.InvalidErrorExpectedText);




		}
		}