package JavaExecutorScreept;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBarLeft {
public static void main(String[] args) {
	      
	        WebDriver driver = new ChromeDriver();
		     driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			 //lauch the webApplication
			 driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
			 
			 //perform scroo right
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			
			for(int i=0; i<=2; i++) {
				 jse = (JavascriptExecutor)driver;
			jse.executeAsyncScript("window.scrollBy(0,-500)");
	
				
			}
	}
}

