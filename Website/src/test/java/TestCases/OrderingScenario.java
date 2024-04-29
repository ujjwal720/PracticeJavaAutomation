package TestCases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.BasketPages;
import Pages.BillingDetailsPage;
import Pages.ProductDescription;
import Pages.ShopPages;
import Utillities.BaseTest;
import Utillities.ResusableMethods;

public class OrderingScenario extends BaseTest {

	public ProductDescription Product;
	public ShopPages Pages;
	public ProductDescription Discp;
	public ResusableMethods methods;
	public BasketPages Basket;
	public BillingDetailsPage details;
	int totalprice;

	public OrderingScenario() throws IOException {

		Product = new ProductDescription(BaseTest.getdriver());
		Pages = new ShopPages(BaseTest.getdriver());
		Discp = new ProductDescription(BaseTest.getdriver());
		Basket = new BasketPages(BaseTest.getdriver());
		methods = new ResusableMethods();
		details = new BillingDetailsPage(BaseTest.getdriver());
		totalprice = 0;

	}

	@Test(description = "To calculate the 3 items of tota in the car table")
	public void test1() throws InterruptedException {

		/*
		 * lets take 3 items and take the total of it it is an 3 items
		 * 
		 */

		Pages.shopbutton.click();

		for (int i = 0; i <= 2; i++) {
			methods.waits(Pages.addtobasket.get(i));
			Pages.addtobasket.get(i).click();
			Thread.sleep(2000);

		}

		String cartprices = Pages.priceincart.getText();
		Thread.sleep(4000);
		methods.waits(Pages.priceincart);
		System.out.println(cartprices);
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

	@Test(description = "To test the functionality for the folowing", dependsOnMethods = "test1")
	public void test5() {
		try {
			Basket.checkout.click();
			// Basket.checkout.click();
			methods.waits(details.firstname);
			details.firstname.sendKeys("John");
			details.lastname.sendKeys("Joshua");
			details.billing_company.sendKeys("Blue dart");
			details.billing_address.sendKeys("1rivet");
			details.phonenumbers.sendKeys("987636121");
			details.postcode.sendKeys("12345");
			// details.state.sendKeys("Kolkata");
			details.city.sendKeys("Sandeshkhali");
			details.email.sendKeys("ujjwal@yopmail.com");
			details.cashofdelivery.click();

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

}
