package Utillities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverManager {

	private static WebDriver driver;

	public static WebDriver getDriver() throws IOException {

		if (driver == null) {
			driver = initilizedriver();

			return driver;

		}
		return driver;

	}

	public static void setDriver(WebDriver driver) {
		WebdriverManager.driver = driver;
	}

	public static WebDriver initilizedriver() throws IOException {

		try {
			
			String currentDirectory = System.getProperty("user.dir");
			File prope = new File(currentDirectory+"\\src\\test\\java\\TestData\\Config.properties");
			Propertiesfilereader pro=new Propertiesfilereader();
			String browser =pro.ReadPropertiesfiles(prope, "browser");
			if (browser.equals("chrome")) {

				driver = new ChromeDriver();

			}
			
			driver.get(pro.ReadPropertiesfiles(prope, "url"));
			driver.manage().window().maximize();

			return driver;

		}

		catch (Exception e) {
			
			e.printStackTrace();
			return driver;

		}

	}

}
