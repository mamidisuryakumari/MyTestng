package grouptests;

import org.testng.annotations.Test;

public class Test2 {

	
	
		@Test(groups = {"sanity"})
		public void testMethod4() {
			System.out.println("testMethod4");
		}
		@Test(groups = {"functional","sanity"})
		public void testMethod5() {
			System.out.println("testMethod5");
		}
		@Test
		public void testMethod6() {
			System.out.println("testMethod6");
		}
}
