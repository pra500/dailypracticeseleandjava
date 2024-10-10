package alwayspracticehere;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class KKKTest {
	
	
	WebDriver driver;
	
	
  @Test
  public void fTest() {
	  
	 
	  
  
	  
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		
	
		driver.findElement(By.xpath("//li[@id='menu-item-51137']//a[normalize-space()='Home']")).sendKeys(Keys.RETURN);
		
	
		driver.findElement(By.xpath("//li[@id='menu-item-6898']//a[normalize-space()='CheatSheets']")).sendKeys(Keys.ENTER);
		
String sr=driver.getWindowHandle();

System.out.println(sr);
		
		
		
		
  }
}
