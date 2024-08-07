package alwayspracticehere;

public class primeno22 {
	
	public static boolean get(int n)
	{
		
		if(n<=1)
		{
			return false;
			
		}
		
		
		for(int i=2;i<n;i++)	
		{
			if(n%i == 0)
			{
				return false;
			}
		}
			
			
			
			
			
			
		
		return true;
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("this is the prime number " + get(23));
		
		

	}

}
