package JavaExecutorScreept;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisebleWebElement {
	
	
	public static void main(String[] args) throws InterruptedException {
		 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/");
        driver.findElement(By.xpath("//p[text()='Disabled Mode']")).click();
        JavascriptExecutor jse=(JavascriptExecutor)driver;
        Thread.sleep(2000);
        jse.executeScript("(document.getElementById('name').value='archana')");
        Thread.sleep(2000);
        jse.executeScript("(document.getElementById('email').value='archu@123')");
        Thread.sleep(2000);
        jse.executeScript("(document.getElementById('password').value='archu55')");
        Thread.sleep(2000);
	 WebElement disableRagisterButton = driver.findElement(By.xpath("//button[text()='Register']"));
	 if(disableRagisterButton.isDisplayed())
	 {
		 jse.executeScript("arguments(0).click()",disableRagisterButton);
		// jse.executeScript("arguments(0).click()",driver.findElement(By.xpath("//button[text()='Register']")));
		 System.out.println("click");
	 }
	 else
	 {
		 System.out.println("not click");
	 }



	}

}