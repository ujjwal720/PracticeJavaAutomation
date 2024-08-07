 package Listners;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

	public static WebDriver driver;

	@BeforeSuite
	public static WebDriver getdriver() throws IOException {

		if (driver == null) {

			driver = WebdriverManager.getDriver();
			driver.manage().window().maximize();
			driver.get("https://practice.automationtesting.in/");
			

			return driver;

		}

		return driver;

	}

}
