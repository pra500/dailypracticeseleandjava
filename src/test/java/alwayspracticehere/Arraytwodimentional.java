package alwayspracticehere;

public class Arraytwodimentional {
		
	

	public static void main(String[] args) {
		
		
		
		int[] arr= {3, 7, 9};
		
		
		// System.out.println(a[0]);  //3
			
		// System.out.println(a[3]);  //ArrayIndexOutOfBoundsException
		
	
		System.out.println(arr[9]);   //ArrayIndexOutOfBoundsException
		
		
		
		
		int[][] a = {
			      {1, 2, 3},   //i.e. a[0]
			      {4, 5, 6, 9},      //i.e. a[1]
			      {7},      // i.e. a[2]
			};
		
		/*
		System.out.println(a.length);
		
		System.out.println(a[0].length);
		
		System.out.println(a[1].length);
		
		System.out.println(a[2].length);
		*/
		
//		3
//		3
//		4
//		1
		

		
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a[i].length-1;j++)
			{
				System.out.println(a[i][j]);
			}
		}
		
		
//		
//		1
//		2
//		3
//		4
//		5
//		6
//		9
//		7
		
		
		
		
		

		
		
		
		
		
		
	}

}
