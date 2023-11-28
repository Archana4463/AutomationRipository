package WebElementMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnable {

public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.instagram.com/");
	driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("archana");
	driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("raut");
    WebElement loginButtonElement = driver.findElement(By.xpath("//button[contains(@class,'acap')]"));
     boolean status = loginButtonElement.isEnabled();
     System.out.println(status);
     loginButtonElement.submit();

	
	
	
	
	
	
	
}
		
	}


