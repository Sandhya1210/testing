package capture_sreenshot_on_location;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Naukri_Page {

	public static void main(String[] args) throws IOException, InterruptedException {
		//Locate chrome browser in current system
		System.setProperty("webdriver.gecko.driver","All drives\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();  //Launch browser
		driver.get("http://naukri.com");  //Load web page
		driver.manage().window().maximize();  //maximize browser window
		
		//Close cookies warning window
		driver.findElement(By.xpath("//button[.='GOT IT']")).click();
		Thread.sleep(2000);
		
		WebElement Location=driver.findElement(By.xpath("//a[@href='http://infoedge.in']"));
		new Actions(driver).moveToElement(Location).build().perform();
		new Actions(driver).sendKeys(Keys.PAGE_DOWN).perform();
		
		//Capture screen and convert into file format
		File src_file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Dump screen into local utilities..
		FileUtils.copyFile(src_file, new File("screens\\Aboutus.png"));

		

	}

}
