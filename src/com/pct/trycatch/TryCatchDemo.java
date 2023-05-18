package com.pct.trycatch;

public class TryCatchDemo {
//In case of errors or exception e.g division by zero
	public static void main(String[] args) {

		try {  //Data set is placed here

			int i = 8;
			System.out.println("Before division");
			System.out.println(i / 2);
		} catch (Throwable t) {  //in case of an exception it will be caught in the catch block
			System.out.println(t.getMessage());
			System.out.println(t.getCause());
			System.out.println(t.getStackTrace());
			t.printStackTrace();

		} finally {   //The finally keyword clean up the data
			System.out.println("This is finally block");
		}
		System.out.println("After division");
	}

}
//set up data
//execute the data
//clean up the data