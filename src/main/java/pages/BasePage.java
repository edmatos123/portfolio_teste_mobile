package pages;

import io.appium.java_client.android.AndroidDriver;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driver.DriverFactory;

public class BasePage {

	protected AndroidDriver driver ;
	protected WebDriverWait wait;
	
	public BasePage() {
		
		this.driver = DriverFactory.getDriver();
		this.wait = new WebDriverWait(driver,Duration.ofSeconds(6));		
		
	}
	
	
	protected WebElement waitVisible(By by) {		
		return wait.until(ExpectedConditions.visibilityOfElementLocated(by));		
	}
	
	protected WebElement waitClickable(By by) {
		return wait.until(ExpectedConditions.elementToBeClickable(by));
	}
	
	
	protected boolean isElementVisible(By by) {
		
		 try {
	          return waitVisible(by).isDisplayed();

	     } catch (Exception e) {

	          return false;
	     }
	}
	
	protected void click(By by) {
		waitClickable(by).click();
	}
	
	protected void sendKeys(By by, String txt) {
		waitVisible(by).sendKeys(txt);
	}
	
	protected void swipeUp_OLD() {
		
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
	
	protected void findUntilEnd(By conteudo, By elementoFinal) {
		
		boolean conteudoEncontrado = false;
		while(!isElementVisible(elementoFinal) && conteudoEncontrado == false) {
			
			if(isElementVisible(conteudo)) {
				conteudoEncontrado = true;
			}else {
				swipeUp();				
			}
			
			
		}			
			
	}
	
	 protected List<WebElement> findElements(By by){
	    	
	    	return driver.findElements(by);
	    }
	    
	 protected void swipeUp() {

		    int width = driver.manage().window().getSize().getWidth();
		    int height = driver.manage().window().getSize().getHeight();

		    PointerInput finger = new PointerInput(
		        PointerInput.Kind.TOUCH,
		        "finger"
		    );

		    Sequence swipe = new Sequence(finger, 0);

		    swipe.addAction(
		        finger.createPointerMove(
		            Duration.ZERO,
		            PointerInput.Origin.viewport(),
		            width / 2,
		            (int) (height * 0.80)
		        )
		    );

		    swipe.addAction(
		        finger.createPointerDown(0)
		    );

		    swipe.addAction(
		        finger.createPointerMove(
		            Duration.ofMillis(700),
		            PointerInput.Origin.viewport(),
		            width / 2,
		            (int) (height * 0.30)
		        )
		    );

		    swipe.addAction(
		        finger.createPointerUp(0)
		    );

		    driver.perform(List.of(swipe));
		}

	
	
	
}


