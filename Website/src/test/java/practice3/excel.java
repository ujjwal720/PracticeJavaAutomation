package practice3;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class excel {

    public static void main(String[] args) throws Exception {

       File a=new File("C:\\Users\\UjjwalShrivastava\\OneDrive - 1Rivet US, Inc\\Desktop\\testdata1.xlsx");
        FileInputStream g=new FileInputStream(a);
        XSSFWorkbook l=new XSSFWorkbook(g);
       XSSFSheet fg= l.getSheetAt(0);
      int op= fg.getLastRowNum();
      XSSFRow po= fg.getRow(0);
    int z=  po.getLastCellNum();

    for(int i=0;i<=fg.getLastRowNum();i++){
        XSSFRow poz= fg.getRow(i);
        Iterator<Cell> io=poz.iterator();
        while (io.hasNext()){

            Cell cell = io.next();
            System.out.println(cell.toString());

        }



    }







    }
}
