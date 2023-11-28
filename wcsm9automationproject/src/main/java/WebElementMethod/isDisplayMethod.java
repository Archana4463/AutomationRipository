package WebElementMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayMethod {
public static void main(String[] args) throws InterruptedException {
			
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://desktop-0g2s0kd/login.do");
	Thread.sleep(2000);
    driver.findElement(By.name("username")).sendKeys("admin");
    driver.findElement(By.name("pwd")).sendKeys("Manager");
	driver.findElement(By.id("loginButton")).submit();
	//identyfy logoutlink veryfy
	WebElement logoutlinkElement = driver.findElement(By.partialLinkText("Logout"));
	boolean status=logoutlinkElement.isDisplayed();
	System.out.println();
	
}
}