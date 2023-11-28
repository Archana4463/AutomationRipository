package KeyWordDrivenFrameWork;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActiTimeInValid extends BaseTest {
	

		public static void main (String[] args) throws InterruptedException, IOException {
			
			//lounch the browserand close the browser
		       BaseTest bt = new BaseTest();
			//to read data from property file
		       Flib flib = new Flib();
			   bt.openBrowser();
			   
			   //to read the data from excel sheet
			Flib fb = new Flib();
			int rc = flib.rowCount("./src/main/resources/ActiTimeData.xlsx","invalidcread");
			
			for(int i=1;i<=rc;i++)
			{
			   
			   //identyfy username textbox
			  WebElement usnTB = driver.findElement(By.name("username"));
			  usnTB.sendKeys(flib.readDataFromExcel(PROP_PATH, INVALIDCREAD_SHEET, i, 0));
			  
			  //identyfy the text box
			  WebElement passTB = driver.findElement(By.name("pwd"));
			  passTB.sendKeys(flib.readDataFromExcel(EXCEL_PATH, INVALIDCREAD_SHEET, i, 1));
			  
			  //identyfy login textbox
			  driver.findElement(By.id("LoginButton")).click();
			  Thread.sleep(2000);
			  driver.findElement(By.name("username")).clear();
		}
			bt.closeBrowser();
			  
		}

		}
		
	


		
	
	


