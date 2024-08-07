package alwayspracticehere;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class JDBCpracticeTest {
  @Test
  public void fTest() throws ClassNotFoundException, SQLException {
	  
	  
	  
	  Class.forName("com.mysql.jdbc.Driver");	
	  
	  System.out.println("here my driver has been loaded");
	  	  
	  
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/selenium", "root", "pra18@123PRA");	
	
	
	  System.out.println("here my connection has been made");
	  
	  
	  
	   Statement s=con.createStatement();
	   
	  /*
	        ResultSet rs=  s.executeQuery("select * from tab2;");
	            
	        
	        
	        while(rs.next())
	        {
	        	
	        	 String idd=rs.getString("ID");
	        	 System.out.println("db record is " + idd);
	        	 
	        	               
	        	String name=rs.getString("name");	        	
	        	System.out.println("db record is " + name);	       	           
	        	         
	        	            
	        	            
	        }
	  
	  
	  */
  	  
	   
	   
	   
	 
	        ResultSet rs=  s.executeQuery("select * from tab2 where name LIKE 'M%';");
	        
	       
	  
	        
	        while(rs.next())
	        {
	        	
	        	String name= rs.getString("name");
	        	System.out.println("db record is " + name);	   
	        }
	        
	        
	        //o/p:
	  
	  /*
	        here my driver has been loaded
	        here my connection has been made
	        db record is Mahima
	        db record is Mahendran
	  
	  */        
	 
	        	        
	        
	        
	      
  }
}
