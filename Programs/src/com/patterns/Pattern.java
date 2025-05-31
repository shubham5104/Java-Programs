package com.patterns;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pattern.pattern3();
	}
	
//	*****
//	****
//	***
//	**
//	*
	static void pattern1() {
		
	for(int i=0;i<5;i++)
	{
		for(int j=5;j>i;j--)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	}
	
//	*****
//	 4321
//	  333
//	   21
//	    1
	
	static void pattern2()
	{
		for(int i=5;i>0;i--)
		{
			for(int k=i;k<5;k++)
			{
				System.out.print(" ");
			}
			for(int j=i;j>0;j--)
			{
				if(i==5)
					System.out.print("*");
				else if(i==3)
					System.out.print("3");
				else
					System.out.print(j);
			}
			System.out.println();
		}
	}
	static void pattern2mat() {
		
		for(int i=5;i>0;i--)
		{
			for(int j=5;j>0;j--)
			{
				if(j>i)
					System.out.print(" ");
				else if(j<=i && i==3)
					System.out.print("3");
				else if(i==5)
					System.out.print("*");
				else
					System.out.print(j);
				
			}
			System.out.println();
		}
	}
	
	
	static void pattern3()
	{
		for(int i=5;i>=1;i--)
		{
			for(int k=5;k>i;k--)
			{
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--)
			{
				if(i==5)
				{
					System.out.print("*");
				}
				else if(i==3)
				{
					System.out.print("3");
				}
				else
				{
					System.out.print(j);
				}
			}
			System.out.println();
		}
	}
}
