package com.pct.final1;

public class Child extends Parent{

public final int i = 10;   //instance variable
//we use the "final" keyword when you don't want the particular values (of that particular instance variable)to be changed by any class that is extending the parent class

public static void main(String[] args) {
	
	Child c = new Child();
	System.out.println(c.i);
	//c.i=30;
	System.out.println(c.i);
	c.setData();
}

//public void setData() {
//	System.out.println(i);
//}

}

