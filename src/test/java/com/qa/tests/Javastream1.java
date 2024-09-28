package com.qa.tests;

import java.util.Arrays;
import java.util.List;

public class Javastream1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	List<Integer> numbers=	
		
		Arrays.asList(3,7,8,9,5,16, 18, 10);
	
	int sum = numbers.parallelStream()
            .filter(n -> n % 2 == 0)  // Filter even numbers
            .mapToInt(n -> n * n)     // Square the numbers
            .sum();                   // Sum the squared numbers

    System.out.println("Sum of squares of even numbers: " + sum);	}
}
