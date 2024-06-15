package grouptests;

import org.testng.annotations.Test;

public class Test1 {
	@Test(groups = { "smoke"})
	public void testMethod1() {
		System.out.println("testMethod1");
	}
	@Test
	public void testMethod2() {
		System.out.println("testMethod2");
	}
	@Test(groups ={"sanity","smoke"})
	public void testMethod3() {
		System.out.println("testMethod3");
	}
}
