package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathlocator {
		
		public static void main(String[] args) throws InterruptedException {

			WebDriver driver=new ChromeDriver();
			// To maximize ChromeBrowser
			driver.get("https://www.airvistara.com/in/en");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			//identyfy username by using cssSelector
			driver.findElement(By.id("cookieModalCloseBtn")).sendKeys("admin");
			
			//identyfy passwordTB by using CssSelector
			driver.findElement(By.xpath("//input[@name='flightSearchFrom']")).sendKeys("ADMIN");
			Thread.sleep(2000);
			
			//identyfy login button by using xpath
			driver.findElement(By.xpath("//input[@'placeholder=Select Arrival City']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@data-date='21']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@data-date='22']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@id='passengers']")).click();
			Thread.sleep(2000);
			
			
			driver.quit();
			
		
	}
	 
		
	}


