package com.javapractice;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {

		ArrayList<Integer> li = new ArrayList<>();
		li.add(34);
		li.add(33);

		for (int i = 0; i < li.size(); i++) { // for loop
			System.out.println(li.get(i));
		}
		System.out.println("***********");

		for (int i : li) { // for each loop
			System.out.println(i);
		}

	}

}
