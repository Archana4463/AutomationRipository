package TestNGExecutionPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {
  @Test
  public void method1() 
	 
	  {
		 Reporter.log("method1 from test2 class!"); 
	  }
  @Test
  public void method2()
  {
	  Reporter.log("method2 from test2 class");
  }
  }

