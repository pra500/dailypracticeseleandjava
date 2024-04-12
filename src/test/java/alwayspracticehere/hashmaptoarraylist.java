package alwayspracticehere;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class hashmaptoarraylist {

	public static void main(String[] args) {
		

			
		
		//v.imp: How to convert HashMap to ArrayList in Java? - Naveen AutomationLabs
		//need to chk again working fine/not
		
			
		
		Map<String, Integer>  map1=new HashMap<String, Integer>();
		
		map1.put("pragti", 1);
		map1.put("pragti1", 2);
		map1.put("pragti2", 3);	
		
		System.out.println(map1);
		
		System.out.println("map size is "+ map1.size());
		
		for(Map.Entry<String, Integer> ss:map1.entrySet())
		{
			
			
			System.out.println(ss.getKey() + " " + ss.getValue());
		}
		
		
		List<String> ls=new ArrayList<String>(map1.keySet());
		
		System.out.println(ls);
		
		System.out.println("list size is " + ls.size());
		
		for(String s:ls)
		{
			System.out.println("here are the keys "+s);
		}
		
        List<Integer> ls1=new ArrayList<Integer>(map1.values());
		
		System.out.println(ls1.size());
		
		for(Integer sj:ls1)
		{
			System.out.println("here are the values "+sj);
		}
		
		
		
		//map: {pragti2=3, pragti1=2, pragti=1}
		//list: [pragti2, pragti1, pragti]
		
		
	}

}
