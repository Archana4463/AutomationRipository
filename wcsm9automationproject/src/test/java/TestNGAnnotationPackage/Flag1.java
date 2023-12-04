package TestNGAnnotationPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1 {
	@ Test(description="This perform Login Operation!!!")
	public void method()
	{
Reporter.log("Method from flag 1",true);

	}

}
