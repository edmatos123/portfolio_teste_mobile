package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {

	private By txtUse = By.id("com.saucelabs.mydemoapp.android:id/nameET");
	private By txtPass = By.id("com.saucelabs.mydemoapp.android:id/passwordET");
	private By btnLogin = By.id("com.saucelabs.mydemoapp.android:id/loginBtn");
	
	
	public void fazerLogin() {
		
	 sendKeys(txtUse, "bod@exemple.com");

     sendKeys(txtPass, "10203040");

	 click(btnLogin);
		
	}
	
	
	
}
