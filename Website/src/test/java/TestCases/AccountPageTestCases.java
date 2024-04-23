package TestCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utillities.BaseTest;
import Utillities.ExelUtilities;

public class AccountPageTestCases extends BaseTest {

	public Pages.MyAccount MyAccount;

	public AccountPageTestCases() {

		MyAccount = new Pages.MyAccount(BaseTest.driver);

	}

	@Test
	public void test1() {

	}

	@Test
	public void testdata1() throws IOException {

		ExelUtilities excel = new ExelUtilities();
		String currentDirectory = System.getProperty("user.dir");
		String relativePath = "/src/test/java/Utillities/AutomationPractice.xlsx";
		File a = new File(currentDirectory + relativePath);
		int cols = excel.getcolno(a);
		System.out.println(cols);
		

	}
}