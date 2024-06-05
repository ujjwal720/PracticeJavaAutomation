package Listners;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utillities.Propertiesfilereader;

public class WebdriverManager {

	private static final ThreadLocal<WebDriver> driver=new ThreadLocal<WebDriver>();

	public static WebDriver getDriver() throws IOException {
		
		
		

		if (driver.get() == null) {
			
			driver.set(WebdriverManager.initilizedriver());

			return driver.get();

		}
		return driver.get();

	}
	
	/*

	public static void setDriver(WebDriver driver) {
		WebdriverManager.driver = driver;
	}
	
	
	
	
	
	
	public static WebDriver getwebdriverinstance() {
		
		
		return driver.get();
		
		
		
		
	}
	
	*/

	public static WebDriver initilizedriver() throws IOException {
		
		WebDriver driver=null;;

		try {
			
			String currentDirectory = System.getProperty("user.dir");
			File prope = new File(currentDirectory+"\\src\\test\\java\\TestData\\Config.properties");
			Propertiesfilereader pro=new Propertiesfilereader();
			String browser =pro.ReadPropertiesfiles(prope, "browser");
			if (browser.equals("chrome")) {

					 
			       driver=new ChromeDriver();	 

			}
			
			

			

		}

		catch (Exception e) {
			
			e.printStackTrace();
			

		}
		
		return driver;

	}

}
