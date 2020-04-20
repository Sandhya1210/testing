package Data_driven_from_excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data_From_Excel {

	public static void main(String[] args) throws Exception {
		//Target file location
		FileInputStream file=new FileInputStream("Excel_Sheet\\Test Data.xlsx");
		System.out.println("file located");
		
		//Get access of Excel workbook using above file location.
		XSSFWorkbook book=new XSSFWorkbook(file);
		System.out.println("Workbook Accessed");
		
		//Target sheet using above book reference
		XSSFSheet sht=book.getSheet("Sheet1");
		
		//Target first row under sheet
		XSSFRow row=sht.getRow(1);
		
		//Using row reference target cell
		XSSFCell cell=row.getCell(0);
		
		
		
		//Read Data from Cell..
		String url=cell.getStringCellValue();
		System.out.println(url);
		

		/*
		 * 
		 * getStringCellValue:-->
		 * 			Method read characters from cell 
		 * getNumericCellValue:-->
		 * 			Method read number from cell and return in double format
		 * getDateCellValue:-->
		 * 			Method read data value from cell and return in Date format
		 * getBooleanvalue:-->
		 * 			Method read boolean value true/false from cell. 
		 */
		
		
		
		//Read customer id from [First-Row] AND  [First-Cell]
		String CustomerID=sht.getRow(1).getCell(1).getStringCellValue();
		System.out.println(CustomerID);
		
        
	}

}
