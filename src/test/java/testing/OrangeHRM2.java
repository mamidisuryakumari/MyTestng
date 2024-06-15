package testing;

import static org.testng.Assert.assertListContainsObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OrangeHRM2 {

	@Test(dataProvider = "loginData")
	public void testLogin(String userName, String Password) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys(userName);
		driver.findElement(By.name("password")).sendKeys(Password);
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}

	@DataProvider

	public Object[][] loginData() {
		Object[][] data = new Object[2][2];
		data[0][0] = "Admin";
		data[0][1] = "admin123";
		return data;
	}

}
