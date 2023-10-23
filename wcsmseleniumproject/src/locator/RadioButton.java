package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		// To maximize ChromeBrowser
		driver.manage().window().maximize();
		//lauch The simple web page
		driver.get("file:///C:/Users/Shubham%20Gaikwad/Desktop/my%20documents/wcsm9webelement/RadioButton.html");
		Thread.sleep(2000);
		//identyfy A radio button by using name locator
		driver.findElement (By.name("name1")).click();
		//identyfy B radio button by using name locator
		Thread.sleep(2000);
		driver.findElement (By.name("name2")).click();
		
		
		}


}
