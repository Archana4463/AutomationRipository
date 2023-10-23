package assignmentPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartFindElements {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
//maximize the browser
	driver.manage().window().maximize();
//apply wait
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
  //launch browser  
   driver.get("https://www.flipkart.com/");
   driver.findElement(By.xpath("//span[@class='_30XB9F']")).click();
   driver.findElement(By.name("q")).sendKeys("laptops");
   //click on search icon
   driver.findElement(By.xpath("//button[@title='Search for Products, Brands and More']")).click();

	
}
}
