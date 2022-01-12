package com.javapractice;

import java.util.ArrayList;

public class ArrayList_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> cars = new ArrayList<String>();	// Cmnd+Shift+O = import class
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");

	    System.out.println(cars);
	   
	   for (int i = 0; i < cars.size(); i++) {
	        System.out.println(cars.get(i));
	      }
	   
	    for (String i : cars) {
	        System.out.println(i);
	      }
	   
	    System.out.println(cars.size());
	   
	    System.out.println(cars.get(0));
	   
	    cars.set(0, "Opel");
	    System.out.println(cars);
	   
	    cars.remove(0);
	    System.out.println(cars);
	   
	    cars.clear();
	    System.out.println(cars);

	}

}
