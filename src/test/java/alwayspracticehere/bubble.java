package alwayspracticehere;

public class bubble {
	
	
	public static void main(String[] args) {
		
		
		int[] arr= {5, 7, 2};
		
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					
					arr[j] = arr[j+1];
					
					arr[j+1] = temp;
					
				}
			}
		}
		
		
		for(int ih:arr)
		{
			System.out.println(ih);
		}
		
	}

}
