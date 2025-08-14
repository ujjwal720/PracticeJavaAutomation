package Dynamic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class dynamicwebtable {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demo.guru99.com/test/web-table-element.php");

        List<WebElement> rows=driver.findElements(By.xpath("(//table[@class='dataTable']/tbody/tr)/td[1]"));//no of rows
        List<WebElement> cols=driver.findElements(By.xpath("(//table[@class='dataTable']/tbody/tr)[1]/td"));//no of colums
        int rows1=rows.size();
        int colum=cols.size();


        for(int i=1;i<=rows1;i++){

            for(int j=1;j<=colum;j++){
                WebElement cell = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+i+"]/td["+j+"]"));
                Thread.sleep(2000);
                String p=cell.getText();
                System.out.println(p);
            }


        }
        driver.quit();












    }
}
