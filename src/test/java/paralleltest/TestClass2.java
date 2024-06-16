package paralleltest;

import org.testng.annotations.Test;

public class TestClass2 {
	@Test
	public void parallelTestMethod4() {
		System.out.println("TestClass2 >> testMethod4 >> " +Thread.currentThread().threadId());
	}
	
	
	@Test
	public void parallelTestMethod5() {
		System.out.println("TestClass2 >> testMethod5 >> " +Thread.currentThread().threadId());
	}
	
	@Test
	
	public void parallelTestMethod6() {
		System.out.println("TestClass2 >> testMethod6 >> " +Thread.currentThread().threadId());
	}
    
}


