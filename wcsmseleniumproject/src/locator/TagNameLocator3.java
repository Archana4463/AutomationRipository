package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		// To maximize ChromeBrowser
		driver.manage().window().maximize();
		//lauch The simple web page
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		//identyfy usernameTB and pass AS "input"
		driver.findElement (By.tagName("input")).sendKeys("tiger");
		//identyfy Password and passTB and pass  input as( "");
		Thread.sleep(2000);
		driver.findElement (By.id("input")).sendKeys("tiger");
		
		
	}

}
