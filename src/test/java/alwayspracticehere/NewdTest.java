package alwayspracticehere;

import org.testng.annotations.Test;

public class NewdTest {
  @Test(priority = -1)
  public void start() {
	  
	  System.out.println("hello");
  }
  
  
  
  @Test(priority = 0)
  public void ala() {
	  
	  System.out.println("hello  hll");
  }
  
  
  @Test(priority = 1)
  public void betaa() {
	  
	  System.out.println("hello     111");
  }
}
