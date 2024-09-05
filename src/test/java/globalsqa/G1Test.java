package globalsqa;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class G1Test {
	
	
	
	WebDriver driver;
	
	
	/*
	
	
	// @Test(priority = 1)
	      public void ClickonABOUTandokpennewTabTest(){
	    	 
	    	 
	    	 driver.findElement(By.xpath("//li[@id='menu-item-53896']//a[normalize-space()='About']")).click();
	    	 
	    	 
	    	 JavascriptExecutor js=(JavascriptExecutor)driver;
	    	 js.executeScript("window.scrollBy(250, 230)", "");
	    	 
	    	 
	    	 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(6000));
	    	 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[@id='menu-item-2815']//a[normalize-space()='Frames And Windows']"))).click();
	    	 
	    	 
	    	//ul[@id='menu-miscellaneous-1']//a[normalize-space()='Frames And Windows']
	    	 
	    	 //driver.findElement(By.xpath("//li[@id='menu-item-2815']//a[normalize-space()='Frames And Windows']")).click();
	    	 
	    	 
	    	 
	    	 
	    	 driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//a[@class='button e.g. button_hilite button_pale small_button'][normalize-space()='Click Here']")).click();
	    	 driver.switchTo().newWindow(WindowType.TAB);
	    	 
	    	 
	    	 
	    	 
	    	boolean b= driver.findElement(By.xpath("//a[@title='Frames And Windows']//span[contains(text(),'Frames And Windows')]")).isDisplayed();
	    	 
	    	 Assert.assertTrue(b);
	    	 
	    	 driver.close();	    	     	 
	    	 
	    	 	    	     	 
	     }    
	         
	     
	  
	     
	     
		 // @Test(priority = 2, dependsOnMethods = {"ClickonABOUTandokpennewTabTest"})
	      public void ClickonOpenNewTabTest(){
			 
			 
	    	     	 
	    	 driver.findElement(By.xpath("//li[@id='iFrame']")).click();
	    	 
	    	 
	    	 driver.switchTo().frame("iFrame");
	    	 
	    	 
	    	 
	    boolean b=driver.findElement(By.xpath("//div[@class='row portfolio_section']//div[@class='sixteen columns']")).isDisplayed();
	    
	     Assert.assertTrue(b);
	     
	     
	     boolean flag=driver.findElement(By.xpath("(//a[normalize-space()='CheatSheets'])[1]")).isDisplayed();
	     Assert.assertTrue(flag);	        
	     
	     
	     } 
	 */     
	     
	     
	     
	    /*  
	      @Test(priority = 1)
	      public void Clickonabout(){
	    
	    	  driver.findElement(By.xpath("//li[@id='menu-item-53896']//a[normalize-space()='About']")).click();
	    	  
	    	  
	    	//boolean flag=driver.getTitle().contains("About");
	    	//Assert.assertTrue(flag);	
	    	
	    	
	    	  
	    	//String title=driver.getTitle();	    	
	    	//Assert.assertEquals(title, "About - GlobalSQA");
	    	
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(230, 220)", "");
			
			
			driver.findElement(By.xpath("(//a[normalize-space()='Toolbar'])[3]")).click();
		
			
			
			WebElement wb=driver.findElement(By.xpath("//pre[@id='page']"));	
			
			js.executeScript("arguments[0].scrollIntoView();", wb);
			
			
	    	  
	      }
	 */
	
	//y'day work need to chk		
	//*******************
	
	
	  //@Test(priority = 1)
      public void C1Test(){
		  
		  driver.manage().deleteAllCookies();
		  
		  driver.findElement(By.xpath("(//a[text()='About'])[1]")).click();
		  
	//boolean b=	  driver.findElement(By.xpath("//div//h1[text()='About']")).isDisplayed();
	//Assert.assertT(b);	
	  }
	  
	  
	  
	  
	  //@Test(priority = 2, dependsOnMethods = {"C1Test"})
      public void C2Test(){
		  
		 // driver.manage().deleteAllCookies();
		  
		  		 
		  driver.findElement(By.xpath("//a[@class='no_border'][normalize-space()='Free Ebooks']")).click();
		  driver.findElement(By.xpath("(//a[normalize-space()='Free Ebooks'])[1]")).click();
		  driver.findElement(By.xpath("//a[text()='Load More']")).click();
		  
		  
		  try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		  boolean b=	   driver.findElement(By.xpath("//h2[text()='Corporate Trainings']")).isDisplayed();
		  Assert.assertTrue(b);	
	  
	  }

	 //@Test(priority = 3)
      public void ContactformTest(){
		 
		 
		 
		 driver.findElement(By.xpath("//li[@id='menu-item-1561']//a[normalize-space()='Contact Us']")).click();
		 
		 driver.findElement(By.id("comment_name")).sendKeys("Tim");
		 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Tim11@gmail.com");
		 driver.findElement(By.xpath("//input[@id='subject']")).sendKeys("formrrrr");
		 driver.findElement(By.xpath("//textarea[@id='comment']")).sendKeys("others");
		 
		
		 driver.findElement(By.xpath("//input[@id='submit']")).click();
		
		 boolean b=driver.findElement(By.xpath("//div[@class='warning_msg closable']")).isDisplayed();
		 System.out.println(b);
		 
		 		
		
	 
	 }

	 
	 //@Test(priority = 4, dependsOnMethods = {"ContactformTest"})
     public void ContactInfoTest(){
		 
		 driver.findElement(By.xpath("//span[text()='Contact Info']")).isDisplayed();
		
		 driver.findElement(By.xpath("//div[@class='icon_phone']")).isDisplayed();
		 
		 driver.findElement(By.xpath("(//div[@class='icon_mail'])[1]")).isDisplayed();
				 
		 driver.findElement(By.xpath("//div[@class='icon_loc']")).isDisplayed();
				 
				 				 
				 JavascriptExecutor js=(JavascriptExecutor)driver;
		    	 js.executeScript("window.scrollBy(250, 230)", "");
	 
	 }
	    //*******************
     
     
     
     
	 //below working fine
     //@Test(priority = 1 )    
     
     public void DraganddropTest(){
		 
    	   	  
    	 
    	 
    	 driver.findElement(By.xpath("//div[@class='menu-interaction-container']//ul//li[2]")).click();    			 
    	 
    	 
    	 driver.findElement(By.xpath("//li[@id='Accepted Elements']")).click();
    	 
    WebElement wb= driver.findElement(By.xpath("(//iframe[@class='demo-frame lazyloaded'])[2]"));
    	     	 
    	
    	 driver.switchTo().frame(wb);
    	 
    	 
    	 WebElement drag=driver.findElement(By.xpath("//div[@id='draggable-nonvalid']"));
    	 
    	 WebElement drop=driver.findElement(By.xpath("//div[@id='draggable']"));
    	 
    	Actions act=new Actions(driver);
    	
    	
    	act.dragAndDrop(drag, drop).build().perform();
    
    	 
	 
	 }
     
     
     //below working fine
  // @Test(priority = 2 ) 
     public void CalendarTest() throws InterruptedException{
    	 
    	
    	
    	JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(170, 130)", "");
    	     	 
    	 driver.findElement(By.xpath("//div[@class='menu-widgets-container']//ul//li[4]")).click();
    	 
    	 
    	 Thread.sleep(6000);
    	 WebElement wb= driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
    	 
    	 //
    	       	   
    	 //WebElement wb= driver.findElement(By.xpath("//iframe[@data-src='../../demoSite/practice/datepicker/default.html']"));
		 driver.switchTo().frame(wb);
		 
		 try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		 
		 driver.findElement(By.xpath("(//input[@id='datepicker'])[1]")).click();
		 
		 driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a[text()='4']")).click();
		 	 
				 
		 
	 }
	 
     
     
     
	 
	 
    
	 
     //@Test(priority = 1)
     public void CheatsheetsclickTest()
     {
    	 driver.findElement(By.xpath("//li[@id='menu-item-6898']//a[normalize-space()='CheatSheets']")).click();    	 
    	
    	 
    	 
    	 JavascriptExecutor js = (JavascriptExecutor) driver;
 		js.executeScript("window.scrollBy(230, 220)", "");
    	     	 
    	  		
 		driver.findElement(By.xpath("//a[normalize-space()='PySpark Cheat Sheet']")).click();
 		
 		 		
 		Set<String>set1=driver.getWindowHandles(); 		
 		Iterator<String>itr=set1.iterator();	
 		String parentid=itr.next();
 		String childtid=itr.next();
 		
 		
 		driver.switchTo().window(childtid);
 		 		
 		
 		String title=driver.getTitle();
 		
 		Assert.assertEquals(title,  "PySpark Cheat Sheet - GlobalSQA") ;	
 		
 		driver.findElement(By.xpath("//strong[normalize-space()='Guru99 PySpark Tutorial']")).click();				 
 	    				 			
 		
 		
		Set<String>set2=driver.getWindowHandles(); 		
		Iterator<String>itr2=set2.iterator();	
		String parentid2=itr.next();
		String childtid2=itr.next();
		
		
		
		driver.switchTo().window(childtid2);
		
		
        String title2=driver.getTitle();
 		
 		Assert.assertEquals(title2,  "PySpark Tutorial for Beginners: Learn with EXAMPLES") ;	
 		
 		driver.close();	
 		
 		driver.close();			
 		 		
 		
 		
    	 
 		
     }
		 
    
     
     
  //4/9:   
     
     
     @Test(priority = 1)
     public void AutoCompleyyTest() throws InterruptedException
     {
		         	 
    
     /*
    	 driver.findElement(By.xpath("//a[@title='Demo Testing Site']//span[contains(text(),'Demo Testing Site')]")).click();
    	 JavascriptExecutor js=(JavascriptExecutor) driver;
    	 js.executeScript("window.scrollBy(230, 210)", "");
    	 
    	 
    	 
    	 driver.findElement(By.xpath("//a[normalize-space()='AutoComplete']")).click();
    	 
    	 
    	 driver.switchTo().frame("//iframe[@class='demo-frame lazyloaded']");
    	 driver.findElement(By.xpath("//input[@id='search']")).sendKeys("a");
    	 Thread.sleep(8000);
    	 
    	List<WebElement> list= driver.findElements(By.xpath("//ul[@id='ui-id-1']//li"));
    	    	
    	int t=list.size();
    	
    	for(int i=0;i<=t-1;i++)
    	{
    		    		
    		if(list.get(i).getText().equalsIgnoreCase("antal"))
    		{
    			list.get(i).click();    			
    			break;
    		}
    	}
   
     */
    	 driver.get(" https://www.globalsqa.com/demoSite/practice/autocomplete/combobox.html");
    	
     
     
     
    	  	List<WebElement> list=driver.findElements(By.xpath("//input[@class='custom-combobox-input ui-widget ui-widget-content ui-state-default ui-corner-left ui-autocomplete-input']"));
        	
        	int t=list.size();
        	
        	for(int i=0;i<=t-1;i++)
        	{
        		    		
        		if(list.get(i).getText().equalsIgnoreCase("Asp"))
        		{
        			list.get(i).click();    			
        			break;
        		}
        	}	 
     
     
     
     }
	 
	    
         

	 

     @Test(priority = 2)
     public void TooltipTest()
     {
    	 
		
     String s1="YouTube";
     
    	 driver.get("https://demo.guru99.com/test/social-icon.html");
    	 
    	String s=driver.findElement(By.xpath("//a[@class='fa fa-lg fa-youtube']")).getAttribute("title");
    	 
    	//System.out.println();
    	 
    	 if(s.equalsIgnoreCase(s1))
    	 {
    		 System.out.println("testcase passed");
    	 }
    	 else
    	 {
    		 System.out.println("testcase failed");
        	 
    	 }   
	 

     }
     
     
	     
	 
		@BeforeTest
		public void setup() {

			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		}

		@AfterTest
		public void teardown() {

			driver.close();
		}


}
