package HandlingPopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/alert");
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		//genrate the popup
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		//accept alert popup
		//alert.accept();
		//get the text of alert popup
		String Textofalert = alert.getText();
		System.out.println(Textofalert);
		//dismiss alert popup
		alert.dismiss();
		
		
		
	}
	
	}


