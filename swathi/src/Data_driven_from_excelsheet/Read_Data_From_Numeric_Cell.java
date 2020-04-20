package Data_driven_from_excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data_From_Numeric_Cell {

	public static void main(String[] args) throws Exception {

		//Target file location
				FileInputStream file=new FileInputStream("Excel_Sheet\\Test Data.xlsx");
				System.out.println("file located");
				
				//Access workbook using above file location
				XSSFWorkbook book=new XSSFWorkbook(file);
				System.out.println("Workbook accessed");
					
				//Target sheet
				XSSFSheet sht=book.getSheetAt(0);
				
				
				//Taret Numeric Cell
				XSSFCell Numeric_Cell=sht.getRow(1).getCell(2);
				/*
				//Read Data from Numeric Cell
				Double Snum=Numeric_Cell.getNumericCellValue();
				System.out.println("Snum in double format is => "+Snum);   //123456.0
				
				//Convert double format value into number
				int Snum_int_Frmt=Snum.intValue();
				System.out.println("Snum in integer format is => "+Snum_int_Frmt);
				*/
				
				//Reading mobile number from excel
				Double Mobile_in_Double_Frmt=sht.getRow(1).getCell(2).getNumericCellValue();
				System.out.println("Mobile number in double format is => "+Mobile_in_Double_Frmt);
				
				//Convert Mobile number from double format to interger format
				long Mobile_integer_Format=Mobile_in_Double_Frmt.longValue();
				System.out.println("Mobile number integer format is => "+Mobile_integer_Format);
				
				//Convert Mobile number from double format to String format..
				String Mobile_String_Format=NumberToTextConverter.toText(Mobile_in_Double_Frmt);
				System.out.println("Mobile number in string format is => "+Mobile_String_Format);
				
				
				
				/*
				 * Note:-->   In Numericell by adding single code we can convert cell into string format.
				 * 
				 * 				 100  => Numbers
				 * 				'100 => characters
				 */
				
				
				//Read Alternate mobile number from string cell
				String New_mobile_num=sht.getRow(1).getCell(4).getStringCellValue();
				System.out.println(New_mobile_num);
				
			
				//Read data from Boolean cell
				boolean flag=sht.getRow(1).getCell(5).getBooleanCellValue();
				System.out.println("Status is => "+flag);
				
	}

}
