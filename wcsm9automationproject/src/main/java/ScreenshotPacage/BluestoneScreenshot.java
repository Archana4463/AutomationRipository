package ScreenshotPacage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class BluestoneScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 //lauch the webApplication
		 driver.get("https://www.bluestone.com/");
		 Thread.sleep(2000);
		// handle popup
		 driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
		WebElement coinTarget = driver.findElement(By.xpath("//a[text()='Coins ']"));
		Actions act = new Actions(driver);
		 act.moveToElement(coinTarget).perform();
		 driver.findElement(By.xpath("//span[text()='Coins by Design']")).click();
		 //take screenshot of webelement
		 
		 TakesScreenshot ts = (TakesScreenshot)driver;
		  //take a screenshot
		  File src =  ts.getScreenshotAs(OutputType.FILE);
		     //identyfy storing screenshot
		    File dest = new File("./Screenshots/coins.png");
		     //store the screenshot into dest
		    Files.copy(src, dest);
	}
		
	

}
