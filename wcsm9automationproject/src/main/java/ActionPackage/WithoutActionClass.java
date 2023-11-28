package ActionPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutActionClass {

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.bluestone.com/");
			driver.findElement(By.id("denyBtn")).click();
		    WebElement coinTarget = driver.findElement(By.partialLinkText("Coins"));
		    
		    Thread.sleep(2000);
		    //use action class for mousehover
		   
		
	}

}
