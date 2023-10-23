package methodOfWebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementWebDriver {

	public static void main(String[] args, WebElement WebElementbikeOptions) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("bike");
		Thread.sleep(2000);
		
		//identyfy all the suggetion of bike
       WebElementbikeOptions=driver.findElement(By.xpath("//div@class=class=\"LC20lb MBeuO DKV0Md\']"));
       //read all the suggestion in bike optionsby using for loop
       Thread.sleep(2000);
      WebElement[] bikeOptions;
	// for each loop
       for(WebElement op:bikeOptions);
       {
      
	Object stringOPtions = Op.getText();
	 Thread.sleep(2000);
	 char[] option;
	System.out.println(option);
    

       }
	

	}
		
       
       
       
 

		
	
		
	}

}
