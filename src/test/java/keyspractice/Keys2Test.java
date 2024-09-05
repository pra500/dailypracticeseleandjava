package keyspractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Keys2Test {
	

	 WebDriver driver;		
	
	 

  
  
  
  
	 
@Test
public void getTest() throws InterruptedException {
	  
	Thread.sleep(8000);	

	// Identify the first input box with xpath locator
	WebElement e = driver.findElement(By.id("username"));

	// enter some text
	e.sendKeys("Selenium");

	// Identify the second input box with xpath locator
	WebElement s = driver.findElement(By.id("password"));

	// copy text from first input box then paste to second input box
	e.sendKeys(Keys.CONTROL, "a");
	e.sendKeys(Keys.CONTROL, "c");

	// paste to second input box
	s.sendKeys(Keys.CONTROL, "v");

	  
}
  



@Test
public void get1Test() throws InterruptedException {
 
Thread.sleep(8000);	



WebElement e =  driver.findElement(By.xpath("//input[@id='username']"));
e.sendKeys("Tom");
e.sendKeys(Keys.CONTROL, "a");
e.sendKeys(Keys.CONTROL, "c");

Thread.sleep(5000);	
e.sendKeys(Keys.TAB);



WebElement s=  driver.findElement(By.xpath("//input[@id='password']"));
s.sendKeys(Keys.CONTROL, "v");

 
}



@Test
public void get2Test() throws InterruptedException {
 
Thread.sleep(8000);	




WebElement e =  driver.findElement(By.xpath("//input[@id='username']"));
e.sendKeys("Tom");
e.sendKeys(Keys.CONTROL, "a");
e.sendKeys(Keys.CONTROL, "c");

Thread.sleep(5000);	
e.sendKeys(Keys.TAB);



WebElement s=  driver.findElement(By.xpath("//input[@id='password']"));
s.sendKeys(Keys.CONTROL, "v");

Thread.sleep(5000);	
s.sendKeys(Keys.TAB);



Thread.sleep(5000);	
s.sendKeys(Keys.TAB);
Thread.sleep(5000);

s.sendKeys(Keys.TAB);
Thread.sleep(5000);




 
}

  
  

@Test
public void get3Test() throws InterruptedException {
	
	//ctrl+tab practice:
		
	
driver.get("https://www.testyou.in/Login.aspx");

WebElement e =  driver.findElement(By.xpath("//input[@id='ctl00_CPHContainer_txtUserLogin']"));

e.sendKeys("Tom123@gmail.com");

Thread.sleep(5000);	

//e.sendKeys(Keys.CONTROL, Keys.TAB);


//ctrl+tab+enter:

e.sendKeys(Keys.CONTROL, Keys.TAB, Keys.ENTER);
}

  
  

@Test
public void get4Test() throws InterruptedException {
	
	
	driver.get("https://freelance-learn-automation.vercel.app/login");
	
	WebElement e =  driver.findElement(By.xpath("//input[@id='email1']"));
	
	
	e.sendKeys("Tom123333@gmail.com");	
	e.sendKeys(Keys.CONTROL, "a");
	e.sendKeys(Keys.CONTROL, "c");
	
	Actions act=new Actions(driver);
	
	
	
	WebElement s =  driver.findElement(By.xpath("//input[@id='password1']"));
	
	s.sendKeys(Keys.CONTROL, "v");

	Thread.sleep(5000);	
	s.sendKeys(Keys.TAB);



	Thread.sleep(5000);	
	act.sendKeys(Keys.TAB);
	Thread.sleep(5000);
	
	

	act.sendKeys(Keys.TAB);
	Thread.sleep(5000);
	
	
	
	
	
}


  @BeforeClass
  public void beforeClass() {
	  
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://practicetestautomation.com/practice-test-login/");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
}
