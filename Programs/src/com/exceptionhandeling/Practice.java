package com.exceptionhandeling;

public class Practice {

	public static void main(String[] args) {
		try {
		
			checkAge(17);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
	}
	static void checkAge(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Age is Less than 18");
		}
		else
			System.out.println("You are Eligible for Driving Lisence");
	}

}
