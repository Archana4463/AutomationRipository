package ActionPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Seleniumcontexclick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//section[text()='Button']")).click(); 
		driver.findElement(By.xpath("//a[text()='Right Click']")).click();
		            Actions act =new Actions(driver);
		            
		 //first right click
		            
		   WebElement First  =driver.findElement(By.xpath("//button[text()='Right Click'][1]"));
		   act.contextClick(First).perform();
		   Thread.sleep(2000);
		   
		   driver.findElement(By.xpath("//button[text()='Yes']")).click();
		   driver.findElement(By.xpath("//span[text()='You selected \"Yes\"']")).isDisplayed();
		   System.out.println("text Display");
		   System.out.println("not display");
		   
		
	

	}

}
