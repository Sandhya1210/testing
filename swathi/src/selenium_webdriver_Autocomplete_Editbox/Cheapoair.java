package selenium_webdriver_Autocomplete_Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Cheapoair {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","All drives\\chromedriver.exe");
		WebDriver u=new ChromeDriver();
		u.get("https://www.cheapoair.com");
		u.manage().window().maximize();
		u.findElement(By.cssSelector("input[id='from0']")).sendKeys("SEA - Seattle Tacoma, Washington, United States");

		u.findElement(By.cssSelector("input[id='to0']")).sendKeys("INT - Winston Salem, North Carolina, United States");
		u.findElement(By.cssSelector("#cal0")).click();
		
		u.findElement(By.cssSelector("a[aria-label='9 March 2020']")).click();
		u.findElement(By.cssSelector("a[aria-label='21 March 2020']")).click();
		u.findElement(By.cssSelector("a[id='travellerButton']")).click();
		
		u.findElement(By.cssSelector("button[id='addyouth']")).click();
		Thread.sleep(2000);
		//cssSelector Method by using dropdown method.....
		new Select(u.findElement(By.cssSelector("select[name='Class']"))).selectByVisibleText("Premium Economy");
		
		u.findElement(By.cssSelector("button[id='closeDealDialog']")).click();
		u.findElement(By.cssSelector("input[id='searchNow']")).click();

	}

}
