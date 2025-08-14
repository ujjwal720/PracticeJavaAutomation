package SeleniumAdvance;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class screenshotselenium {

    public static void main(String[] args) throws IOException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        TakesScreenshot d=(TakesScreenshot) driver;
        File m=d.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(m,new File("C:\\PracticeJavaAutomation\\Website\\src\\test\\java\\SeleniumAdvance\\SC.png"));
    }
}
