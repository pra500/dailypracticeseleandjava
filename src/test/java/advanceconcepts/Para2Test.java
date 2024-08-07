package advanceconcepts;

import org.testng.annotations.Test;

public class Para2Test {	
	
	
		
  @Test
  public void fTest() {
	  
	  System.out.println("first  | " + Thread.currentThread().getId());
	  
  }
  
        
  
  @Test
  public void f1Test() {
	  
	  System.out.println("second | " + Thread.currentThread().getId());
  }
}
