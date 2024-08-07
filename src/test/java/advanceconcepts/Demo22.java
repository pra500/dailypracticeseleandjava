package advanceconcepts;

public class Demo22 {

	public static void main(String[] args) {			
				
		
		String s1="pragti is good";
		
	   String[] arr=s1.split(" ");
	   
	   String s2="";
	   
	   
	   for(int i=0;i<=arr.length-1;i++)
	   {
		   
	String s3=arr[i];
	String s4="";
	
	for(int j=s3.length()-1;j>=0;j--)
	{
		
		s4=s4+s3.charAt(j);		
		
	}
	
	s2=s2+s4+" ";
	   }
	   
	
	
	
	System.out.println(s2);
	   }
	
	
		//itgarp si doog 

		
		
		
		
		
	
		
		
		
		
		
		
		

		
		
		
	

}
