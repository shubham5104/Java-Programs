package com.interview.prep;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=13;
		int count=0;
		
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count == 2)
		{
			System.out.println(n+" is prime No");
		}
		else
		{
			System.out.println(n +" is Not Prime No");
		}
		

	}

}
