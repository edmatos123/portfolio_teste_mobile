package driver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import factory.CapabilitiesFactory;

import java.net.MalformedURLException;
import java.net.URL;

import config.Configuracao;

public class DriverFactory {
	
	private static final ThreadLocal <AndroidDriver> driver = new ThreadLocal<>(); 
	
	

	public static void startDriver() throws MalformedURLException {
		//URL url = new URL(Configuracao.getString("Url"));		
		URL url = new URL(Configuracao.getString("kobitonServerUrl"));
		driver.set(new AndroidDriver(url,CapabilitiesFactory.getCapabilities()));		
		
		}
	
	
	public static AndroidDriver getDriver() {
		
		return driver.get();
		
	}
	
	public static void quitDriver() {
		
		if(driver.get() != null) {
			driver.get().quit();
			driver.remove();
			
		}
		
		
	}
	
	

}
