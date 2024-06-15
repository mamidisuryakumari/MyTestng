package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHRM1 {

	@Test(dataProvider = "getData",dataProviderClass = ExcelDataSuppllier.class)
	public void testLogin(String userName,String Password) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys(userName);
		driver.findElement(By.name("password")).sendKeys(Password);
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		driver.quit();
	}
}
