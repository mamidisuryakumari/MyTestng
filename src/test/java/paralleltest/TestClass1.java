package paralleltest;

import org.testng.annotations.Test;

public class TestClass1 {
	
	@Test
	public void parallelTestMethod1() {
		System.out.println("TestClass1 >> testMethod1 >> " +Thread.currentThread().threadId());
	}
	
	
	@Test
	public void parallelTestMethod2() {
		System.out.println("TestClass1 >> testMethod2 >> " +Thread.currentThread().threadId());
	}
	
	@Test
	
	public void parallelTestMethod3() {
		System.out.println("TestClass1 >> testMethod3 >> " +Thread.currentThread().threadId());
	}

	@Test
    public void parallelTestMethod33() {
		System.out.println("TestClass1 >> testMethod33 >> " +Thread.currentThread().threadId());
	}

    
}
