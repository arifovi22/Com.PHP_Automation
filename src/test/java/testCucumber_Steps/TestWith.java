package testCucumber_Steps;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;



public class TestWith {
	WebDriver driver;
	BaseTest instance;

	@Test
	public void registrationTest(){

	
		
		instance.homePage.goToHomePage();
		instance.homePage.takeMetoRegistration();
		
//reg.doRegistration("ss", "ss");
		instance.registrationPage.validateNmae();

		instance.homePage.closeBrowser();

	}
	
	
	
	

}
