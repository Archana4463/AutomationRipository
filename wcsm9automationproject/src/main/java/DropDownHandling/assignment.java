package DropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment {


	public static void main(String[] args) throws InterruptedException {
	         WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.partialLinkText("Dropdown")).click();
	WebElement dropDown = driver.findElement(By.xpath("//label[text()='Phone Number']/following-sibling::section/select"));
		      
		    

		   Select sel=new Select(dropDown);
			Thread.sleep(2000);

			sel.selectByIndex(2);
		    
		  WebElement dropDown1 = driver.findElement(By.id("select3"));
		  Select sel1 = new Select(dropDown1);
			Thread.sleep(2000);

		  sel1.selectByValue("India");
		  
		WebElement dropDown2 = driver.findElement(By.xpath("//label[text()='State']/following-sibling::select"));
		Select sel2 = new Select(dropDown2);
		Thread.sleep(2000);
		      sel2.selectByVisibleText("Maharashtra");
	}

	
	}


