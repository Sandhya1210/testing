package capture_sreenshot_on_location;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Capture_screenshot_on_location_messenger {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","All drives/chromedriver.exe");
		
		//System.setProperty("webdriver.chrome.driver","F:\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		System.out.println("Process Started");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("jyothi");
		driver.findElement(By.cssSelector("#pass")).sendKeys("12345");
		driver.findElement(By.linkText("Messenger")).click();
		Thread.sleep(2000);
		//capture screenshot 
 TakesScreenshot x= (TakesScreenshot)driver;
File source =x.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(source, new File("./Screenshots/facebook1.png"));

//capture screenshot on location(specific element)

	WebElement Location=driver.findElement(By.xpath("//a[contains(.,'Data Policy')]"));
	new Actions(driver).moveToElement(Location).build().perform();
	new Actions(driver).sendKeys(Keys.PAGE_DOWN).perform();

	 	TakesScreenshot z=(TakesScreenshot)driver;
	File xyz =z.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(xyz, new File("./Screenshots/Data Policy.png"));
	
	//Get System Default Date
			Date d=new Date(0);
			//Create simple date format
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MMM/dd");
			//Convert default date using simple date formatter
			String time=sdf.format(d);
		
			
			//Capture screen and convert into file format
			TakesScreenshot i=(TakesScreenshot)driver;
			File swa =i.getScreenshotAs(OutputType.FILE);
			//Dump screen into local utilities..
			FileUtils.copyFile(swa, new File("screens\\"+time+"Data Policy.png"));
	
	
	
	

}
}
