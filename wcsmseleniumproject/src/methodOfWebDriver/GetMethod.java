package methodOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {
	public static void main(String[] args) throws InterruptedException{
	// Launch to chrome browser
		
		WebDriver driver=new ChromeDriver();
		//maximize the chrome browser
		driver.manage().window().maximize();
		//Launch the Webapplication
		driver.get("https://www.primevideo.com/");
		//stop the exicution of script for 2 second
		Thread.sleep(2000);
		//close the browser
		driver.close();
	}

}
