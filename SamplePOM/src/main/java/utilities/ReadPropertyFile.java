package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;





public class ReadPropertyFile{

	static Properties prop1 = new Properties();
	static InputStream input = null;
	

	public static void loadProperties() {
	try {
		input = new FileInputStream(new File(""));
		prop1.load(input);
		
		} catch (IOException ex) {
		ex.printStackTrace();
		}	
	}
	
	public static String readProperty(String key) {
		String value=prop1.getProperty(key);
		return value;
	}
	
	
}
