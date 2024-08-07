package exceptionhandling;

public class Thowandthrowspractice {
	
	public static void main(String[] args) {
		
		int num=-1;
		
		if(num<1)
		{
			throw new ArithmeticException("invalid numbertttt");
			
		}
		else
		{
			int m;
			m=num+3;
			System.out.println(m);
		
		}
		
	}

}




