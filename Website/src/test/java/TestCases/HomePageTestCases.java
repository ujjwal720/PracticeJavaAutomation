package TestCases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.HomePage;
import Utillities.BaseTest;

public class HomePageTestCases extends BaseTest {

	public HomePage HomePage;

	public HomePageTestCases() throws IOException {
		HomePage = new HomePage(BaseTest.getdriver());

	}

	@Test(priority = 1, description = "To test the slider value whether the item remain is three or not")
	public void test01() throws IOException {

		int num = HomePage.slidersvalue();
		Assert.assertEquals(num, 3);

	}

	@Test(priority = 2, description = "to test whetehr redirection of the 3 slider is happening", dependsOnMethods = "test01")
	public void test2() throws IOException {

		List<WebElement> iop = HomePage.laxyloading;

		for (int i = 0; i <= iop.size() - 1; i++) {

			iop.get(i).click();
			BaseTest.getdriver().navigate().back();

		}

	}

	@Test(priority = 3, description = "To test whether the test is diplayed or not")
	public void test3() {

		boolean emailidfield = HomePage.emailid.isDisplayed();
		Assert.assertTrue(emailidfield);

	}

	@Test(priority = 4, description = "To test the functionality on the basis of it")
	public void test4() {

		
		
	}

}
