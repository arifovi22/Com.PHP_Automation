package allPages;

import java.util.Random;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class RegistrationPage extends MasterPage{
	static	String lastname;
	static	String eMail;

	public RegistrationPage(WebDriver driver) {
		super(driver);
	}

	public void doRegistration(String lastname, String eMail) {
		String firstaName = "//input[@name='firstname']";
		String lastName ="//input[@name='lastname']";
		String phoneNo = "//input[@name='phone']";
		String email = "//input[@name='email']";
		String passWord ="//input[@name='password']";
		String confirmPass ="//input[@name='confirmpassword']";
		String signUpButton="//button[@type='submit'][text()=' Sign Up']";


		typeOnElement(firstaName, "ABC");
		typeOnElement(lastName, lastname);
		typeOnElement(phoneNo, "01229929");
		typeOnElement(email, eMail);
		typeOnElement(passWord, "abc123");
		typeOnElement(confirmPass, "abc123");
		clickOnElement(signUpButton);	
	}


	public void validateNmae() {
		waitTime(2);
		Random random =new Random();
		int i = random.nextInt(1000);
		doRegistration("D"+i, "abc"+i+"@gmail.com");
		
		
		String name ="Xpath://div[@class='col-md-8']";

		

	
		String actualName = getElement(name);
		System.out.println(actualName);
		Assert.assertEquals(actualName, "Hi, ABC D"+i, "Not Found the User" );
	}


	public void logOut() {
		String nameLable = "//div[@class='dropdown dropdown-login dropdown-tab']//i[@class='bx bx-user']";
		String logOut =	"//a[text()='Logout']";
		clickOnElement(nameLable);
		clickOnElement(logOut);

	}



}
