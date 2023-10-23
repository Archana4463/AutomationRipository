package methodOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethod {
	
	public static void main(String[] args) throws InterruptedException {
		//to lauch the chrome Browser
		WebDriver driver=new ChromeDriver();
		//maximize the chrome browser
		driver.manage().window().maximize();
		//launch the web application
		driver.get("http://omayo.blogspot.com/");
		//execution stop for two second
		Thread.sleep(2000);
		//click on pop on link
		driver.findElement(By.partialLinkText("Open a popup window")).click();
		//Execution stop for two second
		Thread.sleep(2000);

          //close all the browser and window
			driver.quit();
		
	
		
	}

}
