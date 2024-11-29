package alwayspracticehere;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class YatraeeTest {

	WebDriver driver;

	@BeforeClass
	public void beforeClass() {

		ChromeOptions co = new ChromeOptions();		
		co.addArguments("disable-notifications");
		
		
		driver = new ChromeDriver(co);

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.yatra.com/");

		

	}

	@Test(priority = 0)
	public void urlTest() {

		String url = driver.getCurrentUrl();

		Assert.assertEquals(url, "https://stratbeans.com/");

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

}
