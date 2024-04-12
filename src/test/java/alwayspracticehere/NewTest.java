package alwayspracticehere;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class NewTest {
	
	
	
	
	
	
//if some pass some fail in assertion overall result ll be failed
	
	
	
	//pass
  @Test
  public void fTest() {
	  
	Assert.assertNotEquals("pragti", "tom"); 
	
  }
  
  

	//fail
  @Test
  public void fpTest() {
	  
	Assert.assertTrue(false);
  }
  

  

	//pass
  @Test
  public void fyTest() {
	
	  Assert.assertTrue(true);
	  }
  

	//fail
  @Test
  public void fiTest() {
	  Assert.assertEquals(4, 5);	  
	  }
  

	//pass
  @Test
  public void foTest() {
	  
	  Assert.assertNotEquals(7, 9);	 
	  }
  
 

}
