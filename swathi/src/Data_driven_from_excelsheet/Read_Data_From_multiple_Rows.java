package Data_driven_from_excelsheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_Data_From_multiple_Rows {

	public static void main(String[] args) throws Exception {
//file location:-
		FileInputStream file=new FileInputStream("Excel_Sheet/Test Data.xlsx");
		System.out.println("file located");
		//workbook accessed:-
		XSSFWorkbook book=new XSSFWorkbook(file);
		System.out.println("Workbook Accessed");
		
		XSSFSheet sheet=book.getSheet("Sheet2");
		
		XSSFRow row=sheet.getRow(5);
		
		String Application_Url=row.getCell(0).getStringCellValue();
		String Email_EB=row.getCell(1).getStringCellValue();
		String Email=row.getCell(2).getStringCellValue();
		
		String password_EB=row.getCell(3).getStringCellValue();
		String Password=row.getCell(4).getStringCellValue();
		String signinButton=row.getCell(5).getStringCellValue();
		
		System.setProperty("webdriver.chrome.driver","All drives//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("Application_Url");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("Email_EB")).clear();
		driver.findElement(By.xpath("Email_EB")).sendKeys("Email");
		
		driver.findElement(By.xpath("password_EB")).clear();
		driver.findElement(By.xpath("password_EB")).sendKeys("password");
		driver.findElement(By.xpath("signinButton")).click();
		
		
		
	}

}
