package com.javapractice;

public class DoWhileLoopConcept {

	public static void main(String[] args) {
		
	//	Print 100 to 200 by 10 interval
		
		int i =100;
		do {
			System.out.println(i);
			i=i+10;
		} while (i<=200);
	
		System.out.println("\n");
	
	//	Print testing do while
		
			int j =201;	// Do while didn't check the 1st condition, it print then check from 2nd 								condition
			do {
				System.out.println(j);
				j=j+10;
			} while (j<=200);
	
		}
	}
