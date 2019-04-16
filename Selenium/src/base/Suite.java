package base;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

public class Suite {
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("\nTestNG_Suite-> This runs once before class suite");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("\nTestNG_Suite -> This runs once after class suite");
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("\nTestNG_Suite -> before test suite");
  }
  
  @AfterTest
  public void afterTest() {
	  System.out.println("\nTestNG_Suite -> after test suite");
  }

  @BeforeSuite
  public void beforeSuite() {
	  
	  System.out.println("\nTestNG_TestClass1 -> This runs once before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  
	  System.out.println("\nTestNG_TestClass1 -> This runs once after suite");
  }

}
