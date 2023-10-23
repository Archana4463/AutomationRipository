package methodOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {

	public static void main(String[] args) throws InterruptedException {
		
		// open the chrome browser
		WebDriver driver= new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		driver.get("https://www.primevideo.com/");
		
		//stop the execution for two second
		Thread.sleep(2000);
		System.out.println(driver.getPageSource());
		
		 //close the browser
		driver.close();
	
		
	}

}
