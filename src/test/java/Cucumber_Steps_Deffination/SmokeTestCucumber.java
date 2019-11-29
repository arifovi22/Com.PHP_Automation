package Cucumber_Steps_Deffination;



import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Cucumber_Steps_SupportingCode.BaseTest;
import allPages.RegistrationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SmokeTestCucumber{


	BaseTest baseTest;

	public SmokeTestCucumber(WebDriver driver) {
		this.baseTest = (BaseTest) driver;
	}

	public SmokeTestCucumber(BaseTest baseTest) {
		this.baseTest = baseTest;
	}

	@Given("user was the home page")
	public void user_was_the_home_page() {
		baseTest.gethomePage().goToHomePage();	
	}

	@When("user put valid user name and passWord") 
	public void user_put_valid_user_name_and_passWord() {
		baseTest.gethomePage().takeMETologin(); 
		baseTest.getLoginPage().doLogin();
	}

	@Then("user able to land on his account page") 
	public void user_able_to_land_on_his_account_page() {
		baseTest.gethomePage().waitTime(3);
		 baseTest.getLoginPage().validateNmae();		  
	}

	@Then("user able to land on his account page and able see his name")
	public void user_able_to_land_on_his_account_page_and_able_see_his_name() {
		baseTest.gethomePage().waitTime(3);
		String actualName = baseTest.getLoginPage().validateNmae();	
		Assert.assertEquals(actualName, "Hi, Demo User", "Not found the user");	
	}

	@Then("user able to land on his account page and do logout")
	public void user_able_to_land_on_his_account_page_and_do_logout() {
		baseTest.gethomePage().waitTime(3);
		 baseTest.getLoginPage().validateNmae();
		 baseTest.getLoginPage().doLogout();	
	}

	@Given("user on the website and click on registration")
	public void user_on_the_website_and_click_on_registration() {
		
		baseTest.gethomePage().takeMetoRegistration();
	
		
	}

	@Then("User put all valid information and landed his account and validate his name")
	public void user_put_all_valid_information() {
		baseTest.getregistrationPage().validateNmae();
	}

	



}
