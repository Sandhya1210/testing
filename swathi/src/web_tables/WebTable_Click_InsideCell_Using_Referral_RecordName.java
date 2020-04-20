package web_tables;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_Click_InsideCell_Using_Referral_RecordName {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","All drives/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
		driver.manage().window().maximize();
		
		
		
		WebElement Markets_link=driver.findElement(By.xpath("//a[@href='https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx'][contains(.,'markets')]"));
		Markets_link.click();
	
		//Identify Web-table
		WebElement Table=driver.findElement(By.xpath("//div[@id='pnl_Bse']/table"));
		
		
		//Find list of rows available under table  [<tr> tag represent Table rows]
		List<WebElement> rows=Table.findElements(By.tagName("tr"));
		System.out.println("Rows available under table is => "+rows.size());
		
		boolean flag=false;
		//Iterate for number of rows
		for (int i = 1; i < rows.size(); i++) 
		{

			//Select Row
			WebElement selected_Row=rows.get(i);
			
			//Capture Row text
			String Row_Text=selected_Row.getText();
			
			
			if(Row_Text.contains("ICIBAN"))
			{
				flag=true;
				System.out.println("Record available at row is => "+i);
				//Get list of cells under selected row [<td> represent table cells]
				List<WebElement> cells=selected_Row.findElements(By.tagName("td"));
				
				//Get seventh cell record
				cells.get(7).findElement(By.tagName("a")).click();
				break; //break iteration after clicking link inside table
				
			}
		
		}
		System.out.println("Record available status is => "+flag);
		
		Thread.sleep(5000);
		//Target News table
		if(flag==true)
		{
			//Target news table and read records
			WebElement News_Table=driver.findElement(By.id("tinydata"));
			String Comapany_News=News_Table.getText();
			System.out.println(Comapany_News);

	}
	}
}
