package TestCases;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.BasketPages;
import Pages.BillingDetailsPage;
import Pages.ProductDescription;
import Pages.ShopPages;
import Listners.BaseTest;
import Utillities.ExelUtilities;
import Utillities.ResusableMethods;

public class OrderingScenario extends BaseTest {

	public ProductDescription Product;
	public ShopPages Pages;
	public ProductDescription Discp;
	public ResusableMethods methods;
	public BasketPages Basket;
	public BillingDetailsPage details;
	public int totalprice;
	public ExelUtilities readexcel;

	public OrderingScenario() throws IOException {

		Product = new ProductDescription(BaseTest.getdriver());
		Pages = new ShopPages(BaseTest.getdriver());
		Discp = new ProductDescription(BaseTest.getdriver());
		Basket = new BasketPages(BaseTest.getdriver());
		methods = new ResusableMethods();
		details = new BillingDetailsPage(BaseTest.getdriver());
		totalprice = 0;
		readexcel = new ExelUtilities();

	}

	@Test(description = "To calculate the 3 items of tota in the car table")
	public void test1() throws InterruptedException {

		/*
		 * lets take 3 items and take the total of it it is an 3 items it will then
		 * redirect to the next page this is the function of the cart
		 * 
		 */

		Pages.shopbutton.click();

		for (int i = 0; i <= 2; i++) {
			methods.waits(Pages.addtobasket.get(i));
			Pages.addtobasket.get(i).click();
			Thread.sleep(2000);

		}

		String cartitems = Pages.priceincart.getText();
		System.out.println(cartitems);
		Pages.cartbutton.click();

	}

	@Test(dependsOnMethods = "test1", description = "To calculate the price redirection and everything for the cost here")
	public void calculateprice() {

		List<WebElement> prices = Basket.prices;
		for (int i = 0; i <= prices.size() - 1; i++) {
			int get_dot = prices.get(i).getText().indexOf(".");

			String price = prices.get(i).getText().substring(1, get_dot);
			int pro = Integer.parseInt(price);
			totalprice = totalprice + pro;

		}

		String totalgain = Basket.totalprice.getText();
		int tp = Basket.totalprice.getText().indexOf(".");
		System.out.println(totalgain);
		Assert.assertEquals(Integer.toString(totalprice), totalgain.substring(1, tp));

	}

	@Test(description = "prices should be correct when we update the product price form the input", dependsOnMethods = "test1")
	public void test4() {

		List<WebElement> io = Basket.inputmorequantity;

		for (int i = 0; i <= io.size() - 1; i++) {

			io.get(i).clear();
			io.get(i).sendKeys("2");

		}

		Basket.updatecart.click();

	}

	@Test(description = "To test the functionality for the folowing fields with excel", dependsOnMethods = "test1", dataProvider = "testdatabilling")
	public void test5(String flag, String firstname, String lastname, String comp_name, String email, String mobole,
			String address, String City, String pincode) {
		try {

			/*
			 * Basket.checkout.click(); methods.waits(details.firstname);
			 * details.firstname.sendKeys("John"); details.lastname.sendKeys("Joshua");
			 * details.billing_company.sendKeys("Blue dart");
			 * details.billing_address.sendKeys("1rivet");
			 * details.phonenumbers.sendKeys("987636121");
			 * details.postcode.sendKeys("12345"); details.city.sendKeys("Sandeshkhali");
			 * details.email.sendKeys("ujjwal@yopmail.com"); details.cashofdelivery.click();
			 * details.place_order.click();
			 * 
			 */

			for (int i = 0; i <= 6; i++) {

				if (flag.equals("T")) {
					Basket.checkout.click();
					methods.waits(details.firstname);
					details.submitform(firstname, lastname, comp_name, email, mobole, address, City, pincode);
					details.placeorder();
					Thread.sleep(3000);
					String result = "Pass";
					readexcel.setCellData(result, i, i, result, null)

				}

				else {

					test1();
					Basket.checkout.click();
					methods.waits(details.firstname);
					details.submitform(firstname, lastname, comp_name, email, mobole, address, City, pincode);
					details.placeorder();
					methods.waits(details.firstname);
					Thread.sleep(2000);
					Assert.assertTrue(details.error.isDisplayed());

				}

			}

		}

		catch (Exception e) {

			e.printStackTrace();

		}

	}

	@Test(description = "to see whether the quantity is same in the checkout page", dependsOnMethods = "test4")
	public void test6() throws IOException {
		try {
			Thread.sleep(4000);
			methods.scroll(0, 1000);
			Basket.checkout.click();
			BaseTest.getdriver().navigate().back();
			List<WebElement> l = Basket.inputmorequantity;
			List<WebElement> iu = details.productsquantity;
			for (int i = 0; i <= l.size() - 1; i++) {

				String price = l.get(i).getAttribute("value");
				BaseTest.getdriver().navigate().forward();
				String price2 = iu.get(i).getText();
				BaseTest.getdriver().navigate().back();
				Assert.assertEquals(price, price2);

			}

		}

		catch (Exception e) {

		}

	}

	@DataProvider
	public Object[][] testdatabilling() throws IOException {

		File excel = new File(
				"C:\\Users\\UjjwalShrivastava\\git\\PracticeJavaAutomation\\Website\\src\\test\\java\\TestData\\datadrivenbilling.xlsx");
		int rows = readexcel.getrowno(excel) + 1;
		System.out.println(rows);
		int cols = readexcel.getcolno(excel);
		System.out.println(cols);
		Object[][] data = new Object[rows][cols];
		for (int i = 0; i <= rows - 1; i++) {
			for (int j = 0; j < cols; j++) {
				String value = readexcel.readExcelFile(excel, i, j);
				System.out.println(value);
				data[i][j] = value;
			}
		}
		return data;

	}

}
