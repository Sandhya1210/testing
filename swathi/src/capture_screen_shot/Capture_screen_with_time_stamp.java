package capture_screen_shot;

import java.io.File;

import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_screen_with_time_stamp {

	public static void main(String[] args) throws Exception  
	{
		
		//Locate chrome browser in current system
		System.setProperty("webdriver.chrome.driver","All drives/chromedriver.exe");
		System.out.println("Start");
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.get("http://naukri.com");  //Load web page
		driver.manage().window().maximize();  //maximize browser window
		
		
		
		
		//Get System Default Date
		Date d=new Date(0);
		//Create simple date format
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MMM/dd/ hh-mm-ss");
		//Convert default date using simple date formatter
		String time=sdf.format(d);
		
		
		//Capture screen and convert into file format
		TakesScreenshot i=(TakesScreenshot)driver;
		File source =i.getScreenshotAs(OutputType.FILE);
		//Dump screen into local utilities..
		FileUtils.copyFile(source, new File("screens\\"+time+"Aboutus.png"));

	}

}
