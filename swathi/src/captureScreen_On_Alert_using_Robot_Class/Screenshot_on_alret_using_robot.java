package captureScreen_On_Alert_using_Robot_Class;




import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Screenshot_on_alret_using_robot 
{
	public static void main(String[] args) throws Exception 
	{
		//Locate chrome browser in current system
				System.setProperty("webdriver.chrome.driver","All drives\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();  //Launch browser
				driver.get("https://www.firstnaukri.com/");  //Load web page
				driver.manage().window().maximize();  //maximize browser window
				
				
				
				//IDentify search button
				
				WebElement Search_btn=driver.findElement(By.xpath("//input[contains(@type,'submit')]"));
				Search_btn.click();
				
				
				 
				Thread.sleep(2000);
				
				//Get screen dimension at runtime
				
				Dimension Screen_Dimension=Toolkit.getDefaultToolkit().getScreenSize();
				Thread.sleep(2000);
				//Create object for robot class
				Robot robot=new Robot();
				//Create screen
				BufferedImage image=robot.createScreenCapture(new Rectangle(Screen_Dimension));
				Thread.sleep(2000);
				
				//Destination file
				File Dfile=new File("./Screenshots/image1.png");
				//Write Image into local files
				ImageIO.write(image,"PNG", Dfile);
				
				

	}

}
