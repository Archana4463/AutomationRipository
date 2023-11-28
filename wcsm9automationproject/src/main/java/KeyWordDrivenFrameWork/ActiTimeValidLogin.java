package KeyWordDrivenFrameWork;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ActiTimeValidLogin extends BaseTest{
	public static void main (String[] args) throws InterruptedException, IOException {
	
	//lounch the browserand close the browser
       BaseTest bt = new BaseTest();
	//to read data from property file
       Flib flib = new Flib();
	   bt.openBrowser();
	   
	   //identyfy username textbox
	  WebElement usnTB = driver.findElement(By.name("username"));
	  usnTB.sendKeys(flib.readDataFromProperty(PROP_PATH,"username"));
	  
	  //identyfy the text box
	  WebElement passTB = driver.findElement(By.name("pwd"));
	  passTB.sendKeys(flib.readDataFromProperty(PROP_PATH,"password"));
	  
	  //identyfy login textbox
	  driver.findElement(By.id("LoginButton")).click();
	  
	  Thread.sleep(2000);
	  bt.closeBrowser();
	  
	                 
	}  
	 
		
	}

	
	


