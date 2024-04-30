package Utillities;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
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

	public void SelectByindex(WebElement e, int x) {

		Select a = new Select(e);
		a.selectByIndex(x);

	}

	public void scroll(int i, int p) throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) BaseTest.getdriver();
		js.executeScript("window.scrollBy(" + i + "," + p + ")", "");

	}
	/*
	 * to do the sort functionality sort functionality for the scripts
	 */

	public List<Integer> sortingfunctionality(List<WebElement> elements) {

		List<Integer> lists = new ArrayList<Integer>();

		for (int i = 0; i <= elements.size() - 1; i++) {
			int get_dot = elements.get(i).getText().indexOf(".");
			String numtext = elements.get(i).getText().substring(1, get_dot);
			int num = Integer.parseInt(numtext);
			lists.add(num);

		}

		Collections.sort(lists);
		return lists;

	}

	/*
	 * to get the function of it there for the following data and to fetch values
	 * for the data
	 */

	public List<Integer> justgettextofnumbers(List<WebElement> elements) {

		List<Integer> lists = new ArrayList<Integer>();

		for (int i = 0; i <= elements.size() - 1; i++) {

			int get_dot = elements.get(i).getText().indexOf(".");
			String numtext = elements.get(i).getText().substring(1, get_dot);
			int num = Integer.parseInt(numtext);
			lists.add(num);

		}

		return lists;

	}

}
