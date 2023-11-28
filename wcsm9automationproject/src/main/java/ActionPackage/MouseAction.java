package ActionPackage;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.nio.file.Watchable;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("denyBtn")).click();
	WebElement watchjwellary = driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));
      //By using mouse action
    Actions act = new Actions(driver);
    Thread.sleep(2000);
   
	act.moveToElement(watchjwellary).perform();
    Thread.sleep(2000);
    driver.findElement(By.partialLinkText("Band")).click();
    
    
   
	

	}
	

}
