package DropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectionMethod {

	public static void main(String[] args) throws InterruptedException {

	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/Shubham%20Gaikwad/Desktop/my%20documents/wcsm9webelement/SimpleWebPage.html");
     WebElement dropDown=driver.findElement(By.id("menu"));
      Select sel  = new Select(dropDown);
      //use selection method
      Thread.sleep(2000);
      sel.selectByIndex(3);
      sel.deselectByVisibleText("");
       Thread.sleep(2000);
       sel.selectByValue("v2");
    
		
		
}
}