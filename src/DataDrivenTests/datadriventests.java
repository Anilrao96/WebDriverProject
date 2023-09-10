package DataDrivenTests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class datadriventests {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("D:\\selenium\\data1.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		//XSSFSheet sheet = workbook.getSheet("Sheet1");//providing sheet name
		XSSFSheet sheet = workbook.getSheetAt(0);//providing sheet index
		
		int rowcount = sheet.getLastRowNum();//returns the row count
		
		int colcount = sheet.getRow(0).getLastCellNum();//returns column cell count
		
		for(int i =0;i<rowcount;i++) {
		
			XSSFRow currentrow = sheet.getRow(i);//focussed on current row
			for(int j = 0;j<colcount;j++) {
				String value = currentrow.getCell(j).toString();//read the value from a cell
				System.out.print("  "+value);
			}
			System.out.println();
			
		}
		//getStringCellValue 
		//getNumeric CellValue
		//getBooleanCellValues
		
		

	}

}
