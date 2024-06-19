package alwayspracticehere;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Javascriptexe4Test {

	WebDriver driver;

	@Test
	public void fTest() {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("document.getElementById('search').value='laptop'");

		js.executeScript("document.getElementsByName('search').value='mac'");

	}

	@Test
	public void flTest() {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("document.getElementById('search').value='desktop'");

	}

	@Test
	public void fllTest() {

		List<WebElement> l = driver.findElements(By.tagName("a"));
		int size = l.size();
		Assert.assertEquals(73, size);

	}

	@BeforeClass
	public void beforeClass() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://naveenautomationlabs.com/opencart/");
	}

	@AfterClass
	public void afterClass() {

		driver.close();

	}

}
