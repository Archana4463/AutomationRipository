package PageObjectModel;

import java.io.IOException;

public class ActiTimeTestCase extends BaseTest {
	public static void main(String[] args) throws IOException, InterruptedException {
		//open the browser
		BaseTest bt = new BaseTest();
         bt.Setup();
         
         //get the webelement on loginpage from pom class
        LoginPage lp = new LoginPage(driver);
        
        //read data from excel sheet
        Flib flib = new Flib();
        
        lp.voidLogin(flib.readDataFromProperty(PROP_PATH, "username"),flib.readDataFromProperty(PROP_PATH, "password"));
        
        Thread.sleep(2000);
        bt.tearDown();
        
        
      
             
             
             
         
		

	
	
	}
	
	

}
