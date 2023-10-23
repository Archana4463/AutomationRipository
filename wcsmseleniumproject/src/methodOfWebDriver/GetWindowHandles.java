package methodOfWebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {

	public static void main(String[] args) throws InterruptedException  {
		
		 // open the chrome browser
		WebDriver driver= new ChromeDriver();
					
		//maximize the browser
		driver.manage().window().maximize();
		
		//To launch webapplication
			driver.get("https://www.primevideo.com/");
			
			//to stop execution of browser for two second
			Thread.sleep(2000);
			String parentHandle=driver.getWindowHandle();
			System.out.println(parentHandle);
			driver.findElement(By.partialLinkText(parentHandle));
		    
			Set<String> allHandles = driver.getWindowHandles();
			//print the address of browser for each loop
			System.out.println("parentHandle");
			
			for(String Wh:allHandles)
			{
				System.out.println("parent Handle:"+Wh+" child handle:+Wh+");
				
			if(!parentHandle.equals(Wh))
               {
			
					System.out.println("address of child window "+Wh);
				}
				else {
					  System.out.println("address of parent window"+Wh);
				     }
			  }
					
						
						
						
			
			
					
		  
			

	}

}
