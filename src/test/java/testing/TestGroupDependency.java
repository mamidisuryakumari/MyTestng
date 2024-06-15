package testing;

import org.testng.annotations.Test;

public class TestGroupDependency {
	@Test(groups = "smoke")
	public void test1() {
		System.err.println(5/0);
		System.out.println("smoke");
	}

	@Test(groups = "sanity")
	public void test2() {
		System.out.println("sanity");
	}

	
	@Test(groups = "regression")
	public void test3() {
		System.out.println("regression");
	}

	
	@Test(dependsOnGroups = "smoke")
	public void test() {
		System.out.println("smoke");
	}

}
