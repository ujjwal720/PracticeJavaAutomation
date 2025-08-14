package ReadExcel;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadData {

    public static void main(String[] args) throws IOException {

        /*
        File
        Workbook
        row
        Column
        */

        File a;
        FileInputStream st;
        XSSFWorkbook workbook;

        a=new File("C:\\PracticeJavaAutomation\\Website\\src\\test\\java\\ReadExcel\\testdata1.xlsx");
        st=new FileInputStream(a);
        workbook=new XSSFWorkbook(st);
        XSSFSheet sheet = workbook.getSheetAt(0);
        int rows=sheet.getLastRowNum();
        System.out.println(rows);
        int cols=sheet.getRow(1).getLastCellNum();
        System.out.println(cols);
        /*
        Dynamic Table we have seen
         */

        for(int i=0;i<=rows;i++){

            XSSFRow rows1=sheet.getRow(i);

            for(int j=0;j<=cols-1;j++){

                switch (rows1.getCell(j).getCellType()){

                    case STRING:
                        System.out.println(rows1.getCell(j).toString());
                        break;

                    case NUMERIC:
                        System.out.println(rows1.getCell(j).getNumericCellValue());
                        break;
                }



            }
        }










    }
}
