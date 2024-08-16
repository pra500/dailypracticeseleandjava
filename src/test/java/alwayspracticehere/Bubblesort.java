package alwayspracticehere;

public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int[] arr= {13, 24, 4, 3, 78};
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				
				//if(arr[j]>arr[j+1])   //ascending
					if(arr[j]<arr[j+1])   //descending
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
					
					
					
			}
				
		}
		
		
		for(int i:arr)			
		{
			System.out.println(i);
		}

	}

	
	//******************

}
