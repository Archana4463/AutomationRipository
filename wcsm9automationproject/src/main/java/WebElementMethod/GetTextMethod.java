package WebElementMethod;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetTextMethod {

public static void main(String[] args) {
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.google.com/");
			driver.switchTo().activeElement().sendKeys("iphone");
			//get suggestion of ifhone
		List<WebElement> allIphone = (List<WebElement>) driver.findElement(By.xpath("//div[@class='SDkEP']"));
		
		for(WebElement phone:allIphone) {
			System.out.println(phone.getText());
		}
			
}	
	
}


