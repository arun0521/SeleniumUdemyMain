package junitexample;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("test first before class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("test after class");
	}
	

	@Before
	public void setUp() throws Exception {
		System.out.println("test before test method");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("test after test method");
	}

	
	
	@Test
	public void test() {
		System.out.println("firstTest");
	}

	@Test
	public void test1() {
		System.out.println("secondTest");
	}
	
	

}
