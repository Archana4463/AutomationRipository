package DropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstselectOptionMethod {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/Shubham%20Gaikwad/Desktop/my%20documents/wcsm9webelement/SimpleWebPage.html");
	WebElement dropdownEle=driver.findElement(By.id("iddd"));
	//handle the dropdown
	Select sel=new Select(dropdownEle);
	//select single option
	sel.selectByValue("v1");
	Thread.sleep(2000);
	WebElement firstopt = sel.getFirstSelectedOption();
	//get the webelement
	System.out.println(firstopt.getText());
	
	//select multioption
	driver.navigate().to("file:///C:/Users/Shubham%20Gaikwad/Desktop/my%20documents/wcsm9webelement/multiselectdropdown.html") ;
		driver.findElement(By.id("iddd"));
		Select sel2=new Select(dropdownEle);
		for(int i=0; i<3; i++)
		{
		sel.selectByIndex((i));
	}
	//get the option that is selection option
	WebElement firstOpt= sel.getFirstSelectedOption();
	System.out.println(firstOpt.getText());
}
}
