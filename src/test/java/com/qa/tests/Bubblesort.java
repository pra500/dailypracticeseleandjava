package com.qa.tests;

public class Bubblesort {

	public static void main(String[] args) {

		int[] arr = { 4, 12, 5, 3 };
		int temp;

		for (int i = 0; i <= arr.length - 1; i++) {

			for (int j = 0; j <= arr.length - i - 1; j++) {

				if (arr[j] > arr[j + 1]) {

					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}
		}

		for (int k : arr) {
			System.out.println(k);

		}
		
		

	}

}
