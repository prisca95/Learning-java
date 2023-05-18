package com.pct.sup;

public class Parent {

	public Parent()   // To define an explicit constructor
	{
		System.out.println("parent constructor");
	}
	
	public Parent(int i)   // To define an explicit constructor 2.
	{
		System.out.println("Parameterized construction");
	}
	
	String empName = "Tom";
	int		empNo = 34545;
			
	public void getData()
	{
		System.out.println(empName);
		System.out.println(empNo);
	}
			
}
