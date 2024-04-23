package Utillities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ResusableMethods extends BaseTest {

	public void waits(WebElement element) {
		WebDriverWait waits = new WebDriverWait(BaseTest.driver, Duration.ofSeconds(10));
		waits.until(ExpectedConditions.elementToBeClickable(element));

	}

	public String getetext(WebElement e) {

		try {

			return e.getText();
		}

		catch (Exception except) {
			
			    return except.getMessage();

		}

	}
	
	
	
	
	

}
