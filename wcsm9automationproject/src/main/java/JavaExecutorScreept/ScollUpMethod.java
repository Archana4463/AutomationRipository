package JavaExecutorScreept;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScollUpMethod {

	public ScollUpMethod() throws InterruptedException {
		  WebDriver driver = new ChromeDriver();
			 
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			 //lauch the webApplication
			 driver.get("https://www.selenium.dev/");
			 Thread.sleep(2000);
			 JavascriptExecutor jse = (JavascriptExecutor)driver;
				jse.executeAsyncScript("window.scrollBy(0,500)");
		       Thread.sleep(2000);
		     JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		     jse1.executeAsyncScript("window.scrollBy(0,-500)");

			 
	}

}
