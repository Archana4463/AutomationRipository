package DropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectMethod {
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("file:///C:/Users/Shubham%20Gaikwad/Desktop/my%20documents/wcsm9webelement/multiselectdropdown.html");
			WebElement dropdownEle=driver.findElement(By.name("menu"));
			Select sel=new Select(dropdownEle);
			//select single option
			sel.selectByIndex(2);
			Thread.sleep(2000);
			
			//select multioption
			for(int i=0; i<3; i++) {
				Thread.sleep(2000);
				sel.selectByIndex((i));
			}
			Thread.sleep(2000);
			for(int i=0; i<3; i++) {
				Thread.sleep(2000);
				sel.deselectByIndex(i);
				
		
			}
	
		

		}
}
