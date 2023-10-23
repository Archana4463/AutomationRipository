package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxBrowser {

	public static void main(String[] args) throws InterruptedException {
	
		//Launch to FireFoxBrowser we need to create object of FirefoxDriver
		//how to close firefox
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		System.out.println("Firefox is open");
		Thread.sleep(2000);
		driver.close();
		System.out.println("firefox is close");
	}
}