package HandlingPopUp;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadPopUp {

public static void main(String[] args) throws InterruptedException, IOException {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));//
	driver.get("http://desktop-0g2s0kd/login.do");
	driver.findElement(By.name("usernam;e")).sendKeys("Admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	driver.findElement(By.xpath("//div[text()='Settings']/following-sibling ::img")).click();
	driver.findElement(By.xpath("//a[text()='Logo & Color Scheme']")).click();
	driver.findElement(By.id("uploadNewLogoOption")).click();
	WebElement fileButton = driver.findElement(By.name("formCustomInterfaceLogo"));
	
	//perform doubble click
   Actions act = new Actions(driver);
   act.doubleClick(fileButton).perform();
   Thread.sleep(2000);
File file = new File("./autoITPgm/Fileupload.exe");
String abspath=file.getAbsolutePath();
Runtime.getRuntime().exec(abspath);
Thread.sleep(2000);
Runtime.getRuntime().exec(abspath);

Thread.sleep(2000);
driver.quit();
	
	
	
	

}
	}


