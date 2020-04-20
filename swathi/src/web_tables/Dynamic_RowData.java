package web_tables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_RowData {

	public static void main(String[] args) 
	
	{
		
		/*
		 * web-table_ using specific Row_data
		 */
		System.setProperty("webdriver.chrome.driver","All drives/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//click on weekly_link
	WebElement weekly_link=	driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/div[2]/div[2]/a"));
	 weekly_link.click();
	 WebElement Table= driver.findElement(By.id("leftcontainer"));
	 //identify list of rows available under table
	  List<WebElement> rows=Table.findElements(By.tagName("tr"));
	  System.out.println("list of rows available under table=>" +rows.size());
	  
	   /*
	    * 
	    
	   
	 // get specific row
	 WebElement selected_row= rows.get(1000);
	 
	 // identify list of cells under specific row
	List<WebElement> cells= selected_row.findElements(By.tagName("td"));
	// get cells data
	String sharename=cells.get(0).getText();
	String current_price=cells.get(3).getText();
	System.out.println(sharename+"  "+current_price);
	*
	*/
	
	
	
	/*
	 * Web-Table-Using Dynamic_Row_Data
	 */
	for (int i = 1; i < rows.size(); i++)
	{
		// get dynamic row
		 WebElement selected_row1= rows.get(i);
		 
		 // identify list of cells under specific row
		List<WebElement> cells1=selected_row1.findElements(By.tagName("td"));
		// get cells data
		String sharename1=cells1.get(0).getText();
		String current_price1=cells1.get(3).getText();
		System.out.println(sharename1+"  "+current_price1);
		driver.close();
	}
	}

}
