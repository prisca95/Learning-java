package com.pct.sup;

public class Child extends Parent {

	public Child()   // To define an explicit constructor
	{
		super(4);
	}
	
	
	String empName = "Abby";
	int empNo = 67878;
	
	public static void main(String[] args) {
		Child c = new Child();
				c.getData();
	}
	
	public void getData()
	{
//		super.getData();  //This keyword calls out the variable "getData" from the "parent class"
		//OR
//	System.out.println(super.empName);
//	System.out.println(super.empNo);
		
//	System.out.println(empName); //This calls out the variable "getData" from the "Child class"
//	System.out.println(empNo);
	}
	
}
