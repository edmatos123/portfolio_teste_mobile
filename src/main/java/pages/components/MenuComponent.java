package pages.components;

import org.openqa.selenium.By;

import pages.BasePage;

public class MenuComponent extends BasePage{

	private By menu = By.id("com.saucelabs.mydemoapp.android:id/menuIV");
	private By loginMenu = By.xpath("//android.widget.TextView[@content-desc=\"Login Menu Item\"]");
	
	public void clickMenu() {		
		click(menu);		
	}
	
	public void clickLogin() {
		click(loginMenu);
	}	
	
	
	
}
