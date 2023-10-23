package methodOfWebDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMethod {
	public static void main(String[] args) throws InterruptedException {
		
		//To lauch the chrome Browser
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		
		//switch to contain active element
		driver.switchTo().activeElement().sendKeys("selenium" ,Keys.ENTER);
		
	}

}