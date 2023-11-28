package FramePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleMap {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.com/");
		
		//click on googlemap
		driver.findElement(By.xpath("//a[@aria-label=\"Google apps\"]")).click();
		
		//identyfy the frame and store in to the webElement
		driver.switchTo().frame(1);
		
		//click on map
		driver.findElement(By.xpath("//span[text()='Maps']")).click();
		
		
		
		
	}

	
	}


