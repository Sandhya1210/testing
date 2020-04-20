package web_tables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Specific_row_specific_cell {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","All drives/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        // identify markets
    WebElement markets=driver.findElement(By.xpath("//a[@href='https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx'][contains(.,'markets')]"));
	markets.click();
	 //identify table under market
WebElement Table=driver.findElement(By.id("pnl_Bse"));

// Identify list of rows available under table
List<WebElement> rows= Table.findElements(By.tagName("tr"));  // {'tr'- represents rows}
System.out.println("rows available under table is->"+rows.size());

 //select/get specific row
  WebElement selected_row=rows.get(12);
  
  // identify list of cell under selected row
  List<WebElement> cells= selected_row.findElements(By.tagName("td"));
  
  // get cells data
 String sharename= cells.get(0).getText();
String share_prev_close =cells.get(6).getText();

System.out.println(sharename+"  "+share_prev_close);
  
}
	}

