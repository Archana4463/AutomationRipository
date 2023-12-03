package TestNGExecutionPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test3 {
  @Test
  public void method1() 
	  {
			 Reporter.log("method1 from test3 class!"); 
		  }
	  @Test
	  public void method2()
	  {
		  int a=5;
		  int b=1;
		  int res=a/b;
		  
		  Reporter.log("method2 from test3 class",+res,true);
	  }
	  }


  

