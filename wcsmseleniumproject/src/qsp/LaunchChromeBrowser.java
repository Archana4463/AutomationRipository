package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		// launch to browser we create new object of ChromDriver
		//how to close chrome browser.
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		System.out.println("Chrome is open");
  Thread.sleep(2000);
  driver.close();
  System.out.println("Chrome is close");
  
	}

}
