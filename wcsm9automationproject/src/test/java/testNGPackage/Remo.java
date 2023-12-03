package testNGPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Remo {
  @Test
  public void method1() {
	  
	  //System.out.println("Method2 from Remo class");
	  Reporter.log("Method2 from sumo class!",true);
  }
  
  @Test
  
  public void method2() 
  {
	  Reporter.log("Method3 from sumo class!!",true);
	  
  }
  @Test
  
  public void method4()
  {
	  Reporter.log("method4 from sumo class!!!");
  }
  
}
		