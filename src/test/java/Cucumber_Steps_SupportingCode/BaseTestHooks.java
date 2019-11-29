package Cucumber_Steps_SupportingCode;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseTestHooks {
	BaseTest baseTest;

	public BaseTestHooks (WebDriver driver) {
		this.baseTest = (BaseTest) driver;		
	}

	public BaseTestHooks(BaseTest baseTest) {
		this.baseTest = baseTest;
	}

	@Before
	public void pageStart() {
		this.baseTest.openDriver("chrome");
		baseTest.driver();
		baseTest.gethomePage().browsearHandel();
	}

	@After
	public void closeBrowser() {
		baseTest.homePage.closeBrowser();

	}


}
