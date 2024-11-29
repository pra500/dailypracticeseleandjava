package alwayspracticehere;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class NewhhTest {

	/*
	 * 
	 * 
	 * 
	 * swiggy site
	 * 
	 * @author Pragti
	 * 
	 */
	WebDriver driver;

	@Test
	public void fkmmm7Test() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(300, 400)", "");

		driver.findElement(By.xpath("//div[contains(text(),'Sort By')]")).click();

		driver.findElement(By.xpath("//label[@for='Sort-2']")).click();

		driver.findElement(By.xpath("//img[@alt='restaurants curated for pizza']")).click();

		driver.findElement(By.xpath("//img[@alt='restaurants curated for pizza']")).click();

		driver.findElement(By.xpath("//div[normalize-space()='Dineout']")).click();

		
		boolean b = driver.findElement(By.xpath("//div[normalize-space()='Dineout']")).isDisplayed();
		Assert.assertTrue(b);
		

	}

	@BeforeClass
	public void beforeClass() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.swiggy.com/");

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

}
