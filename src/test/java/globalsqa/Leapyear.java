package globalsqa;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /* 
		int num=2023;
		
		int s, s1, sum;	
							
		
		for(int i=0;i<=3;i++)
		{
			if(num%4==0)
			{
		
		s=num/10;
		s1=num%10;		
				
			}
				
		}
			System.out.println(sum);
		*/
		
		String str="pragi Prag 345";
		
		String str1=str.toLowerCase();
		///char[] arr=str.toCharArray();
		
		
		//for(int i=0;i<=arr.length-1;i++)
		int count=0;
		
		for(int i=0;i<=str1.length()-1;i++)
		{
			
			if(str1.charAt(i)>=97 && str1.charAt(i)<=122)
			{
				System.out.println(str1.charAt(i));
				count++;
			}
			
			
		}

		System.out.println(count);
	}

	
}
