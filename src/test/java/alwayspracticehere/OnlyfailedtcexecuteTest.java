package alwayspracticehere;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OnlyfailedtcexecuteTest {
	
	
  @Test
  public void fTest() {
	  
	  Assert.assertEquals(5,  8);
	  
  }
  
  
  @Test
  public void ufTest() {
	  Assert.assertEquals(5,  8);
  }
  
  
  @Test
  public void foTest() {
	  Assert.assertTrue(true);
	  
  }
  
  @Test
  public void fkkTest() {
	  
	  Assert.assertTrue(false);
	  
  }
  
  
  
  
  

}
