package TestNGExecutionPackage;

import java.awt.RenderingHints.Key;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class javaTest {
  @Test
  public void java_method() throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.google.com/");
	driver.switchTo().activeElement().sendKeys("Java",Keys.ENTER);
	Thread.sleep(2000);
	
	driver.close();
  }
}
