package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class second {

    public static void main(String[] args) {


        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
        driver.findElement(By.xpath("//button[@id='but1']")).click();
        driver.findElement(By.xpath("//input[@id='tb2']")).click();
        driver.findElement(By.xpath("//input[@id='tb2']")).sendKeys("Mam");
        driver.quit();
    }
}
