package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {

	public static void main(String[] args) throws InterruptedException {
		// 
		WebDriver driver=new ChromeDriver();
		// To maximize ChromeBrowser
		driver.manage().window().maximize();
		//lauch The simple web page
		
		Thread.sleep(2000);
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("joey tribbiani",Keys.ENTER);
		//identyfy classname
		driver.findElement(By.className("lNPNe")).click();
		driver.close();
		
	}

}
