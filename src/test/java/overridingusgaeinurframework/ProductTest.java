package overridingusgaeinurframework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class ProductTest extends Base{
	
	public WebDriver driver;
	public ProductTest()
	{
		super();
	}
	
  @Test
  public void fTest() {
	  
	  System.out.println(driver.getTitle());
	 
  }
  @BeforeClass
  public void beforeClass() {
	  Base.getdriverlaunch();
  }

  @AfterClass
  public void afterClass() {
	  
	  Base.getdrivershut();
  }

}
