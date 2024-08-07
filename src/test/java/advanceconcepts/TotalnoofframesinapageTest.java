package advanceconcepts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class TotalnoofframesinapageTest {
	
	

	WebDriver driver;
		
	
	
  @Test
  public void fTest() {
	  
	List<WebElement>list=driver.findElements(By.xpath("//iframe | //frame"));
	System.out.println(list.size());   //2
	
	
	
  }
  @BeforeClass
  public void beforeClass() {
	  driver=new ChromeDriver();		
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			//driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			
			
			driver.get("https://www.makemytrip.com/");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
