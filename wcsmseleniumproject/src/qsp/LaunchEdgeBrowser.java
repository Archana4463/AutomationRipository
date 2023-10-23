package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdgeBrowser {

	public static void main(String[] args) throws InterruptedException {
		

		// to launch EdgeBrowse we need to create obj of EdgeDriver
		//How to close Edgebrowser
		WebDriver driver=new EdgeDriver();
		System.out.println(" Edge is open");
		Thread.sleep(2000);
		driver.close();
		System.out.println("Edge is close");

	}

}

	
	