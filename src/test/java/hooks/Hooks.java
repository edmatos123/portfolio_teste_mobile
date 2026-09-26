package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.net.MalformedURLException;

import driver.DriverFactory;

public class Hooks {

	
	
	@Before
	public void iniciar() throws MalformedURLException {
	
		DriverFactory.startDriver();
	}
	
	@After
	public void finalizar() throws InterruptedException {
		
    	DriverFactory.quitDriver();				
    	Thread.sleep(5000);
	}
	
}
