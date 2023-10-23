package methodOfWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethod {

	public static void main(String[] args) throws InterruptedException {
	 
	    //lauch the chrome browser
	   //create the object of chrome driver
		
		WebDriver driver= new ChromeDriver();
		//Handle the property of chrome browser
		//maximize the browser
		//minimize the browser
		//fullscreen the browser
		//set the size of browser
		//set the possition of browser
		
		//maximize the browser
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//minimize the browser
		driver.manage().window().minimize();
		Thread.sleep(2000);
		
		//fullscreen the browser
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		
		//set the size of browser
		Dimension Dimension = new Dimension(350, 250);
		driver.manage().window().setSize(null);
		Thread.sleep(2000);
		
		//set the size of browser
		Point targetposition = new Point(450,250);
		driver.manage().window().setPosition(targetposition);
			
	

	}

}

