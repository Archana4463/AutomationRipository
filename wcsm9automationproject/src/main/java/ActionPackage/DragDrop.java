package ActionPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DragDrop {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://demoapps.qspiders.com/");
	driver.findElement(By.id("//section[text()='Drag And Drop']")).click();
	driver.findElement(By.xpath("//section[text()='Drag And Drop']"));
	//drag all the element
	driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
	driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
    driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
    driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
    
}
}
