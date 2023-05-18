package com.pct.sup;

public class ThisKeywordDemo {

	//This keyword is a reference variable that refers to the current object

	//Instance variable are global variables eg, String s=Glory   int x=10   int y=1
	
	
	int x = 20;
	int y = 30;
	String s = "Glory";

	public ThisKeywordDemo() {
		System.out.println("default");
	}

	public ThisKeywordDemo(int x, int y)
	{
		this.x=x;  //refers to the instance variable x
	    this.y=y ;  //refers to the instance variable y
	    System.out.println(x+y);
	    System.out.println("default");
	}

	public static void main(String[] args) {

		ThisKeywordDemo tk = new ThisKeywordDemo(2,3);
		tk.getData();
	}

	public void getData() {

		System.out.println(this.x + this.y); // it refers to the instance variable
	}

	public void getData1() {
//		int x = 50;
//		int y = 40;
//		System.out.println(this.x + this.y);
//		System.out.println(x + y);

	}
}
