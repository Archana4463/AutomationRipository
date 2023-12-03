package TestNGAnnotationPackage;


import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class GoogleSearchText extends BaseTest {
	@Test
	public void Search_java() throws InterruptedException
	{

	Thread.sleep(2000);
	driver.switchTo().activeElement().sendKeys("Java",Keys.ENTER);
	
	
	}
	@Test
	public void Search_Selenium() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("Selenium",Keys.ENTER);

}
}