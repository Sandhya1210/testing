package web_tables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click_InsideCell_Using_Referral_RecordName 
{

	public static void main(String[] args) 
	{
    System.setProperty("webdriver.chrome.driver","All drives/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.manage().window().maximize();
// click on markets link
WebElement markets_link=driver.findElement(By.id("liMarket"));
markets_link.click();

// identify table under markets link
WebElement table=driver.findElement(By.id("dvToplooser"));

// identify list of rows under table
List<WebElement> Rows =table.findElements(By.tagName("tr"));
System.out.println("list of rows available under table=>"+Rows.size());
boolean flag=false;
for (int i = 1; i < Rows.size(); i++)
{
	
	//get selected rows value
WebElement selected_rows=Rows.get(3);

//capture row text
 String Row_text=selected_rows.getText();
 
 
 if(Row_text.contains("INDBA"));
 { flag=true;
 System.out.println("Record available at row is => "+i);
 // identify list of cells available under selected rows
 List<WebElement> cells=selected_rows.findElements(By.tagName("td"));
 
 // get eighth cell value
 cells.get(8).findElement(By.tagName("a")).click();
 break;// after clicking
 
 }
 
}
System.out.println("Record available status is => "+flag);
 
 // target new table under eighth cell
 WebElement New_Table=driver.findElement(By.id("Table4"));
 
 
 String Qtly_Results= New_Table.getText();
	System.out.println("Qtly_Results");

   
	}
  
  
  
 
 
 
 
 }
	

 
 
 
 
 





	


