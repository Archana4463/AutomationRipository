package WebElementMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod {

public static void main(String[] args) throws InterruptedException {

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://desktop-0g2s0kd/login.do");
	Thread.sleep(2000);
	WebElement usnTB = driver.findElement(By.name("username"));
	usnTB.sendKeys("admin");
	Thread.sleep(2000);
    WebElement passTB = driver.findElement(By.name("pwd"));
	passTB.sendKeys("manager");
	Thread.sleep(2000);	
	driver.findElement(By.name("remember")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Login']")).click();
	
}
}



