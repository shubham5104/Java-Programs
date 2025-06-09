package com.patterns;

public class StarPatterns {

	public static void main(String[] args) {

		StarPatterns.triAngle2();


	}
		
	static void triAngle1() {
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void triAngle2() {
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int k=i;k<=n;k++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}
	static void box() {
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(i==0||j==0||j==4||i==4)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();	
		}
	}
	
	
	static void patternX() {
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				if(i==j||i+j==9)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}


