package dependsongroups;

import org.testng.annotations.Test;

public class Ne12Test {
  @Test(priority = 0)
  public void fTest() {
	  
	  
	  System.out.println("testng");
  }
  
  
  @Test(priority = 1, groups = "smoke")
  public void f44Test() {
	  
	  
	  System.out.println("c#");
  }
    	
  @Test(priority = 2, dependsOnGroups = "sanity")
  public void f1Test() {
	  
	  System.out.println("java");
  }
  
  
  @Test(priority = 3, dependsOnGroups = "smoke")
  public void f11Test() {
	  
	  System.out.println("c++");
  }
  
  /*
   * testng
   * c#
   * testng
   * java
   * c#
   * c++
   * 
   * 
   * 
   */
}
