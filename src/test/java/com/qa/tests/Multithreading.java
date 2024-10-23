package com.qa.tests;

import org.testng.annotations.Test;


public class Multithreading {
	
	public static void main(String[] args) {
		
		
	
	
		        int[] arr = {64, 34, 25, 12, 22, 11, 90};

		        System.out.println("Original Array:");
		       

		        // Perform bubble sort
		        bubbleSort(arr);

		        System.out.println("\nSorted Array:");
		        
		    }

		    // Bubble sort algorithm
		    public static void bubbleSort(int[] arr) {
		        int n = arr.length;
		        boolean swapped;

		        // Outer loop for each pass
		        for (int i = 0; i < n - 1; i++) {
		            swapped = false;

		            // Inner loop to compare adjacent elements
		            for (int j = 0; j < n - 1 - i; j++) {
		                // Swap if the current element is greater than the next element
		                if (arr[j] > arr[j + 1]) {
		                    int temp = arr[j];
		                    arr[j] = arr[j + 1];
		                    arr[j + 1] = temp;

		                    
		                }
		            }

		        for (int value : arr) {
		            System.out.print(value + " ");
		        }
		        System.out.println();
		    }
		}

		
		
	}
  

