package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillingDetailsPage {

	public WebDriver driver;

	public BillingDetailsPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@name='billing_first_name']")
	public WebElement firstname;

	@FindBy(xpath = "//input[@name='billing_last_name']")
	public WebElement lastname;

	@FindBy(xpath = "//input[@name='billing_company']")
	public WebElement billing_company;

	@FindBy(xpath = "//input[@name='billing_email']")
	public WebElement email;

	@FindBy(xpath = "//input[@name='billing_phone']")
	public WebElement phonenumbers;

	@FindBy(xpath = "//input[@name='billing_address_1']")
	public WebElement billing_address;

	@FindBy(xpath = "//input[@name='billing_city']")
	public WebElement city;

	@FindBy(xpath = "//input[@name='billing_state']")
	public WebElement state;

	@FindBy(xpath = "//input[@name='billing_postcode']")
	public WebElement postcode;

	@FindBy(xpath = "(//ul[@class='wc_payment_methods payment_methods methods']/li/input)[3]")
	public WebElement cashofdelivery;

	@FindBy(xpath = "//strong[@class='product-quantity']")
	public List<WebElement> productsquantity;

	@FindBy(xpath = "//input[@id='place_order']")
	public WebElement place_order;
	
	@FindBy(xpath="//ul[@class='woocommerce-error']")
	public WebElement error;

	public void submitform(String firstname, String lastname, String company,String email, String phonenumber, String address,
			String city, String postcode) {

		this.firstname.sendKeys(firstname);
		this.lastname.sendKeys(lastname);
		this.billing_company.sendKeys(company);
		this.email.sendKeys(email);
		this.phonenumbers.sendKeys(phonenumber);
		this.billing_address.sendKeys(address);
		this.city.sendKeys(city);
		this.postcode.sendKeys(postcode);

	}

	public void placeorder() {
		
		place_order.click();

	}

}
