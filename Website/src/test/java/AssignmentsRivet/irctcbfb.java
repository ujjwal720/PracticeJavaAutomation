package AssignmentsRivet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class irctcbfb {


    public WebDriver driver;

    @Test
    public void test1() throws InterruptedException {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/ref=nav_logo");
        WebElement links=driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_6']"));
        String chords= Keys.chord(Keys.CONTROL,Keys.RETURN);
        links.sendKeys(chords);
         Set<String> io=driver.getWindowHandles();
        Iterator<String> lo= io.iterator();
        while(lo.hasNext()){
            String k=lo.next();
            driver.switchTo().window(k);
            String winname=driver.getTitle();
            Thread.sleep(2000);
            System.out.println("The window for the following is"+" "+winname);
        }



    }
}
