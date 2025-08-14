package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class first {

    public static void main(String[] args) {
/*
because we cant interact in the dom as it is disabe so not iteracable
 */

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
        JavascriptExecutor io=(JavascriptExecutor)driver;
        WebElement ui= driver.findElement(By.xpath("//input[@id='hbutton']"));
//        io.executeScript("arguments[0].scrollIntoView();",ui);
        ui.click();

    }
}
