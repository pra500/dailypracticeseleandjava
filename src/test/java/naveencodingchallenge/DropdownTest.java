package naveencodingchallenge;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class DropdownTest {
	
	
	//below is for both the tests:
	
	
	//need to chk why msg has been coming wrong
	// needs to prepare notes
	//values are coming in sorted order in o/p
	
	//https://www.youtube.com/watch?v=LBQU1rF4GXk&ab_channel=Mukeshotwani
	//https://www.pavantestingtools.com/2018/12/drop-down-options-are-sorted-or-not-in.html
	
		
	
	
	
	
	 WebDriver driver;
	
	 
	 
	
  @Test
  public void dropdownTest() {
	  
	  
	  WebElement wb=driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select"));
	  
	  Select sel=new Select(wb);	  
	  
	  
	  List originallist=new ArrayList();	  
	  List newlist=new ArrayList();
	  
	  
	 
	 List<WebElement>list=sel.getOptions();
	 
	 for(WebElement w:list)
	 {
		String s= w.getText();
		originallist.add(s);
	 }
	  
	  
	  
	 
	 newlist.addAll(originallist);
	  
	 //in ascending order it ll gv the items:	 
	  Collections.sort(newlist);  
	  
	  System.out.print(newlist);
	  
	//Assert.assertEquals(originallist, newlist, "not sorted");  
	  	  
	  if(newlist==originallist)
	  {
		  System.out.println("dd sorted");
	  }
	  else
	  {
		  System.out.println("dd not sorted");
		  
	  }
	  
	  
	
	 
//	for(int i=0;i<=list.size()-1;i++)
//	{
//		
//		list.get(i).getText());
//	 
//	
//	  
//	  
 // }
  
	 

 
	  
	//[Afghanistan, Albania, Algeria, American Samoa, Andorra, Angola, Anguilla, Antarctica, Antigua and Barbuda, Argentina, Armenia, Aruba, Australia, Austria, Azerbaijan, Bahamas, Bahrain, Bangladesh, Barbados, Belarus, Belgium, Belize, Benin, Bermuda, Bhutan, Bolivia, Plurinational State of, Bonaire, Sint Eustatius and Saba, Bosnia and Herzegovina, Botswana, Bouvet Island, Brazil, British Indian Ocean Territory, Brunei Darussalam, Bulgaria, Burkina Faso, Burundi, Cambodia, Cameroon, Canada, Cape Verde, Cayman Islands, Central African Republic, Chad, Chile, China, Christmas Island, Cocos (Keeling) Islands, Colombia, Comoros, Congo, Congo, the Democratic Republic of the, Cook Islands, Costa Rica, Croatia, Cuba, Curaçao, Cyprus, Czech Republic, Côte d’Ivoire, Denmark, Djibouti, Dominica, Dominican Republic, Ecuador, Egypt, El Salvador, Equatorial Guinea, Eritrea, Estonia, Ethiopia, Falkland Islands (Malvinas), Faroe Islands, Fiji, Finland, France, French Guiana, French Polynesia, French Southern Territories, Gabon, Gambia, Georgia, Germany, Ghana, Gibraltar, Greece, Greenland, Grenada, Guadeloupe, Guam, Guatemala, Guernsey, Guinea, Guinea-Bissau, Guyana, Haiti, Heard Island and McDonald Islands, Holy See (Vatican City State), Honduras, Hong Kong, Hungary, Iceland, India, Indonesia, Iran, Islamic Republic of, Iraq, Ireland, Isle of Man, Israel, Italy, Jamaica, Japan, Jersey, Jordan, Kazakhstan, Kenya, Kiribati, Korea, Democratic People’s Republic of, Korea, Republic of, Kuwait, Kyrgyzstan, Lao People’s Democratic Republic, Latvia, Lebanon, Lesotho, Liberia, Libya, Liechtenstein, Lithuania, Luxembourg, Macao, Macedonia, the former Yugoslav Republic of, Madagascar, Malawi, Malaysia, Maldives, Mali, Malta, Marshall Islands, Martinique, Mauritania, Mauritius, Mayotte, Mexico, Micronesia, Federated States of, Moldova, Republic of, Monaco, Mongolia, Montenegro, Montserrat, Morocco, Mozambique, Myanmar, Namibia, Nauru, Nepal, Netherlands, New Caledonia, New Zealand, Nicaragua, Niger, Nigeria, Niue, Norfolk Island, Northern Mariana Islands, Norway, Oman, Pakistan, Palau, Palestinian Territory, Occupied, Panama, Papua New Guinea, Paraguay, Peru, Philippines, Pitcairn, Poland, Portugal, Puerto Rico, Qatar, Romania, Russian Federation, Rwanda, Réunion, Saint Barthélemy, Saint Helena, Ascension and Tristan da Cunha, Saint Kitts and Nevis, Saint Lucia, Saint Martin (French part), Saint Pierre and Miquelon, Saint Vincent and the Grenadines, Samoa, San Marino, Sao Tome and Principe, Saudi Arabia, Senegal, Serbia, Seychelles, Sierra Leone, Singapore, Sint Maarten (Dutch part), Slovakia, Slovenia, Solomon Islands, Somalia, South Africa, South Georgia and the South Sandwich Islands, South Sudan, Spain, Sri Lanka, Sudan, Suriname, Svalbard and Jan Mayen, Swaziland, Sweden, Switzerland, Syrian Arab Republic, Taiwan, Province of China, Tajikistan, Tanzania, United Republic of, Thailand, Timor-Leste, Togo, Tokelau, Tonga, Trinidad and Tobago, Tunisia, Turkey, Turkmenistan, Turks and Caicos Islands, Tuvalu, Uganda, Ukraine, United Arab Emirates, United Kingdom, United States, United States Minor Outlying Islands, Uruguay, Uzbekistan, Vanuatu, Venezuela, Bolivarian Republic of, Viet Nam, Virgin Islands, British, Virgin Islands, U.S., Wallis and Futuna, Western Sahara, Yemen, Zambia, Zimbabwe, Åland Islands]dd not sorted
  
	  

	  
	  
  }
  
  
  
  
  //different website
  //@Test
  public void dropdown1Test() {
	  
	  
	  
WebElement wb=driver.findElement(By.xpath("//select[@id='country']"));
	  
	  Select sel=new Select(wb);	  
	  
	  
	  List originallist=new ArrayList();	  
	  List newlist=new ArrayList();
	  
	  
	 
	 List<WebElement>list=sel.getOptions();
	 
	 for(WebElement w:list)
	 {
		String s= w.getText();
		originallist.add(s);
	 }
	  
	  
	  
	 
	 newlist.addAll(originallist);
	  
	 //in ascending order it ll gv the items:	 
	  Collections.sort(newlist);  
	  
	  System.out.print(newlist);
	  
	//Assert.assertEquals(originallist, newlist, "not sorted");  
	  	  
	  if(newlist==originallist)
	  {
		  System.out.println("dd sorted");
	  }
	  else
	  {
		  System.out.println("dd not sorted");
		  
	  }
	  
	  
	  //[Australia, Brazil, Canada, China, France, Germany, India, Japan, United Kingdom, United States]dd not sorted

	  
	

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
  @BeforeClass
  public void beforeClass() {
	  
	  
	   
	    driver=new ChromeDriver();	  
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");	
		
		
		//driver.get("https://testautomationpractice.blogspot.com/");
		
		
				
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
