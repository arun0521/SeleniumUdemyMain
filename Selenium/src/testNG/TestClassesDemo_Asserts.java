package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClassesDemo_Asserts {
	SomeClassToTest test  = new SomeClassToTest();
	@Test
	public void testMethod2() {
		System.out.println("ran--->Test Method 1");
		
		String value = test.addStrings("five", "four");
		String value1 = "five four";
		Assert.assertEquals(value, value1);
	}
	
	@Test
	public void atestMethod1() {
		System.out.println("ran--->Test Method 2");
		int num = 10;
		int num1 = test.sumNumbers(5, 5);
		
		Assert.assertEquals(num,num1);
		Assert.assertTrue(num1 == 11);
	}
	
	@Test
	public void testMethod3() {
		System.out.println("ran--->Test Method 3");
		int[] arrayValue = test.getArray();
		Assert.assertFalse(arrayValue[2] == 2);
	}
}
