package HandlingPopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conformation {
	

	public Conformation() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com");
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		 Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		 Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Confirm")).click();
		 Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
	    Alert confirm = driver.switchTo().alert();
	    Thread.sleep(2000);
	       confirm.accept();
	       //print the text of conformation popup
	     String textOfConfirmationPopup = confirm.getText();
	     
		System.out.println(textOfConfirmationPopup);
		Thread.sleep(2000);
		confirm.sendKeys("archana");
		
		
		
		
	}

}
