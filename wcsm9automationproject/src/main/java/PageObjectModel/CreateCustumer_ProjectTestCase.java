package PageObjectModel;

import java.io.IOException;

public class CreateCustumer_ProjectTestCase extends BaseTest{
	

	private static final String customer_sheet = null;

	public static void main(String[] args) throws IOException, InterruptedException {
		
		//to open browser
       BaseTest bt = new BaseTest();
       bt.Setup();
       
      //read data from excel and property file
             Flib flib= new Flib();
       
         //to perform valid login use login page
          LoginPage lp = new LoginPage(driver);
          lp.voidLogin(Flib.readDataFromProperty(PROP_PATH, "username"),Flib.readDataFromProperty(PROP_PATH, "pssword"));
          
          Thread.sleep(2000);
       
          //to work task module use homepage pom
              HomePage hp = new HomePage(driver);
              hp.click_on_Task_Module();
              
              Thread.sleep(2000);
                     TaskPage tp = new TaskPage(driver);
  tp.createcustomer_createproject_method(flib.readDataFromExcel(EXCEL_PATH,"INVALIDCREAD_SHEET",1 ,0),Flib.readDataFromExcel(EXCEL_PATH, customer_sheet, 1, 1));
                     
                     

                     
                     
                     Thread.sleep(2000);
                     bt.tearDown();
}
}