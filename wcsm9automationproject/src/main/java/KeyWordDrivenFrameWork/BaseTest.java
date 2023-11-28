package KeyWordDrivenFrameWork;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest extends Flib implements IautoConstant{
	static WebDriver driver ;
	public void openBrowser() throws IOException
	{
		Flib flib = new Flib();
		 String browservalue=flib.readDataFromProperty(PROP_PATH,"browservalue");
		 String url=flib.readDataFromProperty(PROP_PATH, "url");
		 
		 if(browservalue.equalsIgnoreCase("Chrome"))
		 {
	         driver=new ChromeDriver();
			 
		 }
		 else if(browservalue.equalsIgnoreCase("Edge"))
		 {
		      driver=new EdgeDriver();
		 }
		 else if(browservalue.equalsIgnoreCase("Firefox"))
		 {
			 driver=new FirefoxDriver();
		 }
		 else
		 {
			 System.out.println("Browser value is invalid!!!");
		 }
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get(url);
		
	}
	public void closeBrowser()
	{
		driver.quit();
		
	}
}


