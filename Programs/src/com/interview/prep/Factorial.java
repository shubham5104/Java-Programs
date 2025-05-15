package com.interview.prep;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(fact(5));
		
	}
	static int fact(int n) {
		int fac=1;
		for(int i=n;i>=1;i--)
		{
			fac*=i;
		}
		return  fac;
	}
	
	static int factorial(int num) {
		
		if(num==1||num==0)
		{
			return 1;
		}
		return num*factorial(num-1);
	}

}
