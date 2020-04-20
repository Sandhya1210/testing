package javascript_Executor_Commands;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Messenger {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","All drives\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.get("http://messenger.com");  //Load web-page
		driver.manage().window().maximize();  //maximize browser window
		

		
		
		//Enable Java-script on Automation browser.
         JavascriptExecutor js=((JavascriptExecutor)driver);
  //Type text into edit-box using java-script..
js.executeScript("document.getElementById('email').value='sejal'");
js.executeScript("document.getElementById('pass').value='12345'");
Thread.sleep(2000);

//button using with java-script
WebElement log_in_button=driver.findElement(By.xpath("//button[contains(@id,'loginbutton')]"));
js.executeScript("arguments[0].click()",log_in_button);



	}

}
