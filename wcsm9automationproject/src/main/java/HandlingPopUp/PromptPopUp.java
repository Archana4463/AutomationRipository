package HandlingPopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/alert");
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		 Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Confirm']")).click();
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		//handle pramot popup
		Alert prompt=driver.switchTo().alert();
		//send response as yes
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("yes");
		prompt.sendKeys("yes");
		//accept prompt popup
		Thread.sleep(2000);
		prompt.accept();
		
		//dissmisss prompt popup
		prompt.dismiss();
		
	}
		
	}


