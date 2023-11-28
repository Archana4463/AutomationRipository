package FramePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrameMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("denyBtn")).click();
		
		//handle by using string Name
		driver.switchTo().frame("fc_widget");
		//driver.switchTo().frame(6);
	  		driver.findElement(By.id("chat-icon")).click();
	  		driver.switchTo().defaultContent();
	  		
	  		driver.findElement(By.id("chat-fc-name")).sendKeys("Archana");
	  		driver.findElement(By.id("chat-fc-email")).sendKeys("Raut@123");
	  		driver.findElement(By.id("chat-fc-phone")).sendKeys("9876543209");
	  		driver.findElement(By.partialLinkText("Start Chat")).click();
	
		
		
		
	}
		
	}


