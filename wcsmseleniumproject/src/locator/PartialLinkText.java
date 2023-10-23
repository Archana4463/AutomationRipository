package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		// To maximize ChromeBrowser
		driver.manage().window().maximize();
		//lauch The simple web page
		driver.get("file:///C:/Users/Shubham%20Gaikwad/Desktop/my%20documents/wcsm9webelement/Link.html");
		//identy link by using linktext
		driver.findElement(By.linkText("seleniumlink"));
		driver.findElement(By.partialLinkText("seleniumlink"));
		
		

	}

}
