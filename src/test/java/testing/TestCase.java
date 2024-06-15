package testing;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase {
	@Test
	public void testCaseGoogle() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Hyr tutorials",Keys.ENTER);
		String expectedValue ="Hyr tutorials -Google Search";
		String actualValue =driver.getTitle();
		assertEquals(expectedValue,actualValue);
		driver.quit();
	}

	@Test
	public void testCaseFacebook() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("kumari@gmail.com",Keys.ENTER);
		
		SoftAssert softAssert =new SoftAssert();
		//url
		String actualUrl =driver.getCurrentUrl();
		String expectedUrl = "www.facebook.com";
		softAssert.assertEquals(actualUrl, expectedUrl,"url is mismatched" );
		
		//title
		String actualTitle =driver.getTitle();
		String expectedTitle = "Log into facebook";
		softAssert.assertEquals(actualTitle, expectedTitle,"title is mismatched");
        driver.quit();
        softAssert.assertAll();
	}
}
