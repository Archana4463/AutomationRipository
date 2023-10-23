package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OmayoTask {
	public static void main(String[] args) throws InterruptedException {
	//open a chrome browser
		
		WebDriver driver=new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//lounch the simple webpage
		driver.get("http://omayo.blogspot.com");
		driver.findElement(By.partialLinkText("Open a popup window")).click();
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
	}
	

}
