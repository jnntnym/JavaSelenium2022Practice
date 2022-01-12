package com.javapractice;

public class NarrowingCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double myDouble = 9.78d;
	    int myInt = (int) myDouble; // Manual casting: double to int
	    
	    double myFloat = 10.12345678945645687987d;
	    System.out.println(myFloat);
	    
	    System.out.println(myDouble);   // Outputs 9.78
	    System.out.println(myInt);      // Outputs 9
	  }

}
