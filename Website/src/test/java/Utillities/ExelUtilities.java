
package Utillities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class ExelUtilities {

	public XSSFWorkbook workbook;
	public XSSFSheet sheet;
	public File files;
	public FileInputStream is;

	public String readExcelFile(File filename, int i, int j) throws IOException {
		try {
			is = new FileInputStream(filename);
			workbook = new XSSFWorkbook(is);

			sheet = workbook.getSheetAt(0);
			XSSFRow row = sheet.getRow(i);
		
			if (row != null) {
				Cell cell = row.getCell(j);
				if (cell != null) {
					switch (cell.getCellType()) {
					case NUMERIC:
						return new DecimalFormat("0").format(cell.getNumericCellValue());
					case BLANK:
						return "";
					default:
						return cell.getStringCellValue();
					}
				}
			}
		} finally {
			if (workbook != null) {
				workbook.close();
			}
			if (is != null) {
				is.close();
			}
		}
		return ""; // Return empty string if cell or row is null
	}

	public int getrowno(File filename) throws IOException {

		File a = filename;
		FileInputStream b = new FileInputStream(a);
		XSSFWorkbook c = new XSSFWorkbook(b);
		XSSFSheet d = c.getSheetAt(0);
		int rows = d.getLastRowNum();
		c.close();
		return rows;

	}

	public int getcolno(File filename) throws IOException {

		File a = filename;
		FileInputStream b = new FileInputStream(a);
		XSSFWorkbook c = new XSSFWorkbook(b);
		XSSFSheet d = c.getSheetAt(0);
		int col = d.getRow(0).getLastCellNum();
		c.close();
		return col;

	}

	public void setCellData(String result, int i, int colNumb, File name) throws Exception {
		try {
			is = new FileInputStream(name);
			workbook = new XSSFWorkbook(is);

			sheet = workbook.getSheetAt(0);
			XSSFRow row = sheet.getRow(i);
			XSSFCell cell = row.getCell(colNumb);

			if (cell == null) {
				cell = row.createCell(colNumb);
				cell.setCellValue(result);
			} else {
				cell.setCellValue(result);
			}

			FileOutputStream fileOut = new FileOutputStream(name);
			workbook.write(fileOut);
			fileOut.flush();
			fileOut.close();

		} catch (Exception exp) {
			// Log.error("Exception occured in setCellData: "+exp.getMessage());
			throw (exp);
		}
	}
/*
 * this utility class belongs to read the csv files form the excel
 * 
 * and also pass it as the dataprovider the following is babsically reading the data form the excel
 */




	public Object[][] readcsvutility(File file) {
		
		List<String[]> data = new ArrayList<>();
		try (CSVReader csvReader = new CSVReader(new FileReader(file))) {
			String[] points;
			data = csvReader.readAll();
			
			
		} catch (IOException | CsvException e) {
			e.printStackTrace();
		}

		// Convert List<String[]> to Object[][]
		Object[][] dataArray = new Object[data.size()][];
		for (int i = 0; i < data.size(); i++) {
			dataArray[i] = data.get(i);
		}
		return dataArray;
		
		
		
		

	}

}
