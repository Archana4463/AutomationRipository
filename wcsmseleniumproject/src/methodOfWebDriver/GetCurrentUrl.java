package methodOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//launch the web application
		driver.get("http://omayo.blogspot.com/");
		//execution stop for two second
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
	}

}
