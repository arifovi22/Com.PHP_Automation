package allPages;
import org.openqa.selenium.WebDriver;



public class HomePage extends MasterPage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public void goToHomePage() {
		openUrl("https://www.phptravels.net/");
	}

	public void takeMETologin() {
		String myAccountLabel ="//div[@class='dropdown dropdown-login dropdown-tab']";
		String logInLabel = "//a[text()='Login']";
		clickOnElement(myAccountLabel);
		clickOnElement(logInLabel);
	}

	public void takeMetoRegistration() {
		String myAccountLabel ="//div[@class='dropdown dropdown-login dropdown-tab']";
		String signUpLable ="//a[text()='Sign Up']";
		clickOnElement(myAccountLabel);
		clickOnElement(signUpLable);	
	}

	public void dateSelection() {
		String checkIn = "//input[@id='checkin']";
		String checkOut ="//input[@id='checkout']";
		calanderSelector(checkIn, "11-30-2019");
		calanderSelector(checkOut , "12-14-2019");	
	}

	






}
