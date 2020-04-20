package capture_screen_shot;




import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Facebook_screenshot_capture {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","All drives/chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.get("http://facebook.com");  //Load web page
		driver.manage().window().maximize();  //maximize browser window
		Thread.sleep(2000);
		//Facebook_screenshot_capture 
		TakesScreenshot u=(TakesScreenshot)driver;
    	File source=u.getScreenshotAs(OutputType.FILE);
		Thread.sleep(2000);
		//Dump screen into local utilities..
		FileUtils.copyFile(source,new File("./Screenshots/facebook.png"));

	}

}
