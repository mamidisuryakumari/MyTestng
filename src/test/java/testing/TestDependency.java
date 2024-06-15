package testing;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestDependency {
	@Ignore
	@Test
	public void createShipment() {
		System.out.println(4/0);
		System.out.println("createShipment");
	}

	@Test(dependsOnMethods = {"createShipment"},alwaysRun = true)
	public void trackShipment() {
		System.out.println("trackShipment");
	}

	@Test
	public void cancelShipment() {
		System.out.println("cancelShipment");
	}
}
