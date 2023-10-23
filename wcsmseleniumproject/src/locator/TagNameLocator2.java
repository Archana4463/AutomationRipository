package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		// To maximize ChromeBrowser
		driver.manage().window().maximize();
		//lauch The simple web page
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
		//identyfy usernameTB and pass AS "email"
		driver.findElement (By.name("email")).sendKeys("Tiger");
		//identyfy Password and passTB and pass  input "pass"
		Thread.sleep(2000);
		driver.findElement (By.id("pass")).sendKeys("manager");
		}

		
	}


