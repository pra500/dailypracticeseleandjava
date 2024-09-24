package alwayspracticehere;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extentrep5Test {
	
	WebDriver driver;	
	
	
	
	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("mm.html");


	
  @Test
  public void fTest() {
	    String url=driver.getCurrentUrl();
	    System.out.println(url);
	    
	   
	    extent.createTest("url").assignCategory("smoke").assignDevice("IE");
	   
	   
	    
  }
  
  @Test
  public void feTest() {
	    String title=driver.getTitle();
	    System.out.println(title);    
	    
	    
	    extent.createTest("title").assignCategory("sanity").assignDevice("Chrome");
	 
  }
  
  
  
 
  
  
  @BeforeTest
  public void beforeClass() {
	  
	  
	    driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://mdbootstrap.com/docs/standard/data/datatables/");
		
		extent.attachReporter(spark);
	  
	  
  }
  
  

  @AfterTest
  public void afterClass() {
	  
	  
	 extent.flush();
	 driver.close();
	 }
  
}
