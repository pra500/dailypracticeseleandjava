package alwayspracticehere;

public class Stringsplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		String str="pragti";
		
		String[] arr=str.split("a");
		
		for(String s:arr)
		{
			System.out.println(s);
		}
		
		/*
		pr
		gti
*/
		
		
		
		String str="hlleomn";
		
		String[] arr1=str.split("e", 2);
		
		for(int i=0;i<=arr1.length-1;i++)
		{
			System.out.println(arr1[i]);
		}
		
		/*
		h
		lleomn
*/
		
		

	}

}
