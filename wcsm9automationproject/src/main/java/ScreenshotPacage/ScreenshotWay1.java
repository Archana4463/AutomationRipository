package ScreenshotPacage;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;



public class ScreenshotWay1 {

	public ScreenshotWay1() throws IOException {
		
		    ChromeDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        driver.get("https://demoapps.qspiders.com/");
	        //take a ss of demoapps
	      File src = driver.getScreenshotAs(OutputType.FILE);
	      File dest = new File("./Screenshots/demoapps.jpg");
	       Files.copy(src, dest);
	      
	        
	        
	}

}
