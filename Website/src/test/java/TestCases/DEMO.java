package TestCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DEMO {

	
	@Test(dataProvider="dataprovider")
	public void test1(String i,String j) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys(i);
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys(j);
		

	}
	
	
	@DataProvider
	public Object[][] dataprovider() {
		
		Object[][] data= {{"rahul","sharma"},{"paras","shrma"}};
		
		return data;
		
	}

}
