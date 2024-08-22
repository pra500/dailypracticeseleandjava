package debuggingprac;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class NewTest {
	
	
	
	
	WebDriver driver;
	
	
	
	
	  @Test
	  public void feTest() {
		  
		  driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("apple", Keys.ENTER);
		  
		String title=driver.getTitle();
		
		Assert.assertEquals(title, "Search - apple");	  
		  
	  }

	  @Test
	  public void feeTest() {
		  
		  driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("apple", Keys.ENTER);
		  
		String title=driver.getTitle();
		
		Assert.assertEquals(title, "Search - apple");	  
		  
	  }
	  

	  @Test
	  public void feeeTest() {
		  
		  driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("apple", Keys.ENTER);
		  
		String title=driver.getTitle();
		
		Assert.assertEquals(title, "Search - apple");	  
		  
	  }

	  @Test
	  public void feeeeTest() {
		  
		  driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("apple", Keys.ENTER);
		  
		String title=driver.getTitle();
		
		Assert.assertEquals(title, "Search - apple");	  
		  
	  }
	  

	  @Test
	  public void feeeeeTest() {
		  
		  driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("apple", Keys.ENTER);
		  
		String title=driver.getTitle();
		
		Assert.assertEquals(title, "Search - apple");	  
		  
	  }
	  

	  @Test
	  public void fqTest() {
		  
		  driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("apple", Keys.ENTER);
		  
		String title=driver.getTitle();
		
		Assert.assertEquals(title, "Search - apple");	  
		  
	  }

	  @Test
	  public void fqqTest() {
		  
		  driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("apple", Keys.ENTER);
		  
		String title=driver.getTitle();
		
		Assert.assertEquals(title, "Search - apple");	  
		  
	  }
	  

	  @Test
	  public void fwwTest() {
		  
		  driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("apple", Keys.ENTER);
		  
		String title=driver.getTitle();
		
		Assert.assertEquals(title, "Search - apple");	  
		  
	  }

	  @Test
	  public void fTest() {
		  
		  driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("apple", Keys.ENTER);
		  
		String title=driver.getTitle();
		
		Assert.assertEquals(title, "Search - apple");	  
		  
	  }
	  

	  @Test
	  public void fqqqqqTest() {
		  
		  driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("apple", Keys.ENTER);
		  
		String title=driver.getTitle();
		
		Assert.assertEquals(title, "Search - apple");	  
		  
	  }

	  @Test
	  public void fqqqq55Test() {
		  
		  driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("apple", Keys.ENTER);
		  
		String title=driver.getTitle();
		
		Assert.assertEquals(title, "Search - apple");	  
		  
	  }
	  

	  @Test
	  public void fqq224Test() {
		  
		  driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("apple", Keys.ENTER);
		  
		String title=driver.getTitle();
		
		Assert.assertEquals(title, "Search - apple");	  
		  
	  }
	  

	  @Test
	  public void faqq1111Test() {
		  
		  driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("apple", Keys.ENTER);
		  
		String title=driver.getTitle();
		
		Assert.assertEquals(title, "Search - apple");	  
		  
	  }

	  @Test
	  public void fww333Test() {
		  
		  driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("apple", Keys.ENTER);
		  
		String title=driver.getTitle();
		
		Assert.assertEquals(title, "Search - apple");	  
		  
	  }
	  

	  @Test
	  public void f000Test() {
		  
		  driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("apple", Keys.ENTER);
		  
		String title=driver.getTitle();
		
		Assert.assertEquals(title, "Search - apple");	  
		  
	  }
	  

	  @Test
	  public void f666Test() {
		  
		  driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("apple", Keys.ENTER);
		  
		String title=driver.getTitle();
		
		Assert.assertEquals(title, "Search - apple");	  
		  
	  }

	  @Test
	  public void f444Test() {
		  
		  driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("apple", Keys.ENTER);
		  
		String title=driver.getTitle();
		
		Assert.assertEquals(title, "Search - apple");	  
		  
	  }

	  @Test
	  public void f333Test() {
		  
		  driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("apple", Keys.ENTER);
		  
		String title=driver.getTitle();
		
		Assert.assertEquals(title, "Search - apple");	  
		  
	  }

	  @Test
	  public void f005tyTest() {
		  
		  driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("apple", Keys.ENTER);
		  
		String title=driver.getTitle();
		
		Assert.assertEquals(title, "Search - apple");	  
		  
	  }
	  

	  @Test
	  public void f33ghTest() {
		  
		  driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("apple", Keys.ENTER);
		  
		String title=driver.getTitle();
		
		Assert.assertEquals(title, "Search - apple");	  
		  
	  }

	  @Test
	  public void fwwwwTest() {
		  
		  driver.findElement(By.xpath("//input[@placeholder='Search2']")).sendKeys("apple", Keys.ENTER);
		  
		String title=driver.getTitle();
		
		Assert.assertEquals(title, "Search - apple");	  
		  
	  }
	  
  @BeforeClass
  public void beforeClass() {
	  
	     
	    driver=new ChromeDriver();	  
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
