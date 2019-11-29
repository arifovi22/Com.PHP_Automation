package allPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MasterPage {
	WebDriver driver;

	public MasterPage(WebDriver driver) {
		this.driver = driver;	
	}
	
	public void browsearHandel() {
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();	
	}
	
	
	public void openUrl(String url) {
		
		driver.get(url);
	}

	public void clickOnElement(String locator) {
		try {
			driver.findElement(By.xpath(locator)).click();
		} catch (Exception e) {
			try {
				driver.findElement(By.id(locator)).click();
			} catch (Exception e2) {
				try {
					driver.findElement(By.name(locator)).click();
				} catch (Exception e3) {
					try {
						driver.findElement(By.cssSelector(locator)).click();
					} catch (Exception e4) {

					}}}}
	}

	public void typeOnElement(String locator, String value) {
		try {
			driver.findElement(By.xpath(locator)).sendKeys(value);
		} catch (Exception e) {
			try {
				driver.findElement(By.id(locator)).sendKeys(value);
			} catch (Exception e2) {
				try {
					driver.findElement(By.name(locator)).sendKeys(value);
				} catch (Exception e3) {
					try {
						driver.findElement(By.cssSelector(locator)).sendKeys(value);
					} catch (Exception e4) {

					}}}}
	}

	public String getElement(String locator) {
		try {
			if (locator.contains("Xpath")) {
				return	driver.findElement(By.xpath(locator.split(":")[1])).getText();
			} else if (locator.contains("Id")) {
				return	driver.findElement(By.id(locator.split(":")[1])).getText();
			} else if (locator.contains("Name")) {
				return driver.findElement(By.name(locator.split(":")[1])).getText();
			} else if (locator.contains("CssSelector")) {
				return	driver.findElement(By.cssSelector(locator.split(":")[1])).getText();
			} 	
		} catch (Exception e) {
			return "NULL";
		}
		return "NULL";
	}

	public void calanderSelector(String locator, String selectDate) {
		
		WebElement clickDate = null;
		try {
			 clickDate =	driver.findElement(By.xpath(locator));
		} catch (Exception e) {
			try {
				 clickDate =	driver.findElement(By.id(locator));
			} catch (Exception e2) {
				try {
					 clickDate =	driver.findElement(By.name(locator));
				} catch (Exception e3) {
					try {
					 clickDate =	driver.findElement(By.cssSelector(locator));
					} catch (Exception e4) {
	
					}}}}
		
		selectDate(driver, clickDate, selectDate);	
	}

	public static void selectDate(WebDriver driver, WebElement element, String dateValue) {
		JavascriptExecutor jS = ((JavascriptExecutor) driver);
		jS.executeScript("arguments[0].setAttribute('value','"+dateValue+"');", element);
		
		}
	
	public void  waitTime(long second) {
		driver.manage().timeouts().implicitlyWait(second, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(second, TimeUnit.SECONDS);
	}

public void closeBrowser() {
	driver.close();
}










}


