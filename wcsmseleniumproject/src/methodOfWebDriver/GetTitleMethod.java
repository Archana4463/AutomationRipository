package methodOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {
	public static void main(String[] args) throws InterruptedException {
		
		//to launch Chrome browser
		WebDriver driver=new ChromeDriver();
		
		//to maximize the Chromebrowser
		driver.manage().window().maximize();
		
		//launch the webapplication
		driver.get("https://www.flipkart.com/");
		
		//Execution stop the two second
		 Thread.sleep(2000);
		 //get the title of current Webaplication
		
		String titleOfPage = driver.getTitle();
		System.out.println(titleOfPage);
		System.out.println(driver.getTitle());
		
		//close the browser
		 driver.close();
	}

}
