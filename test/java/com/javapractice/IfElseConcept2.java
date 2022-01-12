package com.javapractice;

public class IfElseConcept2 {

	public static void main(String[] args) {

		int wallet = 100;
		
		int store1=200;
		int store2=150;
		int store3=100;
		int store4=90;
		
	
		if (wallet==store1 && wallet>=store1) {	// && both conditions need to be true
			System.out.println("buy from store1");
			
		}
		else if (wallet==store2 && wallet>=store2) {
			System.out.println("buy from store2");
			
		}
		else if (wallet==store4 && wallet>=store4) {
			System.out.println("buy from store4");
		}
		else if (wallet==store3 && wallet>=store3) {
			System.out.println("buy from store 3");
		}
			
		else {
			System.out.println("I can not buy");
		}
			
		}

}
