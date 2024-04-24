package TestCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utillities.BaseTest;
import Utillities.ExelUtilities;
import Utillities.ResusableMethods;

public class AccountPageTestCases extends BaseTest {

	public Pages.MyAccount MyAccount;
	public ResusableMethods Methods;

	public AccountPageTestCases() throws IOException {

		MyAccount = new Pages.MyAccount(BaseTest.getdriver());
		Methods = new ResusableMethods();

	}

	@Test(dataProvider = "testdata1", enabled = false)
	public void test1(String email, String password) {

		int count = 0;

		MyAccount.MyAccountbutton();
		MyAccount.email(email);
		MyAccount.pass(password);
		MyAccount.register();

		if (count == 0) {

			// Assert.assertEquals(MyAccount.passtext(), "Medium");

		}

		else {

			// Assert.assertEquals(MyAccount.passtext(), "Weak");

		}

		MyAccount.signoutbutton();
		Methods.waits(MyAccount.email);

	}

	@DataProvider
	public Object[][] testdata1() throws IOException {

		ExelUtilities excel = new ExelUtilities();
		String currentDirectory = System.getProperty("user.dir");
		String relativePath = "//src//test/java//Utillities//AutomationPractice.xlsx";
		File a = new File(currentDirectory + relativePath);
		int cols = excel.getcolno(a);
		int rows = excel.getrowno(a) + 1;
		Object[][] data = new Object[rows][cols];
		for (int i = 0; i <= rows - 1; i++) {

			for (int j = 0; j < cols; j++) {

				data[i][j] = excel.ReadExcelFile(a, i, j);

			}

		}

		return data;

	}

	@Test(description = "To test the functionality of the already created account in the selenium", dataProvider = "testdata1", enabled = false)
	public void test4(String email, String password) {

		MyAccount.MyAccountbutton();
		MyAccount.email(email);
		MyAccount.pass(password);
		MyAccount.register();
		MyAccount.email.clear();
		MyAccount.password.clear();
		String actual = "Error: An account is already registered with your email address. Please login.";
		Assert.assertEquals(MyAccount.errors(), actual);

	}

	@Test(description = "To test is with empty username and password", enabled = true)
	public void test5() {

		MyAccount.MyAccountbutton();
		MyAccount.email("");
		MyAccount.pass("");
		MyAccount.register();
		String actual = "Error: Please provide a valid email address.";
		Assert.assertEquals(MyAccount.errors(), actual);

	}

	@Test(description = "Keeping the email field as empty")
	public void test6() {

		
		
		MyAccount.MyAccountbutton();
		MyAccount.email("");
		MyAccount.pass("Ujjwal@123");
		MyAccount.register();
		String actual = "Er: Please provide a valid email address.";
		Assert.assertEquals(MyAccount.errors(), actual);

	}

	@Test(description = "to test the functionality of the with email as intact and pass empty")
	public void test7() {

		MyAccount.MyAccountbutton();
		MyAccount.email("lm@yopmail.com");
		MyAccount.pass("");
		MyAccount.register();
		String actual = "Err: Please enter an account password.";
		Assert.assertEquals(MyAccount.errors(), actual);

	}

	@Test(description = "To test the functionality of the main gate")
	public void test8() {

	}

}