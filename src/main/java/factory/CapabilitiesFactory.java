package factory;

import java.time.Duration;

import io.appium.java_client.android.options.UiAutomator2Options;
import config.Configuracao;

public class CapabilitiesFactory {

		
	public static UiAutomator2Options getCapabilities() {
		
		UiAutomator2Options options = new UiAutomator2Options();
		
		options.setPlatformName(Configuracao.getString("platformName"));
		options.setAutomationName(Configuracao.getString("automationName"));
		//options.setDeviceName(Configuracao.getString("deviceName"));
		options.setDeviceName(Configuracao.getString("deviceNameKobiton"));
		options.setAppPackage(Configuracao.getString("appPackage"));
		options.setAutoGrantPermissions(Configuracao.getBoolean("autoGrantPermissions"));
		options.setNewCommandTimeout(Duration.ofSeconds(Long.parseLong(Configuracao.getString("newCommandTimeout"))));
		
	    options.setCapability("appium:username",Configuracao.getString("kobitonUSR"));
	    options.setCapability("appium:accessKey",Configuracao.getString("kobitonAPI"));
	    options.setCapability("kobiton:app",Configuracao.getString("kobitonAPP"));
	    
		return options;
	}
	
	
}
