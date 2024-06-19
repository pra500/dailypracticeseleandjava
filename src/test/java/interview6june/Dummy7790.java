package interview6june;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import com.itextpdf.text.log.SysoCounter;

public class Dummy7790 {

	public static void main(String[] args) {

		
		
		/*
		//find duplicate chars in a string
		
		String str="prayay";
		
		char[] arr=str.toCharArray();
		
		Map<Character, Integer>map1=new HashMap<Character, Integer>();
		
		for(Character c:arr)
		{
			if(map1.containsKey(c))
			{
				map1.put(c, map1.get(c)+1);
			}
			else
			{
				map1.put(c,  1);
			}
		}
				
		
		
	    Set<Map.Entry<Character, Integer>>set1=map1.entrySet();
	    for(Map.Entry<Character, Integer>mm:set1)
	    {
	    	if(mm.getValue()==1)
	    	{
	    		
	    		System.out.println(mm.getKey()+ " "+mm.getValue());
	    		
	    	}
	    }
	    */
		
		
		
		
	    
	    //remove duplicate chars in a string
		
		/*
		String str="ppaayu";

		LinkedHashSet<Character> set = new LinkedHashSet<Character>(); 
		
		for(int i=0;i<=str.length()-1;i++) {
			set.add(str.charAt(i));
		}
		
		
		for(Character cc:set)
		{
			System.out.println(cc);  
		}
	    
	    
		/*
		p
		a
		y
		u
        */
		
	
		
		
		 
	    //remove vowels in a string	
		/*
		String str="aepli";
				
		
		for(int i=0;i<=str.length()-1;i++)
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
			{
				
				continue;
			}
			else
			{
				System.out.println(str.charAt(i));                        
			}
		}
		*/
		
		
		
		
	

	}

}
