package TestNGExecutionPackage;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SeleniumTest {

	public void metod3(){
		@Test
		  public void java_method() throws InterruptedException {
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.google.com/");
			driver.switchTo().activeElement().sendKeys("selenium",Keys.ENTER);
			Thread.sleep(2000);
			
			driver.close();
		
	}

}
