package TestCases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.ProductDescription;
import Pages.ShopPages;
import Utillities.BaseTest;
import Utillities.ResusableMethods;

public class ShoopingTestCases {

	public Pages.ShopPages shopping;
	public ResusableMethods Methods;
	public ProductDescription discp;

	public ShoopingTestCases() throws IOException {

		shopping = new ShopPages(BaseTest.getdriver());
		discp = new ProductDescription(BaseTest.getdriver());
		Methods = new ResusableMethods();

	}

	@Test(description = "To count whther the url which has specifed the coun is correct or not in the scenario")
	public void test1() {

		shopping.redirecttoshop();

		List<WebElement> elemts = shopping.listelement;

		for (int i = 0; i <= elemts.size() - 1; i++) {

			elemts.get(i).click();
			String numberofproducts = shopping.countsofbooks.get(i).getText().substring(1, 2).trim();

			int numberofproducts2 = Integer.parseInt(numberofproducts);
			int number_of_products = shopping.getproductnamessizes();
			System.out.println(number_of_products);
			Assert.assertEquals(numberofproducts2, number_of_products);

		}

	}

	@Test(description = "To test the redirection of functionality of products whether the name is equal or not")
	public void test2() throws IOException {
		shopping.redirecttoshop();
		List<WebElement> elemts = shopping.prices;

		for (int i = 0; i <= elemts.size() - 1; i++) {
			String actual1 = elemts.get(i).getText();
			elemts.get(i).click();
			Methods.waits(discp.productname);
			String actual2 = discp.getname();
			Assert.assertEquals(actual1, actual2);
			BaseTest.getdriver().navigate().back();
			Methods.waits(elemts.get(i));

		}

	}

	@Test(description = "To test the sorting functionality of the webpage and compare the prices form the list")
	public void test3() {
		
		

	}

}
