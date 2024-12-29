package AssignmentsRivet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.time.Duration;

public class p {

    public static void main(String[] args) {


        /*
        no such element exception
         */

        /*
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.automationexercise.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement feature = driver.findElement(By.xpath("(//h2[@class='title text-cente'])[1]"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        feature.click();

        */

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.browserstack.com/");
        WebElement livefotter=driver.findElement(By.xpath("//span[text()='Contact Us']"));
        livefotter.click();
        driver.quit();






    }
}
