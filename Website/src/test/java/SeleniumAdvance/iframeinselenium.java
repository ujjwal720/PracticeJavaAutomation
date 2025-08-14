package SeleniumAdvance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframeinselenium {

    public static void main(String[] args) {


        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://support.orangehrm.com/portal/en/signin");
        WebElement io=driver.findElement(By.xpath("//iframe[@id='iamFrame']"));
        driver.switchTo().frame(io);
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("ujjwal");
        driver.switchTo().defaultContent();
    }
}
