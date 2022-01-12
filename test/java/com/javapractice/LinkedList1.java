package com.javapractice;

import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
	    LinkedList<String> cars = new LinkedList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    
	  
	    cars.addFirst("Honda");
	    cars.addLast("Toyota");
	    
	    System.out.println(cars);
	    System.out.println(cars.getFirst());
	    cars.removeFirst();
	    System.out.println(cars.getLast());
	    cars.removeLast();
	    System.out.println(cars);
	    System.out.println(cars.get(2));
	    
	  }
	

}
