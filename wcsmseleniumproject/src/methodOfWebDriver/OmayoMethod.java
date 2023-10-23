package methodOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OmayoMethod {
	public static void main(String[] args) throws InterruptedException {
		
	

	//to launch chrome browser
	WebDriver driver = new ChromeDriver();
	//maximize the browser
	driver.manage().window().maximize();
	driver.get("http://omayo.blogspot.com");
	Thread.sleep(2000);
	
	driver.findElement(By.linkText("https://testpages.herokuapp.com/basic_web_page.html")).click();
	Thread.sleep(2000);
	driver.close();
	
	
	}	

}