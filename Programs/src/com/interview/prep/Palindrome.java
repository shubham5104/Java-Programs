package com.interview.prep;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=121;
		int sum=0;
		int temp=n;
		
		while(temp>0)
		{
			int rem=temp%10;
			sum=sum*10+rem;
			temp/=10;
			
		}
		if(sum==n)
		{
			System.out.println(n+" is palindrome");
		}
		else
		{
			System.out.println(n+" is not palindrome");
		}
		

	}

}
