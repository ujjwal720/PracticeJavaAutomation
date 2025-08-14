package seleniumtasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTasks {

    /*
    Automate new tab in selenium
     */

    public static void main(String[] args) throws InterruptedException {

        /*
        Makemytripautomation
         */

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com/");
        Thread.sleep(2000);
        WebElement  close=driver.findElement(By.xpath("//span[@data-cy='closeModal']"));
        Thread.sleep(2000);
        close.click();
        WebElement label=driver.findElement(By.xpath("//label[@for='fromCity']"));
        Thread.sleep(2000);
        label.click();
        WebElement source=driver.findElement(By.xpath("//input[@placeholder='From']"));
        Thread.sleep(2000);
        source.sendKeys("PUNE");
        



//





    }
}
