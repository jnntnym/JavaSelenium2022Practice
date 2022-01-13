package com.encapsulation;

public class Encapsulation1 {
	
	private String name; // private = restricted access

	  // Getter
	  public String getName() {
	    return name;
	  }

	  // Setter
	  public void setName(String newName) {
	    this.name = newName;
	  }

	public static void main(String[] args) {
		Encapsulation1 myObj = new Encapsulation1();
	    myObj.setName("John"); // Set the value of the name variable to "John"
	    System.out.println(myObj.getName());
	  }
	

}
