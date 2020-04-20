package web_tables;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_WebTable_Data_From_SpecificRow_And_Specific_Cel {

	public static void main(String[] args) {
		/*
		 * FAQ:--> Read WebTable date from specific row  and specific cell, When
		 * 			table data is constant..
		 */
		
		System.setProperty("webdriver.chrome.driver","All drives\\chromedriver.exe");
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
		

		//Select Row
		WebElement selected_Row=rows.get(9);
		 
		//Get list of cells under selected row [<td> represent table cells]
		List<WebElement> cells=selected_Row.findElements(By.tagName("td"));

		//Get cell data
		String ShareName=cells.get(0).getText();
		String Share_High_Price=cells.get(3).getText();
		
		System.out.println(ShareName+"   "+Share_High_Price);
		
		
		
		
	}

	}


