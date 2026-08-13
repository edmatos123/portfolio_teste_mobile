package pages;

import io.appium.java_client.android.AndroidDriver;

import java.time.Duration;
import java.util.Map;

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
		this.wait = new WebDriverWait(driver,Duration.ofSeconds(5));		
		
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
	
	public void swipeUp() {
		
		int width = driver.manage().window().getSize().getWidth();
		int height = driver.manage().window().getSize().getHeight();		

	    driver.executeScript("mobile: swipeGesture", Map.of(
	        "left", 0,
	        "top", (int) (height * 0.50),
	        "width", width,
	        "height", (int) (height * 0.30),
	        "direction", "up",
	        "percent", 0.20
	    ));
		
	}
	
	public void findUntilEnd(By conteudo, By elementoFinal) {
		
		boolean conteudoEncontrado = false;
		while(!isElementVisible(elementoFinal) && conteudoEncontrado == false) {
			
			if(isElementVisible(conteudo)) {
				conteudoEncontrado = true;
			}else {
				swipeUp();				
			}
			
			
		}			
			
	}
	
	/*public boolean isElementPresent() {
		
	}*/
	
	
	
	
}


