package Utillities;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import Listners.BaseTest;

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
	 * to do the sort functionality sort functionality for the scripts with java
	 * method
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

	/*
	 * remove rupess sign form it
	 */

	public String removecertainellementformstring(String value, int x, WebElement elemts) {

		int u = elemts.getText().indexOf(value);
		String actual = elemts.getText().substring(x, u);

		return actual;

	}

	/*
	 * compariison of prices in the list in the website then compare prices
	 * 
	 * 
	 */

	public boolean comparetwolistsfully(List<Integer> prices, List<Integer> prices2) {

		boolean result = false;
		int count = 0;

		if (prices.size() == prices2.size()) {

			for (int i = 0; i <= prices.size() - 1; i++) {

				int x = prices.get(i);
				int n = prices.get(i);

				if (x == n) {

					count++;

				}

			}

			if (count == prices.size()) {

				System.out.println(count);
				result = true;
				System.out.println(count);

				return result;
			}

		}

		return result;

	}

	public String Keychods(String s) {

		String l = Keys.chord(Keys.ENTER, s);
		
		return l;

	}

}
