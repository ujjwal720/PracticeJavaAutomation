package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasketPages {

	public WebDriver driver;

	public BasketPages(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//td[@class='product-subtotal']/span")
	public List<WebElement> prices;

	@FindBy(xpath = "//td[@data-title='Subtotal']/span")
	public WebElement totalprice;
	
	
	@FindBy(xpath="//div[@class='quantity']/input")
	public List<WebElement> quantity;
	
	@FindBy(xpath="//input[@name='apply_coupon']")
	public WebElement applycoupon;
	
	@FindBy(xpath="//input[@type='number']")
	public List<WebElement> inputmorequantity;
	
	@FindBy(xpath="//input[@name='update_cart']")
	public WebElement updatecart;
	
	@FindBy(xpath="//a[@class='checkout-button button alt wc-forward']")
	public WebElement checkout;
	
	

	public String gettotalprice() {
		
		return totalprice.getText();

	}
	
	
	public void applucoupon() {
		
		applycoupon.click();
	}
	
	
	public void ms() {
		
		
	}
	
	
      

}
