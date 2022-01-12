package com.javapractice;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListConcept {

	public static void main(String[] args) {
		// List Concept, dynamic issue, size not fixed
		
		List<Integer> ab = new ArrayList<>();
		
		ab.add(10);
		ab.add(20);
		ab.add(30);
		ab.add(40);
		ab.add(50);
	
//		System.out.println(ab.get(1));	// print by index 
		System.out.println(ab);			// print all in a single line

		ab.add(60);						// we can add any time 
		ab.add(70);
		ab.add(80);
		
		System.out.println(ab);					// print all in a single line

		
//		for (int x = 0; x < ab.size(); x++) {	// print all in a multiple line
//			System.out.println(ab.get(x));
//			
//		}
//		
		Iterator<Integer> z = ab.iterator();		// to print up to next/last number
		while (z.hasNext()) {
			System.out.println(z.next());
			
		}
		
	}

}
