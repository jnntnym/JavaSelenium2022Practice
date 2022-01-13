package com.inheritance;

public final class InheritFinalVehicle {
	
	int y = 10;
	static int x = 20;
	
	
	public  void final1() {
	System.out.println(y);
	}
	
	public static void final2() {
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		InheritFinalVehicle ab = new InheritFinalVehicle();
		ab.final1();
		//ab.y=15;
		System.out.println(ab.y);
		InheritFinalVehicle.final2();
		//InheritFinalVehicle.x;
	}
}


	
		
