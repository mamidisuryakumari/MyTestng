package screenshot;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;



public class TestClass extends BaseTest{
	@Test(testName = "TestGoogle")
	public void TestGoogle() throws Exception {
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("HYR Tutorials", Keys.ENTER);
		String expectedTitle = "HYR Tutorials - Google Searchbb";
		String actualTitle = driver.getTitle();
		assertEquals(actualTitle, expectedTitle, "Title is mismatched");
	}
	
}
