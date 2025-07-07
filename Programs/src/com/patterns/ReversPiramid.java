package com.patterns;

import java.util.Arrays;

public class ReversPiramid {

	public static void main(String[] args) {
		
		int[] arr= {2,1,0,2,1,0,0,1,2,0};
		
//		int n=arr.length;
//		
//		int[] narr=new int[n];
//		int count=0;
//		
//		for(int i=0;i<n;i++)
//		{
//			if(arr[i]!=0)
//			{
//				narr[count]=arr[i];// 
//				count++;
//			}
//		}
		Arrays.sort(arr);
		for(int a:arr)
		{
			System.out.print("  "+a);
		}
		
		
		
		
//		for(int i=0;i<5;i++)
//		{
//			for(int k=0;k<=i;k++)
//			{
//				System.out.print(" ");
//			}
//			for(int j=i;j<5;j++)
//			{
//				System.out.print(" * ");
//			}
//			System.out.println();
//		}
//		

	}

}
