package alwayspracticehere;

import java.util.*;

public class Stringpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
		/*
		
		String str="pragti gupta is a good";
		
		String[] arr=str.split(" ");
		
		
		System.out.println(arr.length);  //5
		*/
		
				
		
		/*
		String str="pRGHetEIO";
		
		str=str.toLowerCase();
		
		for(int i=0;i<=str.length()-1;i++)
		{
			
			if(str.charAt(i)=='a' || str.charAt(i)=='e'  ||  str.charAt(i)=='i'  ||  str.charAt(i)=='o' ||  str.charAt(i)=='u')
			{
				
				System.out.println(str.charAt(i));   //e e i o
				
			}
			
			
		}
		*/
		
		
		
		
		
	/*
		
		int[] arr= {12, 9, 10, 4, 50};
		
		int n=arr.length;
	
		int temp;
				
		
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<n-i-1;i++)
			{					
				
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];					
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
					
					
				}
				
			}
		}
		
		
		for(int i:arr) {
			System.out.println(i);
		}
	
	*/
		
			
		
				
			
		
		/* 
		String str="pragti is good good";
		
		
	String[] arr=str.split(" ");
	
	Map<String, Integer>map=new HashMap<String, Integer>();
	
	for(String s:arr)
	{
		if(map.containsKey(s))
		{
			
			map.put(s, map.get(s)+1);
		}
		else
		{
			
			map.put(s, 1);
		}
	}
	
	
    Set<Map.Entry<String, Integer>>set1=map.entrySet();
    
    for(Map.Entry<String, Integer>mm:set1)
    {
    	
    	if(mm.getValue()==1)
    	{
    		//System.out.println(mm.getKey() + ":" + mm.getValue());
    		System.out.println(mm.getKey());
    	}
    	
    }
	
	*/
		
		/*
		//removing duplicate words in a string
				
		String str = "This is a good image is a";		
		
		String[] arr=str.split(" ");	
		
		//Set<String>set1=new LinkedHashSet<String>();   	//[This, is, a, good, image]
		
		//Set<String>set1=new HashSet<String>();     //[a, image, This, is, good]
		
		
		Set<String>set1=new TreeSet<String>();   //[This, a, good, image, is]
		
		
	for(String s:arr)
	{
		set1.add(s);
	}
				
		
	System.out.println(set1);   
		
         */
		
		
		
		
		
	String str = "This is a good image is a";			
		
	String str1=str.toLowerCase();
	
	
	String[] arr=str1.split(" ");
	
	
	
	Set<String>set1=new TreeSet<String>();   //[This, a, good, image, is]
	
	
	for(String s:arr)
	{
		set1.add(s);
	}
				
		
	System.out.println(set1);   //[a, good, image, is, this]
	
	
	
	
	
	
	
	


	}

}
