package capture_screen_shot;

import java.io.File;
import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Snapdeal_screen_capture {

	public static void main(String[] args) throws InterruptedException, IOException  
	{
		
		System.setProperty("webdriver.chrome.driver","All drives/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Thread.sleep(2000);
		driver.findElement(By.id("inputValEnter")).click();
		
		
	TakesScreenshot i=(TakesScreenshot)driver;
	File source=i.getScreenshotAs(OutputType.FILE);
	Thread.sleep(2000);
	FileUtils.copyFile(source,new File("./Screenshots/snapdeal.png"));
		

		

	}

}
