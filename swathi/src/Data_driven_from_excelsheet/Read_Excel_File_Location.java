package Data_driven_from_excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Read_Excel_File_Location {

	public static void main(String[] args) throws Exception {
		
		/*
		 * Note:--> 
		 * 		Excel files are binary files, These files to target in java programming
		 * 		we follow <<fileinputstream>> class
		 */
		
		
		//Target file location
		FileInputStream file=new FileInputStream("Excel_Sheet\\Test Data.xlsx");
		System.out.println("file located");

	}

}
