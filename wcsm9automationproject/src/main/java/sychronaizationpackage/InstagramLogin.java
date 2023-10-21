package sychronaizationpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//apply implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
				
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		//identyfy username tb
		driver.findElement(By.name("username")).sendKeys("admin12");
		//identyfy password tb
		driver.findElement(By.name("password")).sendKeys("admin456");
		//identyfy login button
		driver.findElement(By.xpath("div[text()='Log in']")).click();
		
	}

}
