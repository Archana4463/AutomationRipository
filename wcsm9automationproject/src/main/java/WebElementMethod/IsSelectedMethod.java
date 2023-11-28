package WebElementMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {

public static void main(String[] args) {

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://desktop-0g2s0kd/login.do");
	//identyfy cheakbox veryfy
	WebElement checkBoxElement = driver.findElement(By.id("keepLoggedInCheckBox"));
	boolean status = checkBoxElement.isSelected();
	System.out.println(status);
	//select checkbox element veryfy status
	checkBoxElement.click();
	boolean status1 = checkBoxElement.isSelected();
	System.out.println(status);
	
}
		
	}


