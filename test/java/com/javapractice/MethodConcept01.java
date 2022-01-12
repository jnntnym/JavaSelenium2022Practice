package com.javapractice;
/*
 * This is Static and Non Static Variables and Methods Concept
 * 
 * */

public class MethodConcept01 {

	int a=10;			// non static variable 
	
	static int b=20;	// static variable
	
	public static void main(String[] args) {	// This is Main Method. Entry point of Java
	
	//	VARIABLES
	//	System.out.println(a);	// we can't directly call  non static variable / method from outside under main static method; here error
		System.out.println(b);	// we can directly call static variable / method under static main method
	//	System.out.println(c);	// we can't directly call it, either we will make it class level static variable, like int b
	
	// METHODS
		test1();				// directly call static method under main method
	//	test2();				// we can't directly call it, either we will make it class level, Error shows
		
		MethodConcept01 con = new MethodConcept01();
		con.test2();			// made it class references and called it under main static method
		con.test1(); 			// indirectly: The static method test1() from the type MethodConcept01 should be accessed in a static way
		
		System.out.println(con.a);	// indirectly called by making ref. level variables
		System.out.println(con.b);	// indirectly called by making ref. level variables
		System.out.println("**********************");
		
	}
	
	public static void test1() {// This is a static method
		int c= 30;				// static variable not allowed inside this method but allowed class level static variable
		System.out.println(c);
		System.out.println("This is a static method "+b+","+c);
		System.out.println("This is a static method "+(b+c));
		System.out.println("**********************");
	}
	
	public void test2() {		// This is a non static method
		int d = 40; 			// static variable not allowed inside this method
		
		System.out.println(d);	// non static method allowed non static variable from both inside and out side and static variable from class level
		System.out.println("This is a non static method "+b+","+a+","+d);// b= static, a= non static class level, d= non static
		System.out.println("**********************");
	}

}
