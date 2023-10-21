package sychronaizationpackage;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class AmozonAssigenment {
	static WebDriver driver;
public static void main(String[] args) {
	Scanner sc= new Scanner (System.in);
	System.out.print("pass the browser name which to touch");
	String browservalue= sc.next();
	if(browservalue.equalsIgnoreCase("firefox"))
	{
		driver=new FirefoxDriver();
	}
	else
	{
		System.out.println("this not browser value");
	}
	driver.manage().window().maximize();
	
		
			
	
		//open chrome browser
    WebDriver driver=new ChromeDriver();
    //maximize the browser
    driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
   driver.get("https://www.amazon.in/");

	}
   public void search() {
	   
	   
   
	}

}
