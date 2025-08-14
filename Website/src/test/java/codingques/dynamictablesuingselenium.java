package codingques;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class dynamictablesuingselenium {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/web-table-element.php");
        List<WebElement> rows=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
        List<WebElement> cols=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td"));
        int row=rows.size();
        int column=cols.size();
        System.out.println(row);
        System.out.println(column);
        String expectedprice="928.1";
        String company="REC";
        int count=0;
        int flag=0;


        for(int i=0;i<=rows.size()-1;i++){

            count++;
            //List<WebElement> data=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[" + count + "]/td"));
            List<WebElement> data=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr["+count+"]/td"));
            String company1=rows.get(i).getText();
            if (company1.equals(company)) {

                for (int j = 0; j <= cols.size() - 1; j++) {
                   flag=1;
                    System.out.println(data.get(j).getText());
                    Thread.sleep(1000);
                }

                if(flag==1){

                    break;
                }

            }
            }

        driver.quit();


        }




    }

