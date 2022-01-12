package com.javapractice;

import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args) {
		// Create a HashMap object called capitalCities
		HashMap<String, String> capitalCities = new HashMap<String, String>();

		// Add keys and values (Country, City)
		capitalCities.put("England", "London");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("USA", "Washington DC");
		System.out.println(capitalCities);

		System.out.println(capitalCities.size());

		System.out.println(capitalCities.get("England"));

		// capitalCities.remove("England");

		// capitalCities.clear();

		// Print keys
		//for (String i : capitalCities.keySet()) {
		//	System.out.println(i);
		//}

		// Print values
		//for (String k : capitalCities.values()) {
			//System.out.println(k);

		// Print keys and values
		for (String j : capitalCities.keySet()) {
			System.out.println("key: " + j + " value: " + capitalCities.get(j));
		}

		//}

	}

}
