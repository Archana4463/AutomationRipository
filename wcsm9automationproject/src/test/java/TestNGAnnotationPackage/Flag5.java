package TestNGAnnotationPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag5 {
	@Test()
	public void loginMethod()
	{
	
Reporter.log("method1 for login page",true);
	
	}
	@Test()
	public void createUserMethod()
	{
	
Reporter.log("method1 for user page",true);
	
	}
	@Test()
	public void logoutMethod()
	{
	
Reporter.log("method1 for logout page",true);
	
	}
	

}
