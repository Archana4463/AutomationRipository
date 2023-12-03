package TestNGAnnotationPackage;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsClass {
  @Test
  public void annotation_Test_Method() {
	  Reporter.log("Test annotation",true);
  }
  @BeforeMethod
  public void annotation_BeforeMethod()
  {
	   Reporter.log("Before method annotation",true);
  }
  @BeforeClass
  public void annotation_BeforeClass()
  {
	  Reporter.log("Before class annotation",true);
  }
  
  @AfterMethod
  public void annotation_AfterMethod() {
	  Reporter.log("After method annotation",true);
	  
}
  @AfterClass
  public void annotation_AfterClass()
  {
	  Reporter.log("After Class annotation",true); 
  }
  @BeforeTest
  public void annotation_BeforeTest()
  {
	  Reporter.log("Before Test annotation",true);
  }
  @BeforeSuite
  public void annotation_BeforeSuite()
  {
	  Reporter.log("Before suite annotation",true);
  }
  @AfterTest
  public void annotation_AfterTest()
  {
	  Reporter.log("After Test annotation",true);
  }
  
  @AfterSuite
  public void annotation_AfterSuite()
  {
	  Reporter.log("After Suite annotation",true);
  }
  
  
  
  
  
  
  
  
	  
  }

