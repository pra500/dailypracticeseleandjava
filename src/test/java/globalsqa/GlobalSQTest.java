package globalsqa;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class GlobalSQTest {

	WebDriver driver;

	@Test(priority = 0)
	public void searchTest() {

		driver.findElement(By.xpath("//input[@id='s']")).sendKeys("c++", Keys.ENTER);
		
	}

	@Test(priority = 1, dependsOnMethods = { "searchTest" })
	public void titleTest() {

		// String title=driver.findElement(By.xpath("//h1[normalize-space()='Search
		// results for: c++']")).getText();
		// Assert.assertEquals(title, "Search results for: c++");

		boolean b = driver.findElement(By.xpath("//h1[normalize-space()='Search results for: c++']")).isDisplayed();
		Assert.assertTrue(b);

	}

	@Test(priority = 2, dependsOnMethods = { "searchTest", "titleTest" })
	public void ClickonreadmoreTest() {

		driver.findElement(By.xpath("//a[normalize-space()='Read more']")).click();

	}

	@Test(priority = 3, dependsOnMethods = { "searchTest", "titleTest", "ClickonreadmoreTest" })
	public void Jan2017Test() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(130, 120)", "");

		driver.findElement(By.xpath("//a[text()='January 2017']")).click();

		Thread.sleep(8000);

	}

	@Test(priority = 4, dependsOnMethods = { "searchTest", "titleTest", "ClickonreadmoreTest", "Jan2017Test" })
	public void projectestimationtechniqueTest() throws InterruptedException {

		Thread.sleep(4000);
		String text = driver.findElement(By.xpath("//a[@title='Permalink to Project Estimation Techniques']"))
				.getText();
		Assert.assertEquals(text, "Project Estimation Techniques");

	}

	@Test(priority = 5, dependsOnMethods = { "searchTest", "titleTest", "ClickonreadmoreTest", "Jan2017Test" })
	public void FreeebooksTest() throws InterruptedException {

		WebElement wb = driver.findElement(By.xpath("//a[@class='no_border'][normalize-space()='Free Ebooks']"));

		Actions act = new Actions(driver);
		act.moveToElement(wb).build().perform();

		// driver.findElement(By.xpath("//li[@id='menu-item-7129']//a")).click();
		// Thread.sleep(3000);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Free Elasticsearch eBooks']")))
				.click();
		// WebElement wb1= driver.findElement(By.xpath("//span[text()='Free
		// Elasticsearch eBooks']"));

	}

	@Test(priority = 6, dependsOnMethods = { "searchTest", "titleTest", "ClickonreadmoreTest", "Jan2017Test",
			"FreeebooksTest" })
	public void ValidateURLTest() throws InterruptedException {

		Thread.sleep(6000);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.globalsqa.com/free-elasticsearch-ebooks/");

	}

	@Test(priority = 7, dependsOnMethods = { "searchTest", "titleTest", "ClickonreadmoreTest", "Jan2017Test",
			"FreeebooksTest", "ValidateURLTest" })
	public void MergesortclickTest() {

		driver.findElement(By.xpath("//span[normalize-space()='Merge Sort']")).click();

	}

	@Test(priority = 8, dependsOnMethods = { "searchTest", "titleTest", "ClickonreadmoreTest", "Jan2017Test",
			"FreeebooksTest", "ValidateURLTest", "MergesortclickTest" })
	public void CheatSheetspresenceTest() throws InterruptedException {

		Thread.sleep(6000);
		boolean flag = driver.findElement(By.xpath("//li[@id='menu-item-6898']//a[normalize-space()='CheatSheets']"))
				.isDisplayed();
		Assert.assertTrue(flag);
	}

	@Test(priority = 9, dependsOnMethods = { "searchTest", "titleTest", "ClickonreadmoreTest", "Jan2017Test",
			"FreeebooksTest", "ValidateURLTest", "MergesortclickTest", "CheatSheetspresenceTest" })
	public void CheatSheetclkTest() {
		driver.findElement(By.xpath("//li[@id='menu-item-6898']//a[normalize-space()='CheatSheets']")).click();

	}

	@Test(priority = 10, dependsOnMethods = { "searchTest", "titleTest", "ClickonreadmoreTest", "Jan2017Test",
			"FreeebooksTest", "ValidateURLTest", "MergesortclickTest", "CheatSheetspresenceTest" })
	public void SQLCheatSheetclkTest() {

		driver.findElement(By.xpath("//a[normalize-space()='SQL Cheat Sheet']")).click();

		Set<String> set = driver.getWindowHandles();
		Iterator<String> itr = set.iterator();
		String parentid = itr.next();
		String childid = itr.next();

		driver.switchTo().window(childid);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(230, 220)", "");

		driver.findElement(By.xpath("//li[@id='menu-item-2819']//a[normalize-space()='Toolbar']")).click();

		driver.navigate().back();

		driver.close();

		driver.switchTo().window(parentid);

	}

	@Test(priority = 11, dependsOnMethods = { "searchTest", "titleTest", "ClickonreadmoreTest", "Jan2017Test",
			"FreeebooksTest", "ValidateURLTest", "MergesortclickTest", "CheatSheetspresenceTest",
			"SQLCheatSheetclkTest" })
	public void VerifytestershubTest() {

		WebElement wb = driver.findElement(By.xpath("//a[@class='no_border'][contains(text(),'Tester’s Hub')]"));

		WebElement wb1 = driver.findElement(By.xpath("//span[normalize-space()='Demo Testing Site']"));

		Actions act = new Actions(driver);
		act.moveToElement(wb).moveToElement(wb1).build().perform();

		driver.findElement(By.xpath("//span[normalize-space()='AlertBox']")).click();

	}

	// today:

	@Test(priority = 12, dependsOnMethods = { "searchTest", "titleTest", "ClickonreadmoreTest", "Jan2017Test",
			"FreeebooksTest", "ValidateURLTest", "MergesortclickTest", "CheatSheetspresenceTest",
			"SQLCheatSheetclkTest", "VerifytestershubTest" })
	public void VerifyconformationboxTest() {

		driver.findElement(By.xpath("//li[@id='Confirmation Box']")).click();

		driver.findElement(By.xpath("//li[@id='Prompt Box']")).click();

	}

	@Test(priority = 13, dependsOnMethods = { "searchTest", "titleTest", "ClickonreadmoreTest", "Jan2017Test",
			"FreeebooksTest", "ValidateURLTest", "MergesortclickTest", "CheatSheetspresenceTest",
			"SQLCheatSheetclkTest", "VerifyconformationboxTest" })
	public void VerifypromptboxpageurlTest() {

		String url = driver.getCurrentUrl();

		Assert.assertEquals(url, "https://www.globalsqa.com/demo-site/alertbox/#Prompt%20Box");

	}

	@Test(priority = 14, dependsOnMethods = { "searchTest", "titleTest", "ClickonreadmoreTest", "Jan2017Test",
			"FreeebooksTest", "ValidateURLTest", "MergesortclickTest", "CheatSheetspresenceTest",
			"SQLCheatSheetclkTest", "VerifyconformationboxTest", "VerifypromptboxpageurlTest" })
	public void ClickonsepTest() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(250, 230)", "");

		driver.findElement(By.xpath("//a[normalize-space()='« Sep']")).click();

	}

	@Test(priority = 15, dependsOnMethods = { "searchTest", "titleTest", "ClickonreadmoreTest", "Jan2017Test",
			"FreeebooksTest", "ValidateURLTest", "MergesortclickTest", "CheatSheetspresenceTest",
			"SQLCheatSheetclkTest", "VerifyconformationboxTest", "VerifypromptboxpageurlTest", "ClickonsepTest" })
	public void VerifyAutomationTestingunderCategoriesTest() throws InterruptedException {
		boolean b = driver.findElement(By.xpath("//span[normalize-space()='Automation Testing']")).isDisplayed();
		//Thread.sleep(6000);
		// boolean
		// b=driver.findElement(By.xpath("//ul[@class='side_bar_menu']//li[2]//a//span[2][text()='Automation
		// Testing']")).isDisplayed();
		Assert.assertTrue(b);

	}

	@Test(priority = 16, dependsOnMethods = { "searchTest", "titleTest", "ClickonreadmoreTest", "Jan2017Test",
			"FreeebooksTest", "ValidateURLTest", "MergesortclickTest", "CheatSheetspresenceTest",
			"SQLCheatSheetclkTest", "VerifyconformationboxTest", "VerifypromptboxpageurlTest", "ClickonsepTest",
			"VerifyAutomationTestingunderCategoriesTest" })
	public void ClickonAutomationTesting() {

		driver.findElement(By.xpath("//ul[@class='side_bar_menu']//li[2]//a//span[2][text()='Automation Testing']"))
				.click();

	}

	@Test(priority = 17, dependsOnMethods = { "searchTest", "titleTest", "ClickonreadmoreTest", "Jan2017Test",
			"FreeebooksTest", "ValidateURLTest", "MergesortclickTest", "CheatSheetspresenceTest",
			"SQLCheatSheetclkTest", "VerifyconformationboxTest", "VerifypromptboxpageurlTest", "ClickonsepTest",
			"VerifyAutomationTestingunderCategoriesTest", "ClickonAutomationTesting" })
	public void VerifyAutomationTestingTitleTest() {

		String title = driver.findElement(By.xpath("//div[@class='page_heading']//h1")).getText();
		Assert.assertEquals(title, "Automation Testing");

	}

	@Test(priority = 18, dependsOnMethods = { "searchTest", "titleTest", "ClickonreadmoreTest", "Jan2017Test",
			"FreeebooksTest", "ValidateURLTest", "MergesortclickTest", "CheatSheetspresenceTest",
			"SQLCheatSheetclkTest", "VerifyconformationboxTest", "VerifypromptboxpageurlTest", "ClickonsepTest",
			"VerifyAutomationTestingunderCategoriesTest", "ClickonAutomationTesting",
			"VerifyAutomationTestingTitleTest" })
	public void samplepageclickTest() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(250, 220)", "");

		driver.findElement(By.xpath("//li[@id='menu-item-2818']//a[normalize-space()='Sample Page Test']")).click();

	}

	@Test(priority = 19, dependsOnMethods = { "searchTest", "titleTest", "ClickonreadmoreTest", "Jan2017Test",
			"FreeebooksTest", "ValidateURLTest", "MergesortclickTest", "CheatSheetspresenceTest",
			"SQLCheatSheetclkTest", "VerifyconformationboxTest", "VerifypromptboxpageurlTest", "ClickonsepTest",
			"VerifyAutomationTestingunderCategoriesTest", "ClickonAutomationTesting",
			"VerifyAutomationTestingTitleTest", "samplepageclickTest" })
	public void ChooseFileTest() {
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("D:\\C data\\Downloads\\weight.txt");

		driver.findElement(By.xpath("//input[@id='g2599-name']")).clear();

		driver.findElement(By.xpath("//input[@id='g2599-name']")).sendKeys("Harry");

		driver.findElement(By.xpath("//input[@id='g2599-email']")).clear();

		driver.findElement(By.xpath("//input[@id='g2599-email']")).sendKeys("harryH23@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='g2599-website']")).clear();

		driver.findElement(By.xpath("//input[@id='g2599-website']")).sendKeys("https://www.makemdddyssssddtrip.com/");

		WebElement wb = driver.findElement(By.xpath("//select[@class='select']"));
		Select sel = new Select(wb);
		sel.selectByValue("3-5");

		driver.findElement(By.xpath("//input[@value='Automation Testing']")).click();

		driver.findElement(By.xpath("//input[@value='Graduate']")).click();

		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();

		Alert alt = driver.switchTo().alert();
		alt.accept();

		alt.accept();

		driver.findElement(By.xpath("//textarea[@id='contact-form-comment-g2599-comment']")).sendKeys("others");

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		driver.findElement(By.xpath("//input[@name='file-553']"))
				.sendKeys("C:\\Users\\Admin\\Downloads\\file_example_PNG_500kB.png");

	}

     @Test(priority = 20, dependsOnMethods = {"searchTest", "titleTest",
	"ClickonreadmoreTest", "Jan2017Test", "FreeebooksTest", "ValidateURLTest",
	 "MergesortclickTest", "CheatSheetspresenceTest", "SQLCheatSheetclkTest",
	 "VerifyconformationboxTest", "VerifypromptboxpageurlTest", "ClickonsepTest",
	 "VerifyAutomationTestingunderCategoriesTest", "ClickonAutomationTesting",
	 "VerifyAutomationTestingTitleTest", "samplepageclickTest", "ChooseFileTest"})
	public void ClickonabovegplussignTest() throws InterruptedException {
		
    	 try
    	 {
    	Thread.sleep(6000);
		driver.findElement(By.xpath("//a[@title='Google+']")).click();
    	//a[@title='Google+']
		
		//driver.findElement(By.xpath("(//div//a[text()='google'])[1]")).click();
		Set<String> set = driver.getWindowHandles();
		Iterator<String> itr = set.iterator();
		String parentid = itr.next();
		String childid = itr.next();

		driver.switchTo().window(childid);
	String title=driver.getTitle();
	Assert.assertEquals(title, "Google Workspace Updates: New community features for Google Chat and an update on Currents");		
		//driver.findElement(By.xpath("//title[normalize-space()='Google Workspace Updates: New community features for Google Chat and an update on Currents']"))
		driver.close();
		
		driver.switchTo().window(parentid);
		
    	 }
    	 catch (Exception e) {
			e.printStackTrace();
		}
				
     }
     
          

     
     @Test(priority = 21, dependsOnMethods = {"searchTest", "titleTest",
    			"ClickonreadmoreTest", "Jan2017Test", "FreeebooksTest", "ValidateURLTest",
    			 "MergesortclickTest", "CheatSheetspresenceTest", "SQLCheatSheetclkTest",
    			 "VerifyconformationboxTest", "VerifypromptboxpageurlTest", "ClickonsepTest",
    			 "VerifyAutomationTestingunderCategoriesTest", "ClickonAutomationTesting",
    			 "VerifyAutomationTestingTitleTest", "samplepageclickTest", "ChooseFileTest", "ClickonabovegplussignTest"})

    			public void ClickonsearchTest(){
    	 
    	 driver.findElement(By.xpath("//input[@id='s']")).click();   	 
    	   	 
    	 
     }   
     
     
     @Test(priority = 22, dependsOnMethods = {"searchTest", "titleTest",
    			"ClickonreadmoreTest", "Jan2017Test", "FreeebooksTest", "ValidateURLTest",
    			 "MergesortclickTest", "CheatSheetspresenceTest", "SQLCheatSheetclkTest",
    			 "VerifyconformationboxTest", "VerifypromptboxpageurlTest", "ClickonsepTest",
    			 "VerifyAutomationTestingunderCategoriesTest", "ClickonAutomationTesting",
    			 "VerifyAutomationTestingTitleTest", "samplepageclickTest", "ChooseFileTest", "ClickonabovegplussignTest", "ClickonsearchTest"})

    			public void ClickonFreeDeepLearningEBooksTest(){
    	 
    	 
    	 driver.findElement(By.xpath("//a[@href='https://www.globalsqa.com/free-deep-learning-ebooks/'][normalize-space()='Read more']")).click();
    	 }
     
          
     
     
     
     
     @Test(priority = 23, dependsOnMethods = {"searchTest", "titleTest",
    			"ClickonreadmoreTest", "Jan2017Test", "FreeebooksTest", "ValidateURLTest",
    			 "MergesortclickTest", "CheatSheetspresenceTest", "SQLCheatSheetclkTest",
    			 "VerifyconformationboxTest", "VerifypromptboxpageurlTest", "ClickonsepTest",
    			 "VerifyAutomationTestingunderCategoriesTest", "ClickonAutomationTesting",
    			 "VerifyAutomationTestingTitleTest", "samplepageclickTest", "ChooseFileTest", "ClickonabovegplussignTest","ClickonsearchTest"
    			 , "ClickonFreeDeepLearningEBooksTest"})

      public void ClickonLinuxTutorialTest(){
    	 
    	 
      driver.findElement(By.xpath("//span[normalize-space()='Linux Tutorial']")).click();
    	 
       String title=driver.getTitle();     
       Assert.assertEquals(title,  "Linux Tutorial - GlobalSQA");
          
     } 
     
     
 //need to chk below:
     
     @Test(priority = 24, dependsOnMethods = {"searchTest", "titleTest",
    			"ClickonreadmoreTest", "Jan2017Test", "FreeebooksTest", "ValidateURLTest",
    			 "MergesortclickTest", "CheatSheetspresenceTest", "SQLCheatSheetclkTest",
    			 "VerifyconformationboxTest", "VerifypromptboxpageurlTest", "ClickonsepTest",
    			 "VerifyAutomationTestingunderCategoriesTest", "ClickonAutomationTesting",
    			 "VerifyAutomationTestingTitleTest", "samplepageclickTest", "ChooseFileTest", "ClickonabovegplussignTest","ClickonsearchTest"
    			 , "ClickonFreeDeepLearningEBooksTest", "ClickonLinuxTutorialTest"})
     


      public void ClickonLinuxTutorial56Test(){
    	     	 
    	 
      driver.findElement(By.xpath("//span[normalize-space()='Linux Tutorial']")).click();
    	 
       String title=driver.getTitle();     
       Assert.assertEquals(title,  "Linux Tutorial - GlobalSQA");
          
     }      
     
     
   //need to chk below: 
     
     
     
     
     
     
     //today***********
     
    //use try-catch block
     
     @Test(priority = 25, dependsOnMethods = {"searchTest", "titleTest",
 			"ClickonreadmoreTest", "Jan2017Test", "FreeebooksTest", "ValidateURLTest",
 			 "MergesortclickTest", "CheatSheetspresenceTest", "SQLCheatSheetclkTest",
 			 "VerifyconformationboxTest", "VerifypromptboxpageurlTest", "ClickonsepTest",
 			 "VerifyAutomationTestingunderCategoriesTest", "ClickonAutomationTesting",
 			 "VerifyAutomationTestingTitleTest", "samplepageclickTest", "ChooseFileTest", "ClickonabovegplussignTest","ClickonsearchTest"
 			 , "ClickonFreeDeepLearningEBooksTest", "ClickonLinuxTutorialTest", "ClickonLinuxTutorial56Test"})

      public void ClickonABOUTandokpennewTabTest(){
    	 
    	 
    	 driver.findElement(By.xpath("//li[@id='menu-item-53896']//a[normalize-space()='About']")).click();
    	 
    	 driver.findElement(By.xpath("//li[@id='menu-item-2815']//a[normalize-space()='Frames And Windows']")).click();
    	 
    	 
    	 
    	 
    	 driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//a[@class='button e.g. button_hilite button_pale small_button'][normalize-space()='Click Here']")).click();
    	 driver.switchTo().newWindow(WindowType.TAB);
    	 
    	boolean b= driver.findElement(By.xpath("//a[@title='Frames And Windows']//span[contains(text(),'Frames And Windows')]")).isDisplayed();
    	 
    	 Assert.assertTrue(b);
    	 
    	 driver.close();
    	     	 
    	     	 
     }    
         
     
     @Test(priority = 26, dependsOnMethods = {"searchTest", "titleTest",
  			"ClickonreadmoreTest", "Jan2017Test", "FreeebooksTest", "ValidateURLTest",
  			 "MergesortclickTest", "CheatSheetspresenceTest", "SQLCheatSheetclkTest",
  			 "VerifyconformationboxTest", "VerifypromptboxpageurlTest", "ClickonsepTest",
  			 "VerifyAutomationTestingunderCategoriesTest", "ClickonAutomationTesting",
  			 "VerifyAutomationTestingTitleTest", "samplepageclickTest", "ChooseFileTest", "ClickonabovegplussignTest","ClickonsearchTest"
  			 , "ClickonFreeDeepLearningEBooksTest", "ClickonLinuxTutorialTest", "ClickonLinuxTutorial56Test", "ClickonABOUTandokpennewTabTest"})

      public void ClickonOpenNewTabTest(){
    	     	 
    	 driver.findElement(By.xpath("//li[@id='iFrame']")).click();
    	 
    	 
    	 driver.switchTo().frame("iFrame");
    	 
    	 
    	 
    boolean b=driver.findElement(By.xpath("//div[@class='row portfolio_section']//div[@class='sixteen columns']")).isDisplayed();
    
     Assert.assertTrue(b);
     
     
     boolean flag=driver.findElement(By.xpath("(//a[normalize-space()='CheatSheets'])[1]")).isDisplayed();
     Assert.assertTrue(flag);
        
          
     }        
     
      
     
     
     
     
	@BeforeClass
	public void setup() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
	}

	@AfterClass
	public void teardown() {

		driver.close();
	}

}
