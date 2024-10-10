package alwayspracticehere;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class CrosssbrowserTest {

	WebDriver driver;

	@Parameters("browser")
	@Test
	public void fTest(String br) {

		if (br.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();
		} else if (br.equalsIgnoreCase("edge")) {

			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.google.com");

		boolean b = driver.getTitle().contains("Goo");
		Assert.assertTrue(b);

		boolean b1 = driver.getCurrentUrl().contains("goo");
		Assert.assertTrue(b1);

		boolean b2 = driver.getPageSource().contains("none");
		Assert.assertTrue(b2);

	}

}
