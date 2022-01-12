package com.javapractice;

public class OperatorConcept {

	public static void main(String[] args) {
		
		int a= 100;
		int b= 400;
		int c= 200;
		int z =400;
		
		System.out.println(a+b+c);
		System.out.println(a+" "+b+" "+c);
		
		System.out.println(b-a);
		System.out.println(c*a+b);
		
		int d;
		d=455;
		System.out.println(d);
		
		System.out.println(a==b);
		System.out.println(b==z);
		
		boolean bl=a==c;
		System.out.println(bl);
		
		// ==, >, <, <=, >=
		
		System.out.println(b>a);
		System.out.println(b<a);
		System.out.println(b<=z);
		System.out.println(a>=z);
		
		
		
		System.out.println(a==b && b==z); //  both condition need to be true
		
		System.out.println(a==b || b==z); // if  one condition is true, return true
		
		
		
		
		
		
		
		

	}

}
