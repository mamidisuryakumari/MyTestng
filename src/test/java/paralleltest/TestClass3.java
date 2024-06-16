package paralleltest;

import org.testng.annotations.Test;

public class TestClass3 {
	
	
	@Test
	public void testMethod7() {
		System.out.println("TestClass3 >> testMethod7 >> " +Thread.currentThread().threadId());
	}
	
	@Test
	public void testMethod8() {
		System.out.println("TestClass3 >> testMethod8 >> " +Thread.currentThread().threadId());
	}
	
	@Test
	public void testMethod9() {
		System.out.println("TestClass3 >> testMethod9  >> " +Thread.currentThread().threadId());
	}
	
	@Test
	public void testMethod10() {
		System.out.println("TestClass3 >> testMethod10 >> " +Thread.currentThread().threadId());
	}
}
