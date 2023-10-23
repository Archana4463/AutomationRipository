package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocator {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		// To maximize ChromeBrowser
		driver.manage().window().maximize();
		//lauch The simple web page
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		//identyfy username by using cssSelector
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("admin");
		
		//identyfy passwordTB by using CssSelector
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("ADMIN");
		
		//identyfy login button by using CssSelector
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(2000);
		
		driver.quit();
		
		
	}

}
