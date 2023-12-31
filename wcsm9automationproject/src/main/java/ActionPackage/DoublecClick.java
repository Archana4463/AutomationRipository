package ActionPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoublecClick {
	  public static void main(String[] args) {
		  
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  driver.get("https://demoapps.qspiders.com/");
		  
		  driver.findElement(By.xpath("//section[text()='Button']")).click();
		  driver.findElement(By.xpath("//a[.='Double Click']")).click();
		           Actions act = new Actions(driver);
		           
		        WebElement first = driver.findElement(By.xpath("//button[.='Yes'][1]"));
		        act.doubleClick(first).perform();
	}

}
