package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ainvistarascreept {

	public static void main(String[] args) throws InterruptedException {
	
    // launch to chrome browser
     WebDriver driver=new ChromeDriver();
  
     driver.get("https://www.airvistara.com/in/en");
     Thread.sleep(2000);
    //handle notification in pop in chrome browse
     ChromeOptions co = new ChromeOptions();
     co.addArguments("--disable-notification");
     Thread.sleep(2000);
     driver.findElement(By.xpath("cookieModalCloseBtn")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("//input a[@placeholder")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("//input[a[@name='depart']")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("//input[a[@data-date='28']")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("//input@data-date='30']")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("//input[@id='passengers']")).click();
     Thread.sleep(2000);  
     driver.findElement(By.xpath("//button[contain(@value'business']")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("button[contain(@class'class='col-xs-12']")).click();
     Thread.sleep(2000);
     driver.findElement(By.id("promoCode")).click();
     Thread.sleep(2000);
     driver.findElement(By.id("book-flight-widget")).click();
     Thread.sleep(2000);

	}

}