package alwayspracticehere;

public class Bubblesort1111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {5, 7, 2};
		
		int temp;
		
		for(int i=0;i<arr.length-1;i++)
		{
			
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
					
				}
			}
			
		}
					
	
		for(int e:arr)
		{
			System.out.println(e);
		}			
		
		

	}

}
