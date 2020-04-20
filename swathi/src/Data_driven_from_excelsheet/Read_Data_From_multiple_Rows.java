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
		
		XSSFSheet sheet=book.getSheet("Sheet3");
		
		XSSFRow row=sheet.getRow(1);
		
		String Application_Url=row.getCell(0).getStringCellValue();
		System.out.println("application url is==>"+Application_Url);
		String Email_EB_Locator=row.getCell(1).getStringCellValue();
		System.out.println("Email_EB is==>"+Email_EB_Locator);
		String Email_Input=row.getCell(2).getStringCellValue();
		System.out.println("Email_Input is==>"+Email_Input);
		String Password_Locator=row.getCell(3).getStringCellValue();
		System.out.println("Password_Locator is==>"+Password_Locator);
		String Password_Input=row.getCell(4).getStringCellValue();
		System.out.println("Password_Input is==>"+Password_Input);
		String login_locator=row.getCell(5).getStringCellValue();
		System.out.println("login_locator is==>"+login_locator);

		
		System.setProperty("webdriver.chrome.driver","All drives//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		Thread.sleep(2000);
		driver.get(Application_Url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Email_EB_Locator)).clear();
		driver.findElement(By.xpath(Email_EB_Locator)).sendKeys(Email_Input);
		
		driver.findElement(By.xpath(Password_Locator)).clear();
		driver.findElement(By.xpath(Password_Locator)).sendKeys(Password_Input);
		driver.findElement(By.xpath(login_locator)).click();
		
		
		
	}

}
