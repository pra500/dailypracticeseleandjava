package exceptionhandling;

public class Throwsssss {

	
	/*
	public static void main(String[] args) throws ArithmeticException{
	
		
		
		int m=-9;
		if(m<-1)
		{
			System.out.println("xxx");
		}
		else
		{
			int y=m+2;
			System.out.println(y);
		}
		
		
		System.out.println("hhh");
		System.out.println("hhh1");
		

	}	
//	
//	xxx
//	hhh
//	hhh1
	
	*/
	
	
	
	public static void main(String[] args) {
					
		
		int n=-6;
		
		
		if(n<-1)
		{
			System.out.println("hello world");
			
			//throw new ArithmeticException("plz gv valid o/p");
			//throw new NullPointerException("plz gv valid o/p");
			
			throw new NumberFormatException("plz gv valid o/pkk");
			
		}
		
		
		else
		{
			int h;
			h=n+12;
			System.out.println(h);
		}
		
		
		
		
		System.out.println("we");
		
		System.out.println("we");
		
		
		
	}
	
	
	
	


}
