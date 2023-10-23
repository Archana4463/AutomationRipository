package DropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleMethod {



	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/");
		//click on dropdown
		 driver.findElement(By.xpath("//section[text()='Dropdown']"));
		// driver.findElement(By.partialLinkText("Multi Select")).click();
		//single select dropdown
		//WebElement dropDown1=driver.findElement(By.xpath("//label[text()='City']/following-sibling::select"));
		//Select sel=new Select(dropDown1);
	    //Boolean status = sel.isMultiple();
	   // System.out.println(status);
	   //multiple select dropdown

	   //WebElement dropDown  =driver.findElement(By.xpath(""));
	//   Select sel2 =  new Select(dropDown);
     //	Boolean s status =sel2.isMultiple();
     //	System.out.println(status);
	
	
	
	

	}

}
