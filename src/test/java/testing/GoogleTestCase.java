package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GoogleTestCase {
	WebDriver driver;

	@Parameters("browserName")
	@BeforeTest
	public void initialization(@Optional("chrome") String browserName) {
		switch (browserName) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		default:
			System.out.println("browser name is invalid");
			break;
		}

		driver.manage().window().maximize();
	}

	@AfterTest
//	public void close() {
//		driver.quit();
//	}
	@Parameters("url")
	@Test
	public void launchApp(String url) {
		driver.get(url);

	}

}
