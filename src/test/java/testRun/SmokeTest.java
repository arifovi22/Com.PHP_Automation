package testRun;

import org.testng.annotations.Test;
import org.testng.Assert;



import allPages.HomePage;
import allPages.LoginPage;
import allPages.RegistrationPage;

public class SmokeTest extends BaseTest {

	//@Test
	public void logIn() {
		this.openDriver("chrome");
		driver.manage().deleteAllCookies();
		HomePage homePage = new HomePage(driver);
		homePage.goToHomePage();
		homePage.dateSelection();
		homePage.takeMETologin();
		LoginPage log = new LoginPage(driver);
		log.doLogin();
		homePage.waitTime(5);
		String actualName = log.validateNmae();
		Assert.assertEquals(actualName, "Hi, Demo User", "Not found the user");
		homePage.closeBrowser();
	}


	//@Test
	public void logOut() {
		this.openDriver("chrome");
		driver.manage().deleteAllCookies();
		HomePage homePage = new HomePage(driver);
		homePage.goToHomePage();
		homePage.dateSelection();
		homePage.takeMETologin();
		LoginPage log = new LoginPage(driver);
		log.doLogin();
		homePage.waitTime(5);
		log.doLogout();

		homePage.closeBrowser();

	}


	@Test
	public void registrationTest(){

		this.openDriver("chrome");
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		HomePage homePage = new HomePage(driver);
		homePage.goToHomePage();
		homePage.takeMetoRegistration();
		RegistrationPage reg =new RegistrationPage(driver);
//reg.doRegistration("ss", "ss");
		reg.validateNmae();

		homePage.closeBrowser();

	}

	//@Test
	public void regLogOut() {


		this.openDriver("chrome");
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		HomePage homePage = new HomePage(driver);
		homePage.goToHomePage();
		homePage.takeMetoRegistration();
		RegistrationPage reg =new RegistrationPage(driver);

		reg.validateNmae();
		homePage.waitTime(2);
		reg.logOut();
		homePage.closeBrowser();



	}






}
