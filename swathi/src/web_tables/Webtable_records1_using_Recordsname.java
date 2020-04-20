package web_tables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_records1_using_Recordsname {

	public static void main(String[] args) {
		/*
		 * FAQ:--> Read WebTable date from dynamic rows..
		 */
		
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
			// capture row_text
		String row_text= selected_Row.getText();
		if (row_text.contains("ONGC")) 
		{flag=true;
			//Get list of cells under selected row [<td> represent table cells]
			List<WebElement> cells=selected_Row.findElements(By.tagName("td"));

			//Get cell data
			String ShareName=cells.get(0).getText();
			String Share_High_Price=cells.get(3).getText();
		System.out.println(ShareName+"   "+Share_High_Price);

	     }
	  }
		System.out.println("Record available status is=>" +flag);
	}
}

