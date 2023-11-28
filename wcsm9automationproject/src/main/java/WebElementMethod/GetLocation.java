package WebElementMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {
		public static void main(String[] args) {
			
		WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://demoapps.qspiders.com/");
			WebElement emailTextBox = driver.findElement(By.id("email"));
			
			//get the location email textbox
		Point loc = emailTextBox.getLocation();
		
	int xaxis = loc.getX();
	int yaxis = loc.getY();
	System.out.println("location of email text box:"+xaxis+":"+yaxis);
	
	//get the size of email text box 
	
	}

}
