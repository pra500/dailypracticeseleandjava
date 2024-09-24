package advanceconcepts;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentreportpracticeTest {
	
	
	
	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("rep1.html");
	
	
  @Test
  public void fTest() {
	  
	  ExtentTest et=extent.createTest("check the title")
		.assignAuthor("Pragti").assignCategory("sanity").assignDevice("IE"); 
			  
			  
			  
	  et.log(Status.PASS, "tgeeee");
	  et.info("ccc");
	  
  
  
  }
  
  
	
  @Test
  public void feeTest() {
	  
	  ExtentTest et=extent.createTest("check the title")
			  .assignAuthor("Pragti").assignCategory("sanity").assignDevice("Chrome"); 
	  et.log(Status.PASS, "tgeeee");
	  et.warning("the  welcome eee");
	  
	  
  
  
  }
  
	
  @Test
  public void ftttTest() {
	  
	  ExtentTest et=extent.createTest("check the title")
			  .assignAuthor("Parul").assignCategory("smoke").assignDevice("op"); 
	  et.log(Status.PASS, "tgeeee");
	  et.info("ccc");
	  et.warning("sampl");
	  et.log(Status.SKIP, "skipping");
	  et.fail("failing again");
	
	    
  
  }
	
  @Test
  public void foooTest() {
	  
	  ExtentTest et=extent.createTest("check the title")
			  .assignAuthor("Priya").assignCategory("reg").assignDevice("FF"); 
	  et.log(Status.PASS, "tgeeee");
	  et.info("ccc");
	  et.warning("the cccccccuuu");
	  et.log(Status.SKIP, "pppppppp");
	  et.log(Status.SKIP, "pppppppp1");
	  et.fail("failing again again");
	  et.fail("failing again1");
	  et.fail("failing again2");
	  
	  
  
  
	  
  }
 

  
  
  
  @BeforeTest
  public void setup()
  {
	  
	  extent.attachReporter(spark);
	  
  }
  
  
  
  @AfterTest
  public void teardown()
  {
	  
	  extent.flush();
	  
  }
  
  
}
