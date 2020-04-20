package web_tables;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Records_Using_Recordname {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","All drives/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://money.rediff.com/gainers");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		// click on monthly link
		WebElement Monthly_link=driver.findElement(By.linkText("Monthly"));
		Monthly_link.click();
		
		// Identify table under monthly link
		WebElement Table= driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table"));
		// identify list of rows available under table
		List<WebElement>Rows=Table.findElements(By.tagName("tr"));
System.out.println("list of rows available under table=>"+Rows.size());


boolean flag=false;
for (int i = 0; i < Rows.size(); i++) {
	

//get selected row value
  WebElement selected_value =Rows.get(i);
            
   //get row text
   String Row_text= selected_value.getText();
   
   if (Row_text.contains("Fredun Pharma")) 
   {flag=true;
            
   // identify list of cells available under selected row
     List<WebElement>cells=selected_value.findElements(By.tagName("td"));
    // get cells value
     String sharename= cells.get(0).getText();
     String prev_close=cells.get(2).getText();
     System.out.println(sharename+"  "+prev_close);
   }
}
        
      System.out.println("Record available status is=>" +flag);	
      }

	}

