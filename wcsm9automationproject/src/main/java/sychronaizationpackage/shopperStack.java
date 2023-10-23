package sychronaizationpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class shopperStack {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
	   //lounch the webapplication
		driver.get("https://www.shoppersstack.com/");
		//apply implicit wait
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//provide delay time to browser
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img@alt=SAMSUNG Galaxy Z Flip4 "));
		driver.findElement(By.id("Check Delivery")).sendKeys("411033");
		WebElement cheakbutton = driver.findElement(By.id("check"));
	explicitwait(driver, 30, cheakbutton).click();
	 
	}
	 public static WebElement explicitwait(WebDriver driver,long sec,WebElement ele) {
			 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
					 
	 WebElement element= wait.until(ExpectedConditions.elementToBeClickable(ele));
	return element;
	 }
}


