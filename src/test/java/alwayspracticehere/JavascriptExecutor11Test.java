package alwayspracticehere;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class JavascriptExecutor11Test {

	WebDriver driver;

	@Test
	public void fTest() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(120,230)", "");

		js.executeScript("document.getElementById('search').value='mac'");

		js.executeScript("document.getElementsByName('search').value='laptop'");

		js.executeScript("document.getElementsByClassName('form-control input-lg').checked=true;");
		
	
		
		
		

	}

	@Test
	public void fiiTest() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement wb = driver.findElement(By.id("search"));
		js.executeScript("arguments[0].click();", wb);

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
