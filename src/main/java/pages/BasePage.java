package pages;

import io.appium.java_client.android.AndroidDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driver.DriverFactory;

public class BasePage {

	protected AndroidDriver driver ;
	protected WebDriverWait wait;
	
	public BasePage() {
		
		this.driver = DriverFactory.getDriver();
		this.wait = new WebDriverWait(driver,Duration.ofSeconds(10));		
		
	}
	
	
	public WebElement waitVisible(By by) {		
		return wait.until(ExpectedConditions.visibilityOfElementLocated(by));		
	}
	
	public WebElement waitClickable(By by) {
		return wait.until(ExpectedConditions.elementToBeClickable(by));
	}
	
	
	public boolean isElementVisible(By by) {
		
		 try {
	          return waitVisible(by).isDisplayed();

	     } catch (Exception e) {

	          return false;
	     }
	}
	
	public void click(By by) {
		waitClickable(by).click();
	}
	
	public void sendKeys(By by, String txt) {
		waitVisible(by).sendKeys(txt);
	}
	
	
	
}
