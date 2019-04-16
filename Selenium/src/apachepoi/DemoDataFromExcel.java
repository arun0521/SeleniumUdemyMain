package apachepoi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class DemoDataFromExcel {
	
	public static void main(String[] args)  {
		String Path = "\\Users\\Arun\\workspace\\Selenium\\ReadData.xlsx";
		String sheetName ="Sheet1";
		XSSFWorkbook workBook;
		XSSFSheet sheet ;
		XSSFCell cellValue ;
		String name;
		String profession;
		try {
		FileInputStream filePathToLoad = new FileInputStream(Path);
		workBook = new XSSFWorkbook(filePathToLoad);
		sheet = workBook.getSheet(sheetName);
		
		
		cellValue = sheet.getRow(0).getCell(0);
		name = cellValue.getStringCellValue();
		System.out.println("The name is " + name);
		cellValue = sheet.getRow(0).getCell(1);
		profession = cellValue.getStringCellValue();
		System.out.println("The profession is " + profession);
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}

}
