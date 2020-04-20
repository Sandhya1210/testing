package Data_driven_from_excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Workbook_And_Sheet {

	public static void main(String[] args) throws Exception {
		/*
		 * Note:--> 
		 * 		Excel files are binary files, These files to target in java programming
		 * 		we follow <<fileinputstream>> class
		 */
		
		
		//Target file location
		FileInputStream file=new FileInputStream("Excel_Sheet\\Test Data.xlsx");
		System.out.println("file located");
		
		//Get access of Excel workbook using above file location.
		XSSFWorkbook book=new XSSFWorkbook(file);
		System.out.println("Workbook Accessed");
		
		
		//Target sheet using sheetname
		XSSFSheet sht=book.getSheet("Sheet1");
		
		//Target sheet using sheetindex value
		XSSFSheet sht1=book.getSheetAt(1);    //Sheet index numbers starts from zero.
		


	}

}
