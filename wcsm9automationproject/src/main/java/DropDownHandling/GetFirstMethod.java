package DropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstMethod {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Shubham%20Gaikwad/Desktop/my%20documents/wcsm9webelement/SimpleWebPage.html");
       //single select dropdown
	   WebElement menuDropDown=driver.findElement(By.id("iddd"));
		////handle dropdown
	  Select sel=new Select(menuDropDown);
	  //select option from dropdown
	//sel.selectByIndex("V")
	  //get option which is selected first
	=  sel.getFirstSelectedOption()
	  
	  
	
	}

}
