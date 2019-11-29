package testRun;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {

	 WebDriver driver;
	
	 
	public WebDriver openDriver(String browser) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Arif\\eclipse project\\Php_Automation\\BrowserFile\\chromedriver.exe");	
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("fireFox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Arif\\eclipse project\\Php_Automation\\BrowserFile\\geckodriver.exe");
			driver =new FirefoxDriver();
		} 
		return driver;	
	}
	
	

	





}
