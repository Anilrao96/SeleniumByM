package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Sample {
  @Test//Test scenario 
  public void f() {
	  System.out.println("test1");
  }
  
  @Test//Test scenario
  public void g() {
	  System.out.println("test2");
  }
  @BeforeTest//pre-condition
  public void beforeTest() {
	  System.out.println("Before Test");
  }

  @AfterTest//post-condition
  public void afterTest() {
	  System.out.println("After test");
  }

}
