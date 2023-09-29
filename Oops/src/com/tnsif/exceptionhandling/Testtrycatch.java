package com.tnsif.exceptionhandling;

public class Testtrycatch {

	public static void main(String[] args) {
		try 
		{
		//int data = 40/0;
		//without the problem
		int data=50/5;
		}
		catch(ArithmeticException e)
		{
		e.printStackTrace();
		System.out.println("the denominator must be greater than 0");
		}
		finally {
			System.out.println("simply finally block");
		}
		System.out.println("rest of the code..." );
	}
}
