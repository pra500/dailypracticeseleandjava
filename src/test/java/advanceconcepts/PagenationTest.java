package advanceconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PagenationTest {
	
	WebDriver driver;
	
	
  @Test
  public void fTest() {
	  
	  //   #exampleTable > thead >tr > th > 
	  
	  driver.findElement(By.xpath("//button[@class='btn btn-link datatable-pagination-button datatable-pagination-right ripple-surface-dark']))"));
	  
	  
  }
  
  
  

  
  @BeforeClass
  public void beforeClass() {
	  
	  
	    driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://mdbootstrap.com/docs/standard/data/datatables/");
	  
	  
	  
  }

  @AfterClass
  public void afterClass() {
	  
	  
	  driver.close();
  }


}
