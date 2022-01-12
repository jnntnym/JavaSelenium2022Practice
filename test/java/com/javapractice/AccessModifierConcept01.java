package com.javapractice;

public class AccessModifierConcept01 {

	public static void test1() {
		System.out.println("This is Public Access Modifier > Same Project");
		
	}
	
	private static void test2() {
		System.out.println("This is Private Access Modifier > Same Class");
		
	}
	
	protected static void test3() {
		System.out.println("This is Protected Access Modifier > Same Package");
		
	}
	
	static void test4() {
		System.out.println("This is default Access Modifier > Same Package");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		test1();	// Same Project
		test2(); 	// Same Class
		test3(); 	// Same Package
		test4(); 	// Same Package
		
	}

}
