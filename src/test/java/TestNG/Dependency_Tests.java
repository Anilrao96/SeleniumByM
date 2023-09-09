package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Dependency_Tests {
  @Test(dependsOnMethods= {"green"})
  public void red() {
	  System.out.println("Red");
  }
  @Test(dependsOnMethods="white")
  public void yellow() {
	  System.out.println("Yellow");
  }
  @Test
  public void green() {
	  System.out.println("Green");
  }
  @Test(dependsOnMethods="red")
  public void white() {
	  System.out.println("White");
	  Assert.assertTrue(false);
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After test");
  }

}
