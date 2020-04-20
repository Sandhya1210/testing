package Data_driven_from_excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data_from_row_and_cell {

	public static void main(String[] args) throws Exception 
	{
		FileInputStream File=new FileInputStream("Excel_Sheet\\Test Data.xlsx");
		System.out.println("file located");
		
		XSSFWorkbook book=new XSSFWorkbook(File);
		System.out.println("Workbook Accessed");
		
		//Target sheet using above book reference
		XSSFSheet sht=book.getSheet("Sheet1");
		
		//Target first row,cell under sheet
		 String Mobile_Number_string_format=sht.getRow(1).getCell(2).getStringCellValue();
System.out.println("Mobile_string_format is=>"+Mobile_Number_string_format);
		 


		
		
		

	}

}
