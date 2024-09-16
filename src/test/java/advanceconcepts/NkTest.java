package advanceconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NkTest {
	
	
	WebDriver driver;
	
	@Test
	public void keyddddTest() {
	

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.get("https://practicetestautomation.com/practice-test-login/");
	
	
		
		
	WebElement wb=	driver.findElement(By.id("username"));
		
		wb.sendKeys("student");
		wb.sendKeys(Keys.CONTROL, "a");
		wb.sendKeys(Keys.CONTROL, "c");
		wb.sendKeys(Keys.CONTROL, "v");
		
		
		

		
		

	}
}
