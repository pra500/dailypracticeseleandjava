package alwayspracticehere;

public class Array1 {
	
	
	
	
	public static void main(String[] args) {
//		
//	int[] arr= {14, 15, 16};
//	
//	for(int i=0;i<=arr.length-1;i++)
//	{
//		System.out.println(arr[i]);
//	}
//		
//		
//	
		
		
		
	String str="prgy";	
	
	
	char[] charArray=str.toCharArray();
	
	  char temp = charArray[0];  // Store the first character in a temporary variable
      charArray[0] = charArray[charArray.length - 1];  // Set the first character to the last one
      charArray[charArray.length - 1] = temp;  // 
	
	
	
	System.out.println(charArray); //yrgp

	
	
	
	
		
		
	}

}
