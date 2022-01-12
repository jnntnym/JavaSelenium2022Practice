package com.javapractice;

import java.util.Arrays;

public class Array_03 {

	public static void main(String[] args) {
		//  Array and For loop and For each loop
		
		int[] a = new int [4];
		
		a[0]= 34;
		a[1]= 35;
		a[2]= 36;
		a[3]= 37;

// 		select + Comnd + / = all Comment out
//		System.out.println(a[2]);

		System.out.println(Arrays.toString(a)); //to print all in a single line
		
//		for (int i = 0; i < a.length; i++) {	// to print all line  by line
//			System.out.println(a[i]);
//			
//		}
		
		// for each method
//		
//		for (int j : a) {			// to print all line  by line
//			System.out.println(j);
//		}
		
		int [] b = {10, 20, 30, 40, 50};	// another way to store value in Array without size
		
//		System.out.println(b[3]);
		
//		for (int k = 0; k < b.length; k++) {
//			System.out.println(b[k]);
//		}
		
		for(int l : b) {
			System.out.println(l);
			
			
		}
		
		
		
		
	}

}
