package testCucumber_Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import allPages.HomePage;
import allPages.LoginPage;
import allPages.RegistrationPage;

public class BaseTest {
	private static BaseTest instancBaseTest;

	private WebDriver driver;

	HomePage homePage;
	LoginPage loginPage;
	RegistrationPage registrationPage;

	private BaseTest() {

	}

	public WebDriver openDriver(String browser) {

		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Arif\\eclipse project\\Php_Automation\\BrowserFile\\chromedriver.exe");	
			driver = new ChromeDriver();
		} else if (browser.equals("fireFox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Arif\\eclipse project\\Php_Automation\\BrowserFile\\geckodriver.exe");
			driver = new FirefoxDriver();
		} 
		return driver;	
	}

	public static BaseTest getInstance() {
		if (instancBaseTest == null)
			instancBaseTest = new BaseTest();
		return instancBaseTest;

	}


	public HomePage gethomePage() {
		if (homePage == null)
			homePage = new HomePage(driver);
		return homePage;	
	}

	public LoginPage getLoginPage() {
		if (loginPage == null) 
			loginPage = new LoginPage(driver);
		return loginPage;	
	}

	public RegistrationPage getregistrationPage() {
		if (registrationPage == null) 
			registrationPage = new RegistrationPage(driver);	
		return registrationPage;	
	}




}

