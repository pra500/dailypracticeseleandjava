package alwayspracticehere;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class SeTest {
	
	
  @Test(groups= {"sanity"})
  public void fTest() {
	  
	  System.out.println("Meerut");
  }
  
	
  @Test(dependsOnGroups = {"sanity"})
  public void fuTest() {
	  System.out.println("Meerut1");
  }
    
	
  @Test
  public void fiiTest() {
	  System.out.println("Meerut2");
  }
  
  
  @BeforeClass
  public void beforeClass() {
	  
	  System.out.println("Meerut3");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Meerut4");
  }

}
