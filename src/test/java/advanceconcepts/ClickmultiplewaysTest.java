package advanceconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClickmultiplewaysTest {
	
	WebDriver driver;
  @Test
  public void fTest() {
	  
	  	  	  
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		
		
	
		//working fine below:
		//driver.get("https://practicetestautomation.com/practice-test-login/");		
		//driver.findElement(By.xpath("//button[@id='submit']")).sendKeys(Keys.ENTER);		
		//driver.findElement(By.xpath("//button[@id='submit']")).sendKeys(Keys.RETURN);
		
		
		
		//working fine below:
		driver.get("https://naveenautomationlabs.com/opencart/");
		//driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).sendKeys(Keys.RETURN);
		
  }
}
