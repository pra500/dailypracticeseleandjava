package com.qa.tests;

import java.util.*;



public class Collectionsclassprac {
	
	public static void main(String[] args) {
		
		
		List<String> list=new ArrayList<String>();//Creating arraylist  
		list.add("Ravi");//Adding object in arraylist  
		list.add("Vijay");  
		list.add("Savi");  
		list.add("Ajay");  
		
		
		System.out.println(list);
		
		
		/*
		Collections.addAll(list,  "Pra");
		System.out.println(list);
		
		
		Collections.sort(list);
		System.out.println(list);   //a,p,r,s,v,
		*/
	
	
	Set<String>set1=new HashSet<String>(list);		
	set1.add("aaaa");
	
		
	System.out.println(set1);	
	
	
	
	/*
	[Ravi, Vijay, Savi, Ajay]
	[Vijay, Ravi, Savi, aaaa, Ajay]
    */
	
	
	
	Vector vv=new Vector();
	vv.add("anubha");
	vv.add("unubha");
	vv.add("onubha");
	
	System.out.println(vv);  //[anubha, unubha, onubha]
	
	

	
	}

}
