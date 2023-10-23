package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class InstagramLoginPage {
	  public static void main(String[] args) throws InterruptedException
	  {         
	        WebDriver driver=new ChromeDriver();
		     
		     driver.manage().window().maximize();
		     driver.get("https://www.instagram.com");
		     //stop the execution of two minite
		     Thread.sleep(2000);
		     //identyfy username taxtbox and pass input
		     driver.findElement(By.xpath("//input[contain(@aria -lable'Phone number, username, or email')]")).sendKeys("admin");
		     Thread.sleep(2000);
		     //identyfy password textbox and pass input
		     driver.findElement(By.xpath("//input[contain(@aria-lable,'Password')]")).sendKeys("admin12");
		     //identyfy login button and click
		     driver.findElement(By.xpath("//button[contain(@class,'_acan_acap_acas_aj1_')]")).click();
		     Thread.sleep(2000);
		     driver.quit();


	}

}
