package SeleniumAdvance;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class opennewtab {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement newtab=driver.findElement(By.xpath("//a[@id='opentab']"));
        newtab.click();
         String currentwindow= driver.getWindowHandle();
        Set<String> op=driver.getWindowHandles();
        Iterator<String> pl=op.iterator();
        String firstwin=pl.next();
         while (pl.hasNext()){

            String kl=pl.next();
            driver.switchTo().window(kl);
             System.out.println(driver.getCurrentUrl());


        }

         driver.switchTo().window(firstwin);


    }
}
