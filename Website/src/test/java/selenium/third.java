package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class third {

    public static void main(String[] args) {

/*
it basicaaly first moves to elemnt then do the things that why it is great
it basicaaly first moves to elemnt then do the things that why it is great
 */
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        Actions a=new Actions(driver);
        WebElement fg=driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
        a.moveToElement(fg).click().perform();
        a.moveToElement(fg).sendKeys("hello").perform();
    }
}
