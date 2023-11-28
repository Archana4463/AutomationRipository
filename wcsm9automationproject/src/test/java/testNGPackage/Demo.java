package testNGPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void Method1() {
	//  System.out.println("method1 from Demo class");
	  Reporter.log("method1 from Demo class", true);
  }
  @Test
  public void Method2() {
	  System.out.println("method1 from Demo class");
	  Reporter.log("method1 from Demo class", false);
}
}