package sychronaizationpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.instagram.com/");
		driver.findElement(By.name("username")).sendKeys("archana");
		driver.findElement(By.name("password")).sendKeys("raut");
		driver.findElement(By.className("//button[@class='_acan _acap _acas _aj1-']")).click();

	
	}

}
