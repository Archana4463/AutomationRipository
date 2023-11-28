package PageObjectModel;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class ActiTimeInvalidTestCase extends BaseTest {
	public static void main(String[] args) throws IOException, EncryptedDocumentException {
		
	//open the browser
			BaseTest bt = new BaseTest();
	         bt.Setup();
	         
	         //get the webelement on loginpage from pom class
	        LoginPage lp = new LoginPage(driver);
	        
	        //read data from excel sheet
	        Flib flib = new Flib();
	      //read rowcount
	         int rc = flib.rowCount(EXCEL_PATH, INVALIDCREAD_SHEET);
	        
	        
	        
	        //
	        for(int i=1;i<=rc;i++)
	        {
	        	//get the method to perform invalid login from loginpage pom class
	      lp.InvoidLogin(flib.readDataFromExcel(EXCEL_PATH, INVALIDCREAD_SHEET, i,0 ),flib.readDataFromExcel(EXCEL_PATH, INVALIDCREAD_SHEET, i, 1));
	        }
	        bt.tearDown();
	        
	       
	}

}
