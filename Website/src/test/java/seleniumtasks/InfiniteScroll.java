package seleniumtasks;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InfiniteScroll {

    /*
    infinite scroll code for selenium
     */

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://infinite-scroll.com/demo/full-page/");
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
       long re=(Long) js.executeScript("return document.body.scrollHeight");
         System.out.println(re);
         while(true){
             js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
             Thread.sleep(2000);
             long newheight=(Long) js.executeScript("return document.body.scrollHeight");
             System.out.println(newheight);
             System.out.println(newheight);
             if(re==newheight){
                 break;
             }
             re=newheight;
         }






    }
}
