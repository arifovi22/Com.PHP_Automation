package allPages;

import org.openqa.selenium.WebDriver;

public class LoginPage extends MasterPage {
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public void doLogin() {
		String emailField ="//div[@class='form-group']//input[@name ='username']";
		String passWordField = "//div[@class='form-group']//input[@name ='password']";
		String clickOnLogin ="//button[text()='Login']";
		typeOnElement(emailField, "user@phptravels.com");
		typeOnElement(passWordField, "demouser");
		clickOnElement(clickOnLogin);
	}
	
	public String validateNmae() {
		String name ="Xpath://div[@class='col-md-8']";
		String actualName = getElement(name);
		return actualName;

	}
	
	public void doLogout() {
		String clickName = "//div[@class='dropdown dropdown-login dropdown-tab']//a[text()=' Demo                  ']";
		String clicklogOut ="//a[text()='Logout']";
		clickOnElement(clickName);
		clickOnElement(clicklogOut);	
	}

	
	
	
	
	
	
	
}
