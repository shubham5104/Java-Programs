package com.interview.prep;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=10;
		int n1=0;
		int n2=1;
		System.out.print(n1+" "+n2+" ");
		for(int i=1;i<=n-2;i++)
		{
			int sum=n1+n2;
			n1=n2;
			n2=sum;
			System.out.print(sum+" ");
		}
	}

}
