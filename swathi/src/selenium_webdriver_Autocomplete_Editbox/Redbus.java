package selenium_webdriver_Autocomplete_Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {

	public static void main(String[] args) throws InterruptedException 
	{
		
	//Autocomplete_Editbox  means when we enter shortcuts like any 'NAME'.."HYD" it will send to master and responds with suggestions.
		
		System.setProperty("webdriver.chrome.driver","All drives\\chromedriver.exe");
		WebDriver u=new ChromeDriver();
		u.get("https://www.redbus.in");
		u.manage().window().maximize();
		Thread.sleep(2000);

		u.findElement(By.xpath("//*[@id='src']")).sendKeys("Hyderabad (All Locations)");
		u.findElement(By.xpath("//*[@id='dest']")).sendKeys("Indore (All Locations");
		Thread.sleep(2000);
		u.findElement(By.xpath("/html/body/section/div[2]/main/section/div/div[2]/section/div/div[3]/span")).click();

		u.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[7]/td[4]")).click();

		u.findElement(By.xpath("//*[@id='search']/div/div[4]/div/label")).click();
		u.findElement(By.xpath("//*[@id='rb-calendar_return_cal']/table/tbody/tr[1]/td[3]/button")).click();
		u.findElement(By.xpath("//*[@id='rb-calendar_return_cal']/table/tbody/tr[5]/td[3]")).click();
		u.findElement(By.cssSelector("button[id='search_btn']")).click();


	}

}
