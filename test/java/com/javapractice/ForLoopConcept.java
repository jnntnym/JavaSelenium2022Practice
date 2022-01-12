package com.javapractice;

public class ForLoopConcept {

	public static void main(String[] args) {

		// print 1 to 100
		
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
			
		}System.out.println("----------");
		
		// print 100 to 1
		
		for (int j = 100; j>=1; j--) {
			System.out.println(j);
		}System.out.println("----------");
		
		// print 1,3,5 to 100
		
		for (int k = 1; k<=100; k+=2) {
			System.out.println(k);
		}System.out.println("----------");
		
		// print 99, 97, 95 to 1
		
		for (int l =99; l>=1; l-=2) {
			System.out.println(l);
		}System.out.println("----------");
				
		// print 0,2,4 to 100
		
		for (int m =0; m<=100;m+=2) {
			System.out.println(m);
		}System.out.println("----------");
				
		// print 100,98,96 to 0
		
		for (int n =100; n>=0;n-=2) {
			System.out.println(n);
		}System.out.println("----------");
		
		// print 100 too 200 by 10 interval
		
		for (int o =100; o<=200;o+=10) {
			System.out.println(o);
		}System.out.println("----------");
		
	}

}
