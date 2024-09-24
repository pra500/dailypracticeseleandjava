package techlistic;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.WebElement;

import java.util.*;

public class techlisticTest {
		
	
	
	
	
	
	WebDriver driver;
	
	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("mone.html");
	
	
	
  @Test
  public void fijTest() {
	  
	  List<WebElement>list= 	driver.findElements(By.xpath("//table[@id='customers']//tbody//tr"));
	
	for(int i=0;i<=list.size()-1;i++)
	{
		if(list.get(i).getText().equalsIgnoreCase("Adobe"))
		{
			break;
			
		}
		
		
	}
	
	extent.createTest("the title").assignCategory("sanity").assignDevice("edge");
	
  }
  
  
	 
  
  @Test
  public void gklfTest() {
	  
	  List<WebElement>list= driver.findElements(By.xpath("//table[@id='customers']//tbody//td"));
		
		 int size= list.size();
		 
		 System.out.println(size);
		 
		 extent.createTest("the url").assignCategory("sanity").assignDevice("ie");
		 
  }
  
  
	
  @Test
  public void fllTest() {
	  
	  List<WebElement>list= driver.findElements(By.xpath("//table[@id='customers']//tbody//tr"));
	  
	  for(int i=0;i<=list.size()-1;i++)
		{
		  System.out.println( list.get(i).getText());
		
		  
		  
		}
  }
  
  
	
  @Test
  public void fTest() {
	  
	  driver.findElement(By.xpath("//table[@id='customers']//tbody//tr[3]//td[1]//span")).isDisplayed();
	  	
	  
	
	  
	 }
  
	
  @Test
  public void fll6Test() {
	 
	  System.out.println(driver.getPageSource());
	
  }
  
	
  @Test
  public void fooTest() {
	  
	  System.out.println(driver.getPageSource());
  }
  
  
  
  @Test
  public void foo7Test() {
	  
	  System.out.println(driver.getPageSource());
  }
  
  
  
  @Test
  public void foouTest() {
	  System.out.println(driver.getPageSource());
  }
  
  
  @Test
  public void fooolTest() {
	  
	  System.out.println(driver.getPageSource());
  }
  
  
  
  @Test
  public void fooyTest() {
	  
	 
	System.out.println(driver.getCurrentUrl());  
	 // driver.getCurrentUrl();
}
  
  
  
  @BeforeClass
  public void beforeClass() {
	  
	    driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
	  	
		
		
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }
  
  @BeforeTest
  public void d()
  {
	  extent.attachReporter(spark);

  }
  
  
  @AfterTest
  public void dee()
  {
	  extent.flush();
	  
  }

}
