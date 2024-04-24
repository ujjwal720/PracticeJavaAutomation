package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopPages {

	public WebDriver driver;

	public ShopPages(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//ul[@id='main-nav']/li[1]/a")
	public WebElement shopbutton;

	@FindBy(xpath = "//a[@class='woocommerce-LoopProduct-link']/h3")
	public List<WebElement> prices;

	@FindBy(xpath = "//span[@class='count']")
	public List<WebElement> countsofbooks;
	
	@FindBy(xpath="//ul[@class='product-categories']/li/a")
	public List<WebElement> listelement;

	@FindBy(xpath = "//a[@class='woocommerce-LoopProduct-link']")
	public List<WebElement> countofproducts;
	
	
	@FindBy(xpath="//a[@class='woocommerce-LoopProduct-link']/h3")
	List<WebElement> productsnames;

	public void redirecttoshop() {

		shopbutton.click();

	}

	public void getprices(String s) {

		for (int i = 0; i <= prices.size() - 1; i++) {

			if (s.equalsIgnoreCase(prices.get(i).getText())) {

				System.out.println("Product is avalable");

			}

		}

	}
	
	

	public int getproductnamessizes() {

		return countofproducts.size();

	}

	
}
