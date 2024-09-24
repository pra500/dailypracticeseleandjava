package dynamictable;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class SeleniumAutomation55est {
	
	WebDriver driver;
	
	
  @Test(priority = 0)
  public void fTest(){
	  /*
	 WebElement wb= driver.findElement(By.xpath("//table[@class='table table-striped mt-3']//tbody//tr[3]//td[1]"));
	String text=wb.getText();
	Assert.assertEquals(text, "Kierra");

	
	
	 boolean b=driver.findElement(By.xpath("//table[@class='table table-striped mt-3']//tbody//tr[3]//td[3]")).isDisplayed();
 
  System.out.println(b);
  */
  
  
  boolean b1=driver.findElement(By.xpath("//table[@class='table table-striped mt-3']//tbody//tr[3]//td[2][contains(text(), 'G')]")).isDisplayed();
  System.out.println(b1);
  
  
  

  //boolean b1=driver.findElement(By.xpath("//table[@class='table table-striped mt-3']//tbody//tr[3]//td[2][contains(text(), 'G')]")).isDisplayed();
  //System.out.println(b1);
  
  boolean b2=driver.findElement(By.xpath("//table[@class='table table-striped mt-3']//tbody//tr[3]//td[2][contains(text(), 'G') and contains(text(), 'e') and contains(text(), 'y')]")).isDisplayed();  
  System.out.println(b2);
  
  

  boolean b4=driver.findElement(By.xpath("//table[@class='table table-striped mt-3']//tbody//tr[3]//td[2][contains(text(), 'G') and contains(text(), 'e')]")).isDisplayed();  
  System.out.println(b4);
  
  
  
  boolean b5=driver.findElement(By.xpath("//table[@class='table table-striped mt-3']//tbody//tr[4]//td[5]")).isDisplayed();
  
  System.out.println(b5);
  
  
  
  
  }
  
  
  
  //total no of rows
  @Test(priority = 1)
  public void getTest(){
	  
	  List<WebElement>list=driver.findElements(By.xpath("//table[@class='table table-striped mt-3']//tbody//tr"));
	
	 int t= list.size();
	  if(t==5)
	  {
		  System.out.println("correct ans");
	  }
	  else
	  {
		  System.out.println("wrong ans");
		  
	  }
	  
	  
	  
	
  }
  
  
  
  //total no of columns
  @Test(priority = 2)
  public void gettTest(){
	  
	  List<WebElement>list=driver.findElements(By.xpath("//table[@class='table table-striped mt-3']//tbody//td"));
	
	 int t= list.size();
	  if(t==35)
	  {
		  System.out.println("correct ans");
	  }
	  else
	  {
		  System.out.println("wrong ans");
		  
	  } 
	  
	  
	
  }
 
  
  
  @Test(priority = 3)
  public void getteTest(){
	  
	  /*
	 boolean b= driver.findElement(By.xpath("(//table[@class='table table-striped mt-3']//tbody//td[2][contains(text(), 'Can')])[1]")).isDisplayed();
  System.out.println(b);
  
  
  boolean b1= driver.findElement(By.xpath("//table[@class='table table-striped mt-3']//tbody//tr//td[7]//a[1]")).isDisplayed();
  System.out.println(b1);
  
  
  
  boolean b2= driver.findElement(By.xpath("//table[@class='table table-striped mt-3']//tbody//tr//td[7]//a[2]")).isDisplayed();
  System.out.println(b2);
  */
  
   List<WebElement>list=driver.findElements(By.xpath("//table[@class='table table-striped mt-3']//tbody//tr//td[7]//a[2]"));
   System.out.println(list.size());
   
   
     
   
   String s= driver.findElement(By.xpath("//table[@class='table table-striped mt-3']//thead//tr//th[3]")).getText();
   System.out.println(s);
   		
   
   
   
   String s1= driver.findElement(By.xpath("//table[@class='table table-striped mt-3']//thead//tr//th[1]")).getText();
   System.out.println(s1); 
    
  
  }
  
 

 
  

  @BeforeClass
  public void beforeClass() {
	  
	  driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
