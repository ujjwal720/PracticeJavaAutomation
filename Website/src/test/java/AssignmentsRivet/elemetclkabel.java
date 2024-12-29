package AssignmentsRivet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class elemetclkabel {


    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.automationexercise.com/");
        WebElement feature = driver.findElement(By.xpath("(//h2[@class='title text-center'])[1]"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

// Wait for the element to be visible
        wait.until(ExpectedConditions.elementToBeClickable(feature));

        System.out.println("Element is clickable");

    }
}
