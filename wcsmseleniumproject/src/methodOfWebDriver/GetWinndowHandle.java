package methodOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class GetWinndowHandle {

	public static void main(String[] args) throws InterruptedException {
		
  // open the chrome browser
	WebDriver driver= new ChromeDriver();
				
	//maximize the browser
	driver.manage().window().maximize();
	
	//take a source code of login page
		driver.get("https://www.primevideo.com/");
	 String loginpagesourcecode = driver.getPageSource();
				
	  System.out.println(loginpagesourcecode);
	 
	  //stop the execution for two second
		Thread.sleep(2000);
		
		
	  //close the browser
	   driver.quit();
	}

}
