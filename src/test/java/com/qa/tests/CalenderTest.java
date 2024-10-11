package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalenderTest {

	WebDriver driver;

	@Test
	public void fTest() {

		driver.findElement(By.xpath("//input[@id='datetimepicker1']")).click();

		driver.findElement(By
				.xpath("(//div[@class='flatpickr-days']//div[@class='dayContainer'])[1]//span[contains(text(), '12')]"))
				.click();

	}

	@BeforeClass
	public void beforeClass() {

		driver = new ChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.get("https://www.tutorialspoint.com/selenium/practice/date-picker.php");
	}

	@AfterClass
	public void afterClass() {
		driver.close();

	}

}
