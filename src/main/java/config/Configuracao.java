package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuracao {

	private static Properties properties = new Properties (); 
	
	static {		
	try {
		FileInputStream file = new FileInputStream("src/test/resources/config.properties");
		properties.load(file);
	} catch (IOException e) {		
		e.printStackTrace();
    }		
    }
	
	public static String getString(String chave) {
		return properties.getProperty(chave);
	}
	
	public static Boolean getBoolean(String chave) {
		return Boolean.parseBoolean(properties.getProperty(chave));
	}
	
}