package practice3;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class fffgg {

    public static void main(String[] args) throws IOException {


        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("hello");
        TakesScreenshot d=(TakesScreenshot)driver;
        File n=d.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(n,new File("C:\\PracticeJavaAutomation\\Website\\src\\test\\us.png"));


    }
}
