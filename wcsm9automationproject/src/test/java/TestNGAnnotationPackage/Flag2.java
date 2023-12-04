package TestNGAnnotationPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2 {
	@Test(description="It is use to perform login!!",enabled=true)
	public void method1() {
		Reporter.log("method2 for login page",true);
	}
	
	@Test(description="It is use to create user!!",enabled=true)
	public void method2() {
		Reporter.log("method2 for user page",true);
	}
	@Test(description="It is use to perform logout!!",enabled=false)
	public void method3() {
		Reporter.log("method3 crete user",true);
	}
	
	
	}

	
	


