package JavaExecutorScreept;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

import com.google.common.io.Files;

public class Screenshottwitter {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 //lauch the webApplication
		 driver.get("https://www.selenium.dev/");
		WebElement twitterSymbol = driver.findElement( By.xpath("//i[@class='fab fa-twitter']"));
		Point loc = twitterSymbol.getLocation();
		int xaxis = loc.getX();
		int yaxis = loc.getY();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+xaxis+","+yaxis+")");
		   //take screenshot of the webpage
        TakesScreenshot ts = (TakesScreenshot)driver;
        //call the method
     File src = ts.getScreenshotAs(OutputType.FILE);
     //identyfy storing screenshot
    File dest = new File("./Screenshots/twitter.png");
     //store the screenshot into dest
    Files.copy(src, dest);
    
    
		
		
	}

}
