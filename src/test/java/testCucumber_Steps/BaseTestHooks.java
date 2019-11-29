package testCucumber_Steps;



import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


//import io.cucumber.java.After;
//import io.cucumber.java.Before;

public class BaseTestHooks {
	WebDriver driver;

	BaseTest instance;

	@BeforeMethod
	public void pageStart() {
		instance =	BaseTest.getInstance();
		driver = instance.openDriver("chrome");	
		instance.gethomePage().browsearHandel();
		instance.homePage.goToHomePage();
	}

	@AfterMethod
	public void closeBrowser() {
		instance.homePage.closeBrowser();

	}

	@Test
	public void logIn() {

		
		instance.homePage.dateSelection();
		instance.homePage.takeMETologin();

		instance.loginPage.doLogin();
		instance.homePage.waitTime(5);
		String actualName = instance.loginPage.validateNmae();
		Assert.assertEquals(actualName, "Hi, Demo User", "Not found the user");

	}


	@Test
	public void logOut() {
	
		instance.homePage.dateSelection();
		instance.homePage.takeMETologin();
		instance.loginPage.doLogin();
		instance.homePage.waitTime(5);
		instance.loginPage.doLogout();

	}

	@Test
	public void registrationTest(){



		
		instance.homePage.takeMetoRegistration();


		instance.homePage.waitTime(5);

		instance.registrationPage.validateNmae();

		instance.homePage.closeBrowser();

	}





}
