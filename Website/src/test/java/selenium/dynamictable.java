package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class dynamictable {

    public static void main(String[] args) {


        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/web-table-element.php");
        /*
        first get the number of rows and column
         */

        List<WebElement> rows=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
        List<WebElement> cols=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td"));

        System.out.println(rows);
        System.out.println(cols);







    }
}
