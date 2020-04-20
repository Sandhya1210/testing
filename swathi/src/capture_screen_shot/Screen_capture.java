package capture_screen_shot;

import java.io.File;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen_capture 
{
public static void main(String[] args) throws Exception {
		
		//Locate chrome browser in current system
		System.setProperty("webdriver.chrome.driver","All drives/chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.get("http://naukri.com");  //Load web page
		driver.manage().window().maximize();  //maximize browser window
		Thread.sleep(2000);
		
		/*
		 * => In WebDriver after capture screen shot, We must dump
		 * 	  into local utilities.Inorder to access local utilities
		 * 	  we need to download and configure Apache commonsIO files
		 * 	  into project..
		 * 
		 * 	=> Download apache common IO file..
		 * 	=> http://commons.apache.org/proper/commons-io/download_io.cgi
		 * 	=> Under binaries download  commons-IO-2.6-bin.zip
		 * 	=> Unzip file and conifigure all executable jar files to project..
		 */
		
		//Capture screen and convert into file format
		File src_file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Thread.sleep(2000);
		//Dump screen into local utilities..
		FileUtils.copyFile(src_file, new File("./Screenshots/naukri.png"));
		
		/*
		 * .PNG:--> Portal network graphic  [Image extension]
		 * 				[we can alos follow other extension  png,jpg,bmp ---etc]
		 */
		
		
		
		
		/*
		 * Disadvantages:-->
		 * 		1. Every time when program re running it overriding image.
		 * 		2. Only capturing top frame of screen..
		 * 		3. Can't capture screen when alert was presented...
		 */
}
}
