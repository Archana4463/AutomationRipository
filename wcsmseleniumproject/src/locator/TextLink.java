package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextLink {
	
	public static void main(String[] args) throws InterruptedException   {
		WebDriver driver=new ChromeDriver();
		// To maximize ChromeBrowser
		driver.manage().window().maximize();
		//lauch The simple web page
		driver.get("file:///C:/Users/Shubham%20Gaikwad/Desktop/my%20documents/wcsm9webelement/Link.html");
		//identy link by using linktext
		driver.findElement(By.linkText("seleniumlink")).click();
		Thread.sleep(2000);
		driver.close();
		//identyfy link by using partiallink text
		driver.findElement(By.partialLinkText("https://www.selenium.dev"));
		Thread.sleep(2000);
		driver.close();
		
		
		
	}
	

}
