package testNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertsDemo {
	SomeClassToTest test = new SomeClassToTest();
	SoftAssert soft = new SoftAssert();
	
	@Test
	public void testMethod() {
		int[] arrayValue = test.getArray();
		soft.assertEquals(2, arrayValue[1]);
		System.out.println("line 2");
		soft.assertEquals(2, arrayValue[2]);
		System.out.println("end");
		soft.assertAll();
		
	}
}
