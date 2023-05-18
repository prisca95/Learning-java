package com.pct.constructors;

public class ConstructorExamples {
//No return type
	//Same name as the class name
	
	public ConstructorExamples() {
		System.out.println("No argument constructor");
	}
	
	public ConstructorExamples(int i) {
		System.out.println("Integar constructor");
	}
	
	public ConstructorExamples(int i, int y) {
	System.out.println("2 Integar constructor");
	}
	
	public ConstructorExamples(String s) {
	System.out.println("String constructor");
	}
		
	

	public static void main(String[] args) {

		ConstructorExamples ce = new ConstructorExamples(9, 7);
	}

}
