package oopsconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class seleniumirctc {
    WebDriver driver;
    @Test
    public void irctctest() throws InterruptedException {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.irctc.co.in/nget/train-search");
        String strokes= Keys.chord(Keys.DOWN, Keys.ENTER);
        WebElement from=driver.findElement(By.xpath("(//input[@role='searchbox'])[1]"));
        from.sendKeys("Delhi");
        Thread.sleep(2000);
        from.sendKeys(strokes);
        WebElement to=driver.findElement(By.xpath("(//input[@role='searchbox'])[2]"));
        to.sendKeys("Mumbai");
        to.sendKeys(strokes);
        WebElement date=driver.findElement(By.xpath("//span[@class='ng-tns-c58-10 ui-calendar']/input"));
        date.click();
        date.sendKeys("25/01/2025");
        date.clear();
        date.sendKeys("25/01/2025");
        WebElement dropdown=driver.findElement(By.xpath("//p-dropdown[@id='journeyQuota']"));
        dropdown.click();
        selectheoption("LADIES");

    }

    public void selectheoption(String text){

    WebElement option=driver.findElement(By.xpath("//li[@role='option']/span[text()='"+text+"']"));
    option.click();

    }




}
