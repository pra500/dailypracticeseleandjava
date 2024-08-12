package listenerpractice1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(Listener66.class)
public class NewTest extends Listener66 {
	
WebDriver driver;

	
@Test
public void fTest() {
  
 	 System.out.println(driver.getClass());
  
}


@Test
public void jfTest() {
  
 	 System.out.println(driver.getTitle());
  
}

@Test
public void fkkTest() {
  
 	 System.out.println(driver.getWindowHandles());
  
}

@BeforeClass
public void beforeClass() {

    driver=new ChromeDriver();	  
    driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://practicetestautomation.com/practice-test-login/");
}

@AfterClass
public void afterClass() {
  
  driver.close();
}


}
