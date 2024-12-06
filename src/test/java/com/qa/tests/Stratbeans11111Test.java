package com.qa.tests;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Stratbeans11111Test {

	// url
	// title
	// current window id
	// click on book a demo
	// hover on solutions, learning mgmt system click
	// click on privacy policy
	// careers click
	// broken links/image
	// logo verified
	// ai services click

	// run by testng.xml

	WebDriver driver;

	@Test(priority = 0)
	public void urlTest() {

		String url = driver.getCurrentUrl();
		System.out.println(url);

	}

	@Test(priority = 1)
	public void titleTest() {

		String title = driver.getTitle();
		System.out.println(title);

	}

	@Test(priority = 2)
	public void getwindowidTest() {

		String windowid = driver.getWindowHandle();
		System.out.println(windowid);

	}

	@Test(priority = 3)
	public void clickonbookdemoTest() {

		try {

			driver.findElement(By.xpath(
					"//a[@class='modal-menu-item tt_button tt_primary_button btn_primary_color default_header_btn']"))
					.click();

			driver.findElement(By.xpath("//div[@id='wpcf7-f5208-p5758-o1']//input[@placeholder='Your name']"))
					.sendKeys("tejas");

			//WebElement wb = driver.findElement(By.xpath("(//span[@class='wpcf7-form-control-wrap'])[2]"));
			
			
			WebElement wb = driver.findElement(By.xpath("(//div[@class='selected-flag'])[1]"));
			Select sel = new Select(wb);
			sel.selectByVisibleText("India");

			driver.findElement(By.xpath("//input[@placeholder='Contact Number'])[1]")).sendKeys("9098789900");
			driver.findElement(By.xpath("(//input[@name='your-company'])[1]")).sendKeys("TCS");

			driver.findElement(By.xpath("//input[@name='Your Email']")).sendKeys("prga899@gmail.com");

			WebElement hear = driver.findElement(
					By.xpath("(//select[@class='wpcf7-form-control wpcf7-select wpcf7-validates-as-required'])[1]"));
			Select sel1 = new Select(hear);
			sel.selectByVisibleText("Reddit");

			WebElement product = driver.findElement(
					By.xpath("(//select[@class='wpcf7-form-control wpcf7-select wpcf7-validates-as-required'])[2]"));
			Select sel2 = new Select(product);
			sel2.selectByVisibleText("Articulate");

			driver.findElement(By.xpath("(//textarea[@placeholder='What are your requirements?'])[1]"))
					.sendKeys("basic java course");

			driver.findElement(By.xpath("(//input[@value='Send message'])[1]")).click();

		}

		
		
		catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			System.out.println("demo booked done");
		}

	}

	
	
	
	
	
	//broken links	
	@Test
	public void privacypolicyTest() {

		
	
		
		
		
		
		
	}

	
	
	
	//broken images
	@Test
	public void sedTest() {

	}

	
	//
	@Test
	public void fkkTest() {

	}

	// @Test
	public void solutionsTest() {

	}

	@BeforeClass
	public void beforeClass() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://stratbeans.com/");
	}

	@AfterClass
	public void afterClass() {

		driver.close();
	}

}
