package seleniumtasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Pagination {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://datatables.net/examples/data_sources/server_side");
        Thread.sleep(2000);
        WebElement lastrow=driver.findElement(By.xpath("//button[@class='dt-paging-button last']"));
        lastrow.click();
        Thread.sleep(2000);
        WebElement text=driver.findElement(By.xpath("//button[@aria-current='page']"));
        System.out.println(text.getText());
        int p=Integer.parseInt(text.getText());
        driver.findElement(By.xpath("//button[@class='dt-paging-button first']")).click();
        Thread.sleep(2000);
        for(int i=1;i<=p;i++){

            List<WebElement> row=driver.findElements(By.xpath("//table[@id='example']/tbody/tr/td[1]"));
            for(int j=0;j<=row.size()-1;j++){
                System.out.println(row.get(j).getText());
                Thread.sleep(1000);
            }

            if(i<p){
                driver.findElement(By.xpath("//button[@class='dt-paging-button next']")).click();
                Thread.sleep(2000);
            }





        }





    }
}
