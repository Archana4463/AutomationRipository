package methodOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
	public static void main(String[] args) throws InterruptedException {
		
	//To launch the browser
	
	WebDriver driver=new ChromeDriver();
	//To maximize the browser
	 
	driver.manage().window().maximize();
	
	//launch the webapplication using navigate();
	//store it in one refferance variable i.enav
	Navigation nav =driver.navigate();
	nav.to("https://www.selenium.dev");
	//delay for 2 second
	Thread.sleep(2000);
	//To perform forword oparation
	nav.forward();
	Thread.sleep(2000);
	
	//To perform backword opartion
	nav.back();
	Thread.sleep(2000);
	
	//To perform refresh oparation
	nav.refresh();
	Thread.sleep(2000);
	
	}
}
